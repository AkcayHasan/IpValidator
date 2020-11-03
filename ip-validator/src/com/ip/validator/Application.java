package com.ip.validator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("IP Adresnizi Girin: ");
		String ip = scanner.nextLine();
		
		String message = IpValidator.validate(ip);
		System.out.println(message);
		
		scanner.close();
		

	}

}
