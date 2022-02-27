/**
 * 
 */
package com.prractice.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.testng.ITestResult;
import org.testng.annotations.Test;

/**
 * @author d955012
 *
 */
public class RBI implements Cloneable{
	
	
	public void checkBalance() {
		
	}
	
	public void getBalance() {
		
	}
	
	@Test
	public void takescreenshot(ITestResult result) {
		
		
	}
	
	protected Object clone() throws CloneNotSupportedException{
	      return super.clone();
	   }

}


 class HDFC{
	 
	 public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		
		 //Serialiozation
		FileOutputStream fos=new FileOutputStream("Myfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		RBI r=new RBI();
		oos.writeObject(r);
		
		//
		
		
		
		
		
	}
	 
	 
	
	
	
}
