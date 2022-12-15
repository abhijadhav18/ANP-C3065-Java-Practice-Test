package lab1_Classes;

import java.util.Scanner;

public class PowerOfTwo {
	
	public boolean checkNumber(int n) {
		boolean result=true;
		if(n!=0 && (( n&(n-1))==0)) {
			
// The single AND operator (&) is known as the Bitwise AND operator. 
// The double AND operators (&&) are known as logical AND operators. 
			System.out.println("The number "+n+" Is Power Of 2 ");
		}
		else {
			System.out.println("The Number "+n+" Is Not Power Of 2");
		}
		return result;
	}

	
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		PowerOfTwo pw=new PowerOfTwo();
		
		System.out.println(pw.checkNumber(n));
		

	}

}
