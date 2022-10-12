package com.collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.collection.model.Student;

public class StudentProgram {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> stdList = new ArrayList<Student>();
	static int totalAvg = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter student details ---");
		addDetails();
	}

	private static void addDetails() {

		System.out.println("Do you want to add student details? if yes than press 'y' \n");
		String addChoice = sc.next();
		if(addChoice.equalsIgnoreCase("y")) {

			try {
				studentScanner();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Please enter vaild input filed");
			}
		}else
			showMainMenu();
	}

	private static void studentScanner() throws Exception {

		System.out.println("Enter student roll no - ");
		int rollno = sc.nextInt();
		System.out.println("Enter student name - ");
		String sname = sc.next();
		System.out.println("Enter student class name - ");
		String className = sc.next();
		System.out.println("Enter student total marks out off 500 - ");
		int totalMarks = sc.nextInt();

		double percent = (totalMarks*100)/500;

		totalAvg = totalAvg + totalMarks;
		Student std = new Student(rollno, sname, className, totalMarks, percent);
		stdList.add(std);

		addDetails();
	}

	public static void showMainMenu(){

		System.out.println("--- MAIN MENU ---");
		System.out.println("1. Name of students who secure first, second and third position.");

		stdList.sort(Comparator.comparing(Student::getTotalmarks));
		Collections.reverseOrder(Comparator.comparing(Student::getTotalmarks));



		if(stdList != null) {
			int lastHigh =stdList.get(0).getTotalmarks();
			int rank = 1;
			for(Student stdObj : stdList) {
				if(rank<3) {
					System.out.println("Student Rank " +rank);
					displayDetails(stdObj);

					if(lastHigh != stdObj.getTotalmarks()) {
						rank = rank +1;
					}
				}
				lastHigh = stdObj.getTotalmarks();
			}
		}


				System.out.println("2. Name of those students who’s marks are below 50%.");
				for(Student stdObj : stdList) {
					if(stdObj.getPercentage() < 50) {
						displayDetails(stdObj);
					}
				}
				
				
				System.out.println("3. Name of those students who’s marks are below 35% it means they are fail.");
				for(Student stdObj : stdList) {
					if(stdObj.getPercentage() < 35) {
						displayDetails(stdObj);
					}
				}
				
				System.out.println("4. Name of those students who’s marks are above average score. ");
				double avg = totalAvg/stdList.size();
				for(Student stdObj : stdList) {
					if(stdObj.getTotalmarks() > avg) {
						displayDetails(stdObj);
					}
				}
				
				
				System.out.println("5. Detail of all students on the basis of Name");
				System.out.println("Enter Student name - ");
				String givenName = sc.next();
				for(Student stdObj : stdList) {
					if(stdObj.getSname().equalsIgnoreCase(givenName)) {
						displayDetails(stdObj);
					}
				}
	}

	private static void displayDetails(Student stdObj) {

		System.out.println("Student roll no - "+stdObj.getRollno());
		System.out.println("Student name - "+stdObj.getSname());
		System.out.println("Student class name - "+stdObj.getClassname());
		System.out.println("Student total marks out off 500 - "+stdObj.getTotalmarks());
		System.out.println("Student percentage - "+stdObj.getPercentage()+"\n");
		
	}
}
