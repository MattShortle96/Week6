package War;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		//Card card = new Card();
		for(int i=1; i<= 52; i++) {
			Card card = new Card();
			card.setValue(i);
			card.setName(i + "of Hearts");
			cards.add(card);
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
		return cards.remove(0);
		
	}

}
