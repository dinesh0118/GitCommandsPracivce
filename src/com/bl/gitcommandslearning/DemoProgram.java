package com.bl.gitcommandslearning;

import java.util.Scanner;

public class DemoProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size in an array : ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the numbers in an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i]);
			}
		}
		scan.close();

	}

}
