package com.kn.CeaserCipher;

import java.util.Scanner;

public class ConvertCeaser {

	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//Taking inputs
		String inputString = scan.next();
		int key = scan.nextInt();
		
		//call the method and print
		System.out.println(CeaserConvert.encryptKey(inputString,key));
		
		scan.close();
	}

}
