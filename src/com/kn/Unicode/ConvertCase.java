package com.kn.Unicode;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] srr = s.split(" ");
		for (int i = 0; i < srr.length; i++) {
			System.out.print(ToUpperCase.toUpperCase(srr[i])+" ");
		}
		scan.close();
	}

}
