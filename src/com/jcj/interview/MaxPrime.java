package com.jcj.interview;

public class MaxPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		System.out.println(largestPrimeFactor(n));
	}

	public static int maxPrime(int n) {
		if(n % 2 == 0)
		{
			n = n-1;
		}
		
		for (int i = n; i > 1; i = i-2) {
			if (isPrime(i)) {
				return i;
			}
		}

		return Integer.MIN_VALUE;
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	/** * @return largest prime factor of a number */
	public static int largestPrimeFactor(long number) {
		int i;
		long copyOfInput = number;
		for (i = 2; i <= copyOfInput; i++) {
			if (copyOfInput % i == 0) {
				copyOfInput /= i;
				i--;
			}
		}
		return i;
	}

}
