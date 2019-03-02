package project1;

public class TestGame {
	public static void main(String[] args) {
		Game newGame = new Game();
		newGame.runGame();
		int total = newGame.addition(25, 5);
		System.out.println(total);
		
	}

}
