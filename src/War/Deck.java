package War;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private String name[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private String suit[] = {"Diamonds", "Hearts", "Clubs", "Spades"};
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for(int i=0; i < suit.length; i++) {
			for(int j=0; j < name.length; j++) {
				Card card = new Card();
				card.setValue(i + 2);
				card.setName(name[j] + " of " + suit[i]);
				cards.add(card);
			}
		}
		
	}
	
	
	
	public List<Card> getCards(){
		return cards;
	}
	
	public void setCards(List<Card> cards){
		this.cards = cards;
	}
	
	
	//1.	shuffle (randomizes the order of the cards)
	public void shuffle() {
		Random random = new Random();
		
		for(int i=cards.size() - 1; i > 0; i--) {
			int j = random.nextInt(i+1);
			Card cardI = cards.get(i);
			Card cardJ = cards.get(j);
			
			cards.set(i, cardJ);
			cards.set(j, cardI);
		}
		
	}
	
	//2.	draw (removes and returns the top card of the Cards field)
	public Card draw() {
		int topCard = 0;
		if(topCard < cards.size()) {
			cards.get(topCard);
			return cards.remove(topCard++);
		}else {
			return null;
		}
		
	}

}
