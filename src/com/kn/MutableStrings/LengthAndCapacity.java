package com.kn.MutableStrings;

public class LengthAndCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("RAM");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("______________________________________________________________________________");
		
		sb.append(" Seetha");//7b
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("______________________________________________________________________________");
		
		sb.append(" Seetha");
		sb.append(" Seetha");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("______________________________________________________________________________");
		
		
		
	}

}
