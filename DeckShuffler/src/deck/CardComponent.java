package deck;

public class CardComponent
{
	private Card card;
	private int quantity;
	
	public CardComponent(Card card, int quantity)
	{
		this.card = card;
		this.quantity = quantity;
	}
	
	public Card getCard() { return card; }
	public int getQuantity() { return quantity; }
	
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	public String toString()
	{
		return quantity + " " + card.getName();
	}
}