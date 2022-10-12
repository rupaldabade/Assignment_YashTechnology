package com.collection.model;

public class Student {

	int rollno;
	String sname;
	String classname;
	int totalmarks;
	double percentage;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Student(int rollno, String sname, String classname, int totalmarks, double percentage) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
		this.percentage = percentage;
	}
}
