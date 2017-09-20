import java.util.ArrayList;
import java.util.Random;

class Deck
{
	public Deck()
	{
		cards = new ArrayList<Card>();
		
		// A new deck is initialized with 52 cards, in order
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Value value : Card.Value.values()) {
				cards.add(new Card(suit, value));
			}
		}
	}
	
	// Required method 1: shuffle()
	// Implements the Fisher-Yates shuffle algorithm to shuffle the deck
	public void shuffle()
	{
		Random rand = new Random();
		
		for (int i = cards.size() - 1; i > 0; i--) {
			int randIndex = rand.nextInt(i);
			
			// Swap the card at i with the one at the random index
			Card temp = cards.get(i);
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}
	
	// Required method 2: dealOneCard()
	// If the deck is empty, returns null to indicate no card was dealt
	public Card dealOneCard()
	{
		return isEmpty() ? null : cards.remove(0);
	}
	
	public boolean isEmpty()
	{
		return cards.isEmpty();
	}
	
	public String toString()
	{
		String output = "";
		for (Card c : cards) {
			output += c + "\n";
		}
		return output;
	}
	
	private ArrayList<Card> cards;
}
