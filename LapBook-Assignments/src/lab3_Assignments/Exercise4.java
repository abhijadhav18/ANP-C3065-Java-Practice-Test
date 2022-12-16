package lab3_Assignments;

import java.util.Scanner;

public class Exercise4 {
	char[] c=new char[5];
	 static String str;
	 int[] count;
	char[] getCharecter(String s) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++)   
		{  
		ch[i] = str.charAt(i);  
		int find = 0;  
		for (int j = 0; j <= i; j++)   
		{  
		 
		if (str.charAt(i) == ch[j])  
		find++;  
		} 
		
		if (find == 1)  
		   
		System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		}  
		 return c; 
	}
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		str=sc.next();
		Exercise4 e=new Exercise4();
		char[] b=e.getCharecter(str);
	}

}
