package War;

public class Card {
	
	private int value;
	private String name;

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
		String name = "";
		
		if(value == 11) {
			name = "Jack";
		}else if(value == 12) {
			name = "Queen";
		}else if(value == 13) {
			name = "King";
		}else if(value == 14) {
			name = "Ace";
		}else {
			name = Integer.toString(value);
		}
		
		
		//Add anything about the suit?
		
		System.out.println(name + " of " + value);
		
		
	}
	
	
	
	

}
