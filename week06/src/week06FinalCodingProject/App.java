package week06FinalCodingProject;

public class App {

	public static void main(String[] args) {
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		Player p1 = new Player("Joe");
		Player p2 = new Player("Bob");
		for (int i = 1; i <= 52/2; i++) {
			p1.draw(gameDeck);
			p2.draw(gameDeck);
		}
		for (int i = 1; i <= 25; i++) {
			int playerOnesCard = p1.flip();
			int playerTwosCard = p2.flip();
			if (playerOnesCard < playerTwosCard) {
				p2.incrementScore();
				System.out.println("player2 wins the battle. \nThey have: " + p2.totalScore() + " Points!\n\n");
				
			} else if (playerTwosCard < playerOnesCard) {
				p1.incrementScore();
				System.out.println("player1 wins the battle. \nThey have: " + p1.totalScore() + " Points!\n\n");
				
			} else {
				System.out.println("The value is equal, no Points.\n\n");
			}
		}
		if (p1.totalScore() > p2.totalScore()) {
			System.out.println("Player 1 with a total of: " + p1.totalScore() + " Wins!");
		}else if (p2.totalScore() > p1.totalScore()) {
			System.out.println("Player 2 with a total of: " + p2.totalScore() + " Wins!");
		}else {
			System.out.println("The game is a Tie!");
		}

}
}