package com.javaprogramming.com;

public class Employee   {
	
	String eName;
	int eno;
	int eMark;
	
	
	public Employee(String eName,int eno,int eMark) {
		
		this.eName=eName;
		this.eno=eno;
		this.eMark=eMark;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	public Integer geteMark() {
		return eMark;
	}


	public void seteMark(int eMark) {
		this.eMark = eMark;
	}


	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eno=" + eno + ", eMark=" + eMark + "]";
	}


	
	
	
	

}
