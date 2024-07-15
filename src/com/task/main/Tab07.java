package com.task.main;

public class Tab07 {

	public static void main(String[] args) {

		double x = 25;
		double h = 1;
		double z = 2;
		double w = 0.15;
		int N = 7;
		int M = 8;
		tabl_print(N, M, x, h, z, w);

	}

	public static double form_1(double x, double z) {

		double y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z)
				+ Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2);
		return y;
	}

	public static void tabl_print(int N, int M, double x, double h, double z, double w) {

		System.out.print(" X    | ");
		for (int i = 0; i < M; i++) {
			System.out.printf("Z= %2.1f |", z);
			z += w;
		}
		System.out.println();
		System.out.println("________________________________________________________________________");

		for (int i = 0; i < M + 1; i++) {

		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			System.out.printf(" %2.1f | ", x);
			for (int j = 0; j < M; j++) {

				double y = form_1(x, z);

				System.out.printf("%2.4f", y);
				System.out.print("|");

				z += w;
			}
			System.out.println();
			System.out.println("________________________________________________________________________");

			x += h;
		}
	}

}
