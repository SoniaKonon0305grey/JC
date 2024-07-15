package com.task.main;

public class DotAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Количество точек, попавших в область: " + points(10));
	}
public static double points(double n) {
	       // int n = 10; // количество точек
	        int count = 0; // счетчик точек, попавших в область

	        double[][] point = {{0.5, 0.5}, {1.1, -1.1}, {0, 0.8}, {0.2, -0.5}, {-1, 0}, {0.7, 0.7}, {1.5, 0}, {0.3, 0.3}, {0, 0}, {0.8, -0.8}};

	       
	        for (int i = 0; i < n; i++) {
	            double x = point[i][0];
	            double y = point[i][1];

	            if (x*x + y*y <= 1) {
	                count++;
	            }
	        }

	
			return count;
	    }
	

}

