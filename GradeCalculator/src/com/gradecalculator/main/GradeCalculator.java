package com.gradecalculator.main;

import java.util.Scanner;

public class GradeCalculator {
	 public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the total number of Subject:-");
			int n = sc.nextInt();
			
			System.out.println("Please enter the total Subject Marrks:-");
			
			int [] marks = new int[n];
			
			//input of marks from user
			for(int i=0;i<n;i++) {
				int k = i+1;
				System.out.println("mark of subject "+k+":-");
				marks[i]=sc.nextInt();
				
				if(marks[i]>100) {
					System.out.println("please enter again");
					marks[i]=sc.nextInt();
				}
			}
			
			//Adding the number
			int  sum =0;
			
			for(int i=0;i<n;i++){
				sum = sum + marks[i];
			}
			
			// total percentage
			float sums = sum;
			float percentage = 0.0f;
			
			percentage = sums/n;
			
			
			if(percentage < 40 ) {
				System.out.println("You are Fail And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
			}
			else if(percentage >= 40 && percentage <=60 ) {
				System.out.println("You are pass And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
				System.out.println("Your Grade is :-D");
			}
			else if(percentage > 60 && percentage <=70 ) {
				System.out.println("You are pass And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
				System.out.println("Your Grade is :-c");
			}
			else if(percentage >70 && percentage <=80 ) {
				System.out.println("You are pass And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
				System.out.println("Your Grade is :-B");
			}
			else if(percentage > 80 && percentage <=90 ) {
				System.out.println("You are pass And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
				System.out.println("Your Grade is :-A");
			}
			else  {
				System.out.println("You are pass And You Percentage is "+" "+" "+percentage+" and total marks is"+" "+sum);
				System.out.println("Your Grade is :-O");
			}

		}
}
