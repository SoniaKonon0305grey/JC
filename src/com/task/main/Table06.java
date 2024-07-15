package com.task.main;

import java.util.Arrays;
import java.util.Random;

public class Table06 {

	public static void main(String[] args) {

		int[] R = new int[20];
		initRandom(R);

		form(R);
	}

	public static double inter(int k) {

		double q = Math.pow(k, 3) - 25 * k * k + 50 * k + 1000;

		return q;
	}

	
	public static void form(int[] R) {

		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;
		double l = Math.sqrt(a + b + m);
		double l1 = m * Math.sqrt(a + b);
		double l3 = Math.sqrt(a * b * m);
		double l4 = m * Math.sqrt(a * b);

		int count = 0;
		for (int i = 0; i < R.length; i++) {

			double q = inter(R[i]);

			if ((q >= l & q <= l1) || (q >= l3 & q <= l4)) {
				System.out.printf("Ответ:\n F(k) = [%10.2f] при  k  = [%4d].\n", q, R[i]);
			} else {
				count++;
			}
		}
		System.out.println("\n всего значений не соответсвующих условию = [" + count + "].");
	}
	public static void initRandom(int[] R) {

		Random rand = new Random();

		for (int i = 0; i < R.length; i++) {
			R[i] = rand.nextInt(90) - 30;
		}

		Arrays.sort(R);

		for (int i = 0; i < R.length; i++) {

			double k = R[i];

			for (int j = i + 1; j < R.length; j++) {

				if (k == R[j]) {
					R[j]++;
				}
			}
		}
	}

}
