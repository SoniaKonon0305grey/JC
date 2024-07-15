package com.task.main;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double u = 0.5;
		System.out.println("x = 0.5 --> " + formul(u));
	}

	public static double formul(double x) {
		return Math.sqrt(Math.pow(Math.E, (2.2 * x))) - (Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0))))) + 1.7;

	}

}
