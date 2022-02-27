/**
 * 
 */
package com.prractice.com;


public class Student {
	
	String sname;
	int rollno;
	int mark;
	
	
	public Student(String sname,int rollno,int mark) {
		
		this.sname=sname;
		this.rollno=rollno;
		this.mark=mark;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", mark=" + mark + "]";
	}
	
	

}
