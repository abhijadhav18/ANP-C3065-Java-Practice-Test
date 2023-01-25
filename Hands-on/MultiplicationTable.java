// Program to print any multiplication table by using  exception handling and call Thread.Sleep method


package corejava;

// Here we Imported Scanner Class To Accept The User Input
import java.util.Scanner; 

public class MultiplicationTable extends Thread{
	//Here We Created Instance Of Scanner Class
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				//This Sleep() helps to execute the main method with delay of 1500 millisecond
				Thread.sleep(1500);
				sum=a*i;
				
				System.out.println(sum);
			}
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// Creating Instance Of Scanner Class
		
		
		// Here We Create An Instance Of MultiplicationTable class 
		MultiplicationTable m= new MultiplicationTable();
		
		//With The Help Of Instance We Are Calling The Start Method
		m.start();
		
	}

}
