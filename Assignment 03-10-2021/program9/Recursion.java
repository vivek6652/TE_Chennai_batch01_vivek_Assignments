package com.te.Assignment;

public class Recursion {
	
	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

}
