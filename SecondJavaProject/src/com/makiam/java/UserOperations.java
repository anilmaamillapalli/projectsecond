package com.makiam.java;

public class UserOperations {
	
	public String concat(String str1,String str2){
		 String str3=str1.concat(str2);
		 return str3;
	}
	
	public int strLength(String str1){
		return str1.length();
	}
	
	public boolean strfind(String str1,String findStr){
		CharSequence str=findStr;
		return str1.contains(str);
	}
	
	public static void main(String[] args){
		UserOperations up= new UserOperations();
		System.out.println("concat value:"+up.concat("anil", "kumar"));
		System.out.println("boolean value:"+up.strfind("anilkumar", "ilk"));
		System.out.println("length :"+up.strLength("anilkumarmaamillapalli"));
		
		
	}

}
