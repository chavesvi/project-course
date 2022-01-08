package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Instructor;
import entities.User;
import services.Course;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Instructor x = new Instructor();
		
		System.out.print("How many students for course A? ");
		int num = sc.nextInt();
		Set<User> user = new HashSet<>();
		for (int i=0; i<num; i++) {
			user.add(new User(sc.nextInt()));
		}
		x.addCourse(new Course("A", user));
		
		System.out.print("How many students for course B? ");
		num = sc.nextInt();
		Set<User> user2 = new HashSet<>();
		for (int i=0; i<num; i++) {
			user2.add(new User(sc.nextInt()));
		}
		x.addCourse(new Course("B", user2));
		
		System.out.print("How many students for course C? ");
		num = sc.nextInt();
		Set<User> user3 = new HashSet<>();
		for (int i=0; i<num; i++) {
			user3.add(new User(sc.nextInt()));
		}
		x.addCourse(new Course("C", user3));
		
		System.out.println("Total students: " + x.quantTotalStudents());
		
		sc.close();

	}

}
