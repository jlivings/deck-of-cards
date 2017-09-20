class Card
{
	public enum Suit
	{
		HEARTS,
		SPADES,
		CLUBS,
		DIAMONDS
	}
	
	public enum Value
	{
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
	
	public Card(Suit s, Value v)
	{
		suit = s;
		value = v;
	}
	
	public String toString()
	{
		return "[" + value + " OF " + suit + "]";
	}
	
	private Suit suit;
	private Value value;
}
