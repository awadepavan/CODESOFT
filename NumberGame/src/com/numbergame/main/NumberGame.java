package com.numbergame.main;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int minRange = 1;
		int maxRange = 100;
		
		int maxattempts = 6;
		
		int Score = 0;
		
		
		boolean playagain = true;
		
		
		while(playagain) {
			System.out.println("Welcome to the gaseing number game! gase the number between 1 to 100");
			boolean guesscorrectlyNumber = false;
			int attempt = 0;
			
			// Genrating the random Number 
			int genraterandomnum = random.nextInt(maxRange - minRange +1);
			
			// using while loop in while loop
			while(attempt < maxattempts && !guesscorrectlyNumber ) {
				System.out.println("Enter your number:-");
				int n = sc.nextInt();
				attempt++;
				
				//checking the number is match or not
				if(n==genraterandomnum) {
					System.out.println("Congratulation! You Won the game");
					guesscorrectlyNumber = true;
					Score++;
				}
				else if(n<genraterandomnum ) {
					System.out.println("Sorry your number is to low");
				}
				else {
					System.out.println("Sorry your number is to high");
				}
			}
			
			if( !guesscorrectlyNumber) {
				System.out.println("Sorry your attempt is over and the number is :-"+genraterandomnum);
			}
			
			System.out.println("Your Score is"+Score);
			System.out.println("Would you like to play again? (Yes/No):");
			String play = sc.next();
			
			
			if(!play.equalsIgnoreCase("Yes")) {
				playagain= false;
			}
			
			
		}
		System.out.println("Thanks for playing the game");
	}
}
