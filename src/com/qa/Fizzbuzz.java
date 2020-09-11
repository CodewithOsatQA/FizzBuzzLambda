package com.qa;

import java.util.ArrayList;

public class Fizzbuzz {

	
	public static void main (String []args) {
		
		ArrayList<Integer> lambdaTest = new ArrayList<>();
		for (int i = 1; i <= 200; i ++) lambdaTest.add(i);
		
		
		lambdaTest.forEach(x -> {
			if (x%3 == 0 && x%5 == 0) {
				System.out.println("FizzBuzz");
				}
			else if (x%5 == 0) {
				System.out.println("Buzz");
			}
			else if(x%3 == 0){ 
				System.out.println("Fizz");
				}
			else {
				System.out.println(x);
			}
			
		
		}
		);
	}
}

