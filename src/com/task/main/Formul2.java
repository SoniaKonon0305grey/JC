package com.task.main;

public class Formul2 {

	public static void main(String[] args) {
		int n = 10;
		double a = 0.50;
		double b = 1.00;
		
		
		double h = (b - a) / (n - 1);

		System.out.println("----------------------------");
		System.out.print("|  № |\t  X    ||\tY  |\n");
		System.out.println("----------------------------");

		for (int i = 0; i < n; i++) {
			double x = a + i * h;
			double y = Form.formul(x);
			
			System.out.printf("| %-2d | %-4.6f | %-4.6f |\n", i + 1, x, y);
		}

		System.out.println("----------------------------");
	}

}
