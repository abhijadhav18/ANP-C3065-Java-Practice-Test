package lab1_Classes;

import java.util.Scanner;

public class CalculateSum {
	
	public int calculateSum(int n) {
		int sum=0;
		
		
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				 sum=sum+i;
				 
				
				
			}
		}
		System.out.println("Sum of Natural Numbers Is ");
		return sum;
	}

	 
 

	public static void main(String[] args) {
		System.out.println("Enter the Natural Number :- ");
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		
		CalculateSum c= new CalculateSum();
		int j=c.calculateSum(n);
		System.out.println(j);
		
		
		
	




	}

}
