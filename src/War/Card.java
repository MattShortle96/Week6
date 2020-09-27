package War;

public class Card {
	
	private int value;
	private String name;
	private int suit;
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(toString());
		
	}
	
	public String toString() {
		StringBuilder describeCard = new StringBuilder();
		
		if(value == 11) {
			describeCard.append("Jack");
		}else if(value == 12) {
			describeCard.append("Queen");
		}else if(value == 13) {
			describeCard.append("King");
		}else if(value == 14) {
			describeCard.append("Ace");
		}else {
			describeCard.append(value);
		}
		
		describeCard.append(" of ");
		
		if(suit == 1) {
			describeCard.append("Diamonds");
		}else if(suit == 2) {
			describeCard.append("Hearts");
		}else if(suit == 3) {
			describeCard.append("Clubs");
		}else if(suit == 4) {
			describeCard.append("Spades");
		}else {
			return null;
		}
		
		name = describeCard.toString();
		return name;
	}
	
	
	
	
	

}
