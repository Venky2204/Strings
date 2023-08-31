package com.kn.StringInbuiltMethods;

public class StringInbuiltMethods {

	public static void main(String[] args) {
		String s1 = "VENKY";
		
		System.out.print("Character at Given Index : ");
		System.out.println(s1.charAt(2));
		System.out.println("______________________________________________________________________________");
		System.out.print("Index of given character first time : ");
		System.out.println(s1.indexOf('E'));//case sensitive"
		System.out.println("______________________________________________________________________________");
		System.out.print("Index of given character last time : ");
		System.out.println(s1.lastIndexOf("E"));//case sensitive
		System.out.println("______________________________________________________________________________");
		System.out.print("Sequence of character of given String contains or not : ");
		System.out.println(s1.contains("E"));//case sensitive
		System.out.println("______________________________________________________________________________");
		System.out.print("Convert all characters to UpperCase : ");
		System.out.println(s1.toUpperCase());
		System.out.println("______________________________________________________________________________");
		System.out.print("Convert all characters to LowerCase : ");
		System.out.println(s1.toLowerCase());
		System.out.println("______________________________________________________________________________");
		System.out.println("Convert String to CharArrray");
		char s[] = s1.toCharArray();	
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s[3]);
		System.out.println("______________________________________________________________________________");
		System.out.println(s1.startsWith("V"));
		System.out.println(s1.startsWith("v"));
		System.out.println(s1.startsWith("e"));
		System.out.println("______________________________________________________________________________");
		String s2 = s1.replace("ENKY", "enky");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("______________________________________________________________________________");
		System.out.println(s1.replaceAll(s1, s2));
		System.out.println("______________________________________________________________________________");
		
		String s3 = "Jai Sree Ram";
		String s4[] = s3.split(" ");
		for (String string : s4) {
			System.out.println(string);
		}
		System.out.println("______________________________________________________________________________");
		
		String s5 = "  Delete unwanted spaces   ";
		System.out.println(s5.trim());
		System.out.println("______________________________________________________________________________");
		String s6 = "Venkatesh";
		System.out.println(s6.substring(3));
		System.out.println(s6.substring(3,6));
		
		
	}

}

