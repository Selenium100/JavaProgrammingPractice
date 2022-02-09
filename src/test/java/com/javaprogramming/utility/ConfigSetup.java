package com.javaprogramming.utility;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class ConfigSetup {
	
	public static HashMap<String, String> setDataPath() throws FileNotFoundException{
		return new TextFileUtils("./config.txt").getdata();
	}

}
