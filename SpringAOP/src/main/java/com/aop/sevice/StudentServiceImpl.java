package com.aop.sevice;

public class StudentServiceImpl implements StudentService{

	public void admit() {
		System.out.println("Admission process strated...");
		
		System.out.println("Admission process end...");
	}

	public void totalStudent(int total) {
		System.out.println("Total student in school ...."+total);
		
	}

}
