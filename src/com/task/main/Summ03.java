package com.task.main;

public class Summ03 {

	public static void main(String[] args) {
		System.out.println("Resultation-->");
		
		
		System.out.println(sq02(20)*res(20));

	}

	public static double res(double n) {

		double d = 0.5;
		double sumrad = 0;
		for (int i = 1; i <= n; i++) {
			sumrad += (Math.sin((i * d) / 2) + Math.sin((i * d - 1) / 2)) / Math.pow(Math.E, (d - 1) / i);
		}
		return sumrad;
	}

	public static double sq02(double n) {
		return Math.sqrt(Math.PI * n);
	}
}
