package com.test;

import java.util.Scanner;

import com.entity.Student;
import com.inheritance.Principal;
import com.service.StudentServiceImpl;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating final varibale
		final String schoolName = "SPC";
		
		System.out.println("enter number of students");
		int numberOfStudents=sc.nextInt();
        Student[] students=new Student[numberOfStudents];
		// creatng object of a class
		StudentServiceImpl service = new StudentServiceImpl();

		// creating object of child class
		Principal p = new Principal();

		boolean exitFlag = true;
		do {
			menu();
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				// calling method by creating object of serviceImpl class
				students=service.addStudentDetails(students,numberOfStudents);
				break;
			case 2:
				service.displayAllStudents(students);
				break;
			case 3:
				// calling method by creating object of serviceImpl class
				System.out.println("enter the marks of student to update");
				double prcentage=sc.nextDouble();
				service.updateParticularStu(students, prcentage);
				
				break;
			case 4:
				// calling interafce implemented method
				service.diplayMessage();
				System.out.println("All students belongs to: " + schoolName+ " school");
				break;
			case 5:
				// displaying overriden and overloaded method
				// displaying inherited method from child class
				p.display();
				p.message();
				break;
			case 6:
				exitFlag = false;
				break;
			default:
				System.out.println("Enter correct choice:");

			}
		} while (exitFlag);
	}

	public static void menu() {
		System.out.println("1. add students to college");
		System.out.println("2.Display all students");
		System.out.println("3.update particular student marks");
		System.out.println("4.Call implemented interface method");
		System.out.println("5.Call inherited overriden and overloaded (polymorphism) and inherited method");
		System.out.println("6.exit");

	}
}
