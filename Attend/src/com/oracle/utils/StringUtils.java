package com.oracle.utils;

import java.util.regex.Pattern;

public class StringUtils {
	public static boolean isEmpty(String str) {
		if (str==null || str.trim().isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	/*
	  * 判断是否为整数 
	  * @param str 传入的字符串 
	  * @return 是整数返回true,否则返回false 
	*/


	  public static boolean isInteger(String str) {  
	    Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	    return pattern.matcher(str).matches();  
	  }


}
