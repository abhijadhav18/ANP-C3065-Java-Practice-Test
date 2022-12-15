package lab1_Classes;

import java.util.Scanner;

public class CalculateDifference {

	public int calculateDifference(int n) {
		int sum = 0; // here we declare some local variables and initialized them with '0'
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i <= n; i++) {
		// here we storing the sum of square of natural numbers in variable ' sum ' .
			sum = sum + (i * i);
		}
		for (int j = 0; j <= n; j++) {
		// here we are storing the sum of natural numbers in variable ' sum1 '.
			sum1 = (sum1 + j);
			
		}
		// here we are storing the square of ' sum1 ' in variable ' sum2 ' as per our requirement .		
		sum2 = sum1 * sum1;
		
		// here we are substracting the sum2 from sum and storing it in variable ' sum3 '.
		sum3 = sum2-sum;  // thus in sum 3 the difference is stored .

		System.out.println("The Difference Between The Square Of First " + n
				+ "  Natural Numbers And The Square Of Their Sum  Is :" + sum3);
		return sum3;
	}

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		CalculateDifference c = new CalculateDifference();
		c.calculateDifference(n);

	}

}
