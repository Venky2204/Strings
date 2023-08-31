package com.kn.IpAdress;

public class ValidIpAdress {

	public static boolean validIpAdress(String ipAdress) {

		String srr[] = ipAdress.split("\\.");

		if (srr.length != 4) {
			return false;
		}

		// String srr[] = new String[4];
//		StringBuffer s = new StringBuffer();
//		int j = 0;
//		for (int i = 0; i < ipAdress.length(); i++) {
//			if (ipAdress.charAt(i) != '.') {
//				s.append(ipAdress.charAt(i));
//				if (j == 3) {
//					srr[j] = new String(s);
//				}
//			} else {
//				srr[j] = new String(s);
//				j++;
//				s.delete(0, i);
//			}
//		}

		for (int i = 0; i < srr.length; i++) {

			int integer = Integer.parseInt(srr[i]);

			if (integer < 0 || integer > 255) {
				return false;
			} else {
				continue;
			}
		}
		return true;

	}

}
