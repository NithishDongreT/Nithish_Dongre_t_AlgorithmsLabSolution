package com.greatlearning.app;


import java.util.Arrays;
import java.util.Scanner;

public class Traveler_problem {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations");
		int size = sc.nextInt();
		
		int[] denominations = new int[size];
		int[] number = new int[size];
		Arrays.fill(number, 0);
		int sum = 0;
		
		System.out.println("Enter the currency denominations value");
		for (int i=0;i<size;i++) {
			denominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		bubbleSort(denominations);
		
		
		for (int i=0;i<size;i++) {
			if(amount >= denominations[i]) {
				number[i] = amount / denominations[i];
				amount = amount - (denominations[i]*number[i]);
			}
		}
		
		
		if (amount > 0) {
			System.out.println("Not possible to ppay the ammount");
		} else {
			System.out.println();
			System.out.println();

			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < size; i++) {
				if (number[i] > 0) {
					System.out.println(denominations[i] + " : "+number[i]);
				}
			}
		}
		
		
	}
	
	 private static void bubbleSort(int[] intArray) {
		 		 
		 int n = intArray.length;
		 int temp = 0;
		 
		 for(int i=0; i < n; i++){
			 for(int j=1; j < (n-i); j++){
				 if(intArray[j-1] < intArray[j]){
					 temp = intArray[j-1];
					 intArray[j-1] = intArray[j];
					 intArray[j] = temp;
				 }
		 
			 }
		 }
		 
	 }

}
