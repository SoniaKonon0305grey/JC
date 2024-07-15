package com.task.main;

public class Argum {

	public static void main(String[] args) {
	
		double A = 1;
		double x1 = -2 * A;
		double h = A / 5;// dx
		int n = 20;
		System.out.print("-------------------\n");
		System.out.print("|     X\t  |\tY  |\n");
		System.out.print("-------------------\n");
		print_dop(x1, n, h, A);
	}

	public static void  print_dop(double x1, int n, double h, double A) {
		
		for (int i = 0; i < n; i++) {
			double x = x1 + i * h;
			double y = comp(x, A);
			System.out.printf("| %-2.4f | %-2.4f |\n", x, y);
		}
	
	}

	public static double comp(double x, double A) {

		if (x <= 0) {
			return (A / 2) * (Math.exp(x / A) + Math.exp(-x / A));
		} else {
			return (4 * Math.pow(A, 3)) / (Math.pow(x, 2) + 4 * Math.pow(A, 2));
		}
	}

	
	}

