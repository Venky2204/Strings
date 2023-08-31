package com.kn.IpAdress;

import java.util.Scanner;

public class IpAdress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Ip Adress(format : x.x.x.x)");
		String ipAdress = scan.nextLine();
		
		boolean validity = ValidIpAdress.validIpAdress(ipAdress);
		
		if(validity == true) {
			System.out.println("Valid IP Adress");
		}else {
			System.out.println("InValid IP Adress");
		}
		
		scan.close();
		
		
	}

}
