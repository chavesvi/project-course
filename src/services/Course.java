package services;

import java.util.HashSet;
import java.util.Set;

import entities.User;

public class Course {
	
	private String name;
	private Set<User> students = new HashSet<>();
	
	public Course() {
	}

	public Course(String name, Set<User> students) {
		this.name = name;
		this.students = students;
	}

	public Set<User> getStudents() {
		return students;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addUser(User user) {
		students.add(user);
	}
	
	public void removeUser(User user) {
		students.add(user);
	}
	
	public Integer quantityStudents() {
		int num = 0;
		for (@SuppressWarnings("unused") User u : students) {
			num += 1;
		}
		return num;
	}
	
	

}
