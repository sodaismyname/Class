package week06FinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
		Player (String name){
			this.name = name;
		}
	
	
	public int flip() {
		Card card = this.hand.remove(0);
		System.out.println("card in " + name + "'s battle is:");
		card.describe();
		int value = card.getValue();
		return value;
	}
	
	public void describe() {
	    System.out.println("cards in Player's hand are: ");
		for (Card card : hand) {
			
			card.describe();
		}
	}
	public  void draw(Deck gamedeck) {
		Card card = gamedeck.draw();
		hand.add(card); 
	}
	public int incrementScore () {
		score++;
		return score;
	}
	
	public int totalScore() {
		return score;
	}
}
