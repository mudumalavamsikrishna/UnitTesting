package com.vamsi.junitin5steps;

public class MyMath {

	int sum = 0;

	public int sum(int[] numbers) {
		for (int i : numbers) {
			sum = sum + i;
		}
		return sum;
	}
}
