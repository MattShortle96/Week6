#Week 6 Coding Project
##Gateway Community College/Promineo Tech BESD Bootcamp

In this final coding project in Java, War card game was implemented. There are 4 classes in this Java Project: Card.java, Deck.java, Player.java, and App.java (main app).

Card.java: 
i.	Fields
1.	value (contains a value from 2-14 representing cards 2-Ace)
2.	name (e.g. Ace of Diamonds, or Two of Hearts)
ii.	Methods
1.	Getters and Setters
2.	describe (prints out information about a card)

Deck.java:
i.	Fields
1.	cards (List of Card)
ii.	Methods
1.	shuffle (randomizes the order of the cards)
2.	draw (removes and returns the top card of the Cards field)
3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

Player.java
i.	Fields
1.	hand (List of Card)
2.	score (set to 0 in the constructor)
3.	name
ii.	Methods
1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
2.	flip (removes and returns the top card of the Hand)
3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
4.	incrementScore (adds 1 to the Player’s score field)


App.java (Main method):
Creates a deck and 2 players
Iterates 52 cards (26 per each player) with a for-loop
Iterates 26 times and checks to see which card's value is higher
The winner of each round gets 1 point and if tied, both players get a point.
Program also checks who wins or if there's a tie, a draw.