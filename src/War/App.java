package War;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		Player player1 = new Player("Matt");
		Player player2 = new Player("Dan");
		
		deck.shuffle();
		
		//Draws 26 cards for each of 2 players
		for(int i=0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		//Both players cards flips 26 times
		for(int i=0; i < 26; i++) {
			//card1 = player1, card2 = player2
			System.out.println(player1.getName() + " has flipped a " + player1.flip());
			System.out.println(player2.getName() + " has flipped a " + player2.flip());
			
			if(player1.flip().getValue() > player2.flip().getValue()) {
				player1.incrementScore();
			}else if(player2.flip().getValue() > player1.flip().getValue()) {
				player2.incrementScore();
			}else {
				//If both players have same value, they both get a point
				player1.incrementScore();
				player2.incrementScore();
			}
		}
		
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		if(player1Score == player2Score) {
			System.out.println("Final score is a draw!");
		}else if(player1Score > player2Score) {
			System.out.println(player1.getName() + " wins!");
		}else {
			System.out.println(player2.getName() + " wins!");
		}

	}


}
