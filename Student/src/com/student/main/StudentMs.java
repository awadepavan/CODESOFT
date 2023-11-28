package com.student.main;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade='" + grade + '\'' +
                '}';
    }
}

class StudentManagementSystem {
    private ArrayList<Student> studentList;

    // Constructor
    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to remove a student
    public void removeStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                studentList.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Method to search for a student
    public void searchStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Method to display all students
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("List of all students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}

public class StudentMs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        StudentManagementSystem system = new StudentManagementSystem();

	        while (true) {
	            System.out.println("Student Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Search for Student");
	            System.out.println("4. Display All Students");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student roll number: ");
	                    int rollNumber = scanner.nextInt();
	                    scanner.nextLine(); // Consume the newline character
	                    System.out.print("Enter student grade: ");
	                    String grade = scanner.nextLine();

	                    Student newStudent = new Student(name, rollNumber, grade);
	                    system.addStudent(newStudent);
	                    break;

	                case 2:
	                    System.out.print("Enter roll number of student to remove: ");
	                    int rollToRemove = scanner.nextInt();
	                    system.removeStudent(rollToRemove);
	                    break;

	                case 3:
	                    System.out.print("Enter roll number of student to search: ");
	                    int rollToSearch = scanner.nextInt();
	                    system.searchStudent(rollToSearch);
	                    break;

	                case 4:
	                    system.displayAllStudents();
	                    break;

	                case 5:
	                    System.out.println("Exiting the application. Goodbye!");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        }
	}
}
