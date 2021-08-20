package com.service;

import java.util.Scanner;

import com.entity.Student;

public class StudentServiceImpl implements StudentService {

	
	static Scanner sc= new Scanner(System.in);

	@Override
	// implementing abstract method
	public void diplayMessage() {
		System.out.println("Welcome to Student Academy");

	}

	// step1:adding new students
	public Student[] addStudentDetails(Student[] student, int numberOfStudents) {
     for (int i = 0; i < numberOfStudents; i++) {

		System.out.println("enter student id");
		int sId=sc.nextInt();
		System.out.println("enter student name");
		String sName=sc.next();
		System.out.println("enter student percentage");
		double sPercentage=sc.nextDouble();
		student[i]=new Student(sId, sName, sPercentage);
		
	}
	return student;
	}
		

	// step2:updating particular student 
	public Student[] updateParticularStu(Student[] student,double prcentage) {
      for (int i = 0; i < student.length; i++) {
		if(student[i].getMarks()==prcentage) {
			System.out.println("enter the marks that you want to update");
			double perc=sc.nextDouble();
			student[i].setMarks(perc);
		}
		displayAllStudents(student);
	}
      return student;
	}
	public static void displayAllStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(
					"student id:" + students[i].getId() + "   name:" + students[i].getName() + "   marks: " + students[i].getMarks());
		}
	}

}
