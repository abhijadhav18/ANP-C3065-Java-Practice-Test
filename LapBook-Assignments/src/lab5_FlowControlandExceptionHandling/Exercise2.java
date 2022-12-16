package lab5_;

import java.util.Scanner;

public class Exercise2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int terms, last = 1, secondLast = 0, current, i;
		 
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter number of terms in Fibonacci Series");
	        terms = in.nextInt();
	        
	        for(i=0;i<terms;i++) {
	        	if(i<2) {
	        		current=i;
	        		
	        	}
	        	else {
	        		current =last + secondLast;
	        		secondLast=last;
	        		last=current;
	        		
	        	}
	        	System.out.println(current+ " ");
	        }
		

	}

}
