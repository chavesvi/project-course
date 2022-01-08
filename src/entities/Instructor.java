package entities;

import java.util.HashSet;
import java.util.Set;

import services.Course;

public class Instructor {

	private Set<Course> courses = new HashSet<>();

	public Instructor() {
	}

	public Instructor(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourse(Course course) {
		courses.remove(course);
	}

	public Integer quantityCourse() {
		int num = 0;
		for (@SuppressWarnings("unused")
		Course c : courses) {
			num += 1;
		}
		return num;
	}

	public Integer quantityStudentsCourse(String name) {
		for (Course c : courses) {
			if (c.getName().equals(name)){
				return c.quantityStudents();
			}
		}
		return null;
	}

	public Integer quantTotalStudents() {
		Set<User> students = new HashSet<>();
		int num = 0;
		for (Course c : courses) {
			students.addAll(c.getStudents());
		}
		for (@SuppressWarnings("unused") User u : students) {
			num += 1;
		}
		return num;
	}

}
