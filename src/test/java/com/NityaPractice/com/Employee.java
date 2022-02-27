/**
 * 
 */
package com.NityaPractice.com;

/**
 * @author d955012
 *
 */
public class Employee {
	
	String ename;
	int esalary;
	int empno;
	String edept;
	
	
	public Employee(String ename,int esalary,int empno,String edept) {
		
		this.ename=ename;
		this.esalary=esalary;
		this.empno=empno;
		this.edept=edept;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEdept() {
		return edept;
	}


	public void setEdept(String edept) {
		this.edept = edept;
	}


	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esalary=" + esalary + ", empno=" + empno + ", edept=" + edept + "]";
	}
	
	
	

}
