package com.task.main;
		public class FunctionCalculator {
		    public static void main(String[] args) {
		        double e = Math.E;

		        double x = 0.1;
		        double F;

		        do {
		            F= x * x - Math.pow(e, 2 * x) + 4;
		            System.out.printf( "X = %2.4f\t",x);
		            System.out.printf( "Function = %2.4f\n",F);
		            x += 0.1;
		        } while (x <= 10 && F != 0);
		    }
		}

		
	


