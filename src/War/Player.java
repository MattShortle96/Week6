package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		hand = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
		
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	ii.	Methods
//	1.	describe ( calls the describe method for each card in the Hand List)
//	2.	flip (removes and returns the top card of the Hand)
//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//	4.	incrementScore (adds 1 to the Player’s score field)
	
	public void describe() {
		System.out.println("Player Name: " + this.name);
		
		for(Card card: hand) {
			card.describe();
		}
		
	}
	
	public Card flip() {
		int topCard = 0;
		if(topCard < hand.size()) {
			hand.get(topCard);
			return hand.remove(topCard++);
		}else {
			return null;
		}
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score += 1;
	}


}
