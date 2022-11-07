package question2;
import java.util.Scanner;

public class GameMenu {
	public void startGame() {


	}

	public void displayGameInstruction() {


	}

	public void exitGame() {

	}

	public static void main(String[] args) {
		System.out.println("*Start The Game");
		System.out.println("*Display Game Instructions");
		System.out.println("*Exit The Game");
		
		for(int i=0;i<=3;i++) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int menuChoice=sc.nextInt();
		
		

		GameMenu obj = new GameMenu();

	
		switch (menuChoice) {
		
		case 1:
			obj.startGame();
			System.out.println("Start The Game");
			break;
			
		case 2:
			obj.displayGameInstruction();
			System.out.println("Display The Instructions");
			break;
			
		case 3:
			obj.exitGame();
			System.out.println("Exit The Game ");
			break;
		}
		}
	}

}