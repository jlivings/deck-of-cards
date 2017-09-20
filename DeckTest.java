class DeckTest
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		// Confirm deck is in enum order - Hearts, Spades, Clubs, Diamonds; Ace to King within each suit
		System.out.println("New deck:");
		System.out.println(deck);
		
		// Confirm deck is randomized
		deck.shuffle();
		System.out.println("Shuffled deck:");
		System.out.println(deck);
		
		// Confirm deck is randomized again
		deck.shuffle();
		System.out.println("Reshuffled deck:");
		System.out.println(deck);
		
		// Confirm all cards are dealt, in order shown after last shuffle
		System.out.println("Dealing all cards:");
		while (!deck.isEmpty())
			System.out.println(deck.dealOneCard());
		
		// Confirm null is returned if attempting to deal another card
		if (deck.dealOneCard() == null)
			System.out.println("Null returned, no card dealt");
	}
}
