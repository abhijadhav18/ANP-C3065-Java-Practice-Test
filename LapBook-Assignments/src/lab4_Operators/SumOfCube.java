package lab4_Operators;

import java.util.Scanner;

public class SumOfCube {
	int cube=0;
	
	public int calculateCube(int n) {
		
		while(n>0) {
// here we are storing  a remainder value inside variable ' a ' because we want the individual number so that we can calculate cube of that number.			
			int a=n%10;
			
			//here the sum of cubes of each individual digit get stored in the cube . 
			cube=cube+(a*a*a);
			
			// here we are dividing the number by 10 , so that after calculating the cube of the individual number then that number will became zero and will not be further repeated .
			n=n/10;
			
			
			
		}
		
		System.out.println("The Sum Of Cubes Of Entered Number Is : ");
		
		
		

		return cube;
	}
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		
		int n=sc.nextInt();
		
		SumOfCube s=new SumOfCube();
		
		System.out.println(s.calculateCube(n));

	}

}
