package lab3_Assignments;

import java.util.Scanner;

public class SortArray {
	
	int small=Integer.MAX_VALUE;
	int small2=Integer.MAX_VALUE;
	
	public int getSecondSmallest(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			if(arr[i]>small && arr[i]<small2) {
				small2=arr[i];
			}
		}
		
		
		return small2;
		
	
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		SortArray a=new SortArray();
		int b=a.getSecondSmallest(arr);
		System.out.println("The Second Smallest Number Is :-  "+b);
		
		
		
	}

}
