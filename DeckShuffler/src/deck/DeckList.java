package deck;

import java.util.ArrayList;

public class DeckList
{
	private ArrayList<CardComponent> ccs;
	
	public DeckList(ArrayList<CardComponent> ccs)
	{
		this.ccs = ccs;
	}
	
	public CardComponent getCardComponent(int i)
	{
		return ccs.get(i);
	}
	
	public Deck getDeck()
	{
		Deck d = new Deck();
		
		for(CardComponent cc : ccs)
		{
			for(int i = 0, q = cc.getQuantity(); i < q; i++)
				d.addCard(cc.getCard());
		}
		
		return d;
	}
	
	public String toString()
	{
		String s = "";
		
		for(CardComponent cc : ccs)
			s += cc + "\n";
			
		return s;
	}
}