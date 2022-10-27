package question2;

public class GameMenu {
	public void startGame() {
//		System.out.println("Start Game Method Is Called ");

	}

	public void displayGameInstruction() {
//		System.out.println("Display Game Instuctions Method Is Called");

	}

	public void exitGame() {
//		System.out.println("Exit The Game Method Is Called");

	}

	public static void main(String[] args) {
		System.out.println("*Start The Game");
		System.out.println("*Display Game Instructions");
		System.out.println("*Exit The Game");

		GameMenu obj = new GameMenu();

		int menuChoice = 1;
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