package com.javaprogramming.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class TextFileUtils {
	
	String filelocation;
	
	public TextFileUtils(String filelocation){
		this.filelocation=filelocation;
	}
	
	public HashMap<String, String> getdata() throws FileNotFoundException{
		
		HashMap<String, String> stringMap=new HashMap<String, String>();
		
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(new FileReader(filelocation));
		
		
		
		try {
			
			String readLine;
			while((readLine=br.readLine())!=null) {
				
				String[] keyValue=readLine.split("~");
				stringMap.put(keyValue[0], keyValue[1]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return stringMap;
		
	}

}
