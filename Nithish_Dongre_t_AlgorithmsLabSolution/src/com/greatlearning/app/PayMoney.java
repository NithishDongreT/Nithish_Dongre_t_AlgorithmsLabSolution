/**
 * 
 */
package com.greatlearning.app;

import java.util.Scanner;

/**
 * @author NithishDongreT
 *
 */
public class PayMoney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		
		System.out.println("Please enter the size of the array");
		int size = sc.nextInt();
		int[] transaction = new int[size];
		
		System.out.println("Enter values of Array");
		
		for (int i = 0;i<size; i++) {
			transaction[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets that needs to be achived");
		int target = sc.nextInt();
		if (target > size) {
			System.out.println("Please Enter the targets that is small than size");
		}
		
		do {
			System.out.println("Enter the value of target");
			int value = sc.nextInt();
			int sum = 0;
			int index = -1;
			for (int i = 0;i<size; i++) {
				sum = sum + transaction[i];
				if(sum >= value) {
					index = i+1;
					break;
				}
			}
			if (index > -1 && index <= target) {
				System.out.println("Target is achived after "+ index+ " transactions");
			}
			else {
				System.out.println("Given target is not achived");
			}
			System.out.println("If completed please enter option 0 or else to continue please enter 1");
			option = sc.nextInt();

		} while (option != 0);
		

	}

}
