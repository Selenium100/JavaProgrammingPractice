/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentArrayList {

	
	public static void main(String[] args) {
		
		Student s1=new Student("nitya", 150, 100);
		Student s2=new Student("abhay", 160, 90);
		Student s3=new Student("viswa", 170, 80);
		Student s4=new Student("bikash", 180, 70);
		Student s5=new Student("abhishek", 190, 30);
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		List<Student> sortedStudentList=studentList.stream().sorted((i,j) -> i.getSname().compareTo(j.getSname())).collect(Collectors.toList());
        
		System.out.println(sortedStudentList);
	}

}
