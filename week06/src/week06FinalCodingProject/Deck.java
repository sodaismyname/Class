package week06FinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	Deck () {
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		for (String suit : suits) {
			int value = 2;
			for(String cardName : numbers) {
					cardName = cardName.concat(" of " + suit);
					cards.add( new Card(cardName, value));
					value++;
				}
			}
		}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}
