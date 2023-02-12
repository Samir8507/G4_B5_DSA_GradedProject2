package com.samir.assignment2;

import java.util.Scanner;

public class Skyscraper {
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total number of floors in the building :");
			int n = sc.nextInt();
			int day[] = new int[n+1];
			for (int i= 1; i<=n; i++) {
				System.out.println("Enter the floor on day :" +i);
				int size = sc.nextInt();
				day[size] = i;
				
			}
			int temp = n;
			int flag ;
			System.out.println("The order of construction is as fllows :");
			for (int i=1; i<=n; i++) {
				flag = 0;
				System.out.println("Day" +i+ " :");
				while (temp >= 1 && day[temp] <=i) {
					flag = 1;
					System.out.println(temp+ "");
					temp--;
				}
				if (flag == 1) {
					System.out.println();
				}
			}
		}
		

	}
	}


