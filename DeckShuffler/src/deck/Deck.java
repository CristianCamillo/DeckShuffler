package deck;

import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
	}
		
	public void addCard(Card card)
	{
		cards.add(card);
	}
	
	public void removeCard(int i)
	{
		cards.remove(i);
	}
	
	public Card draw()
	{
		return cards.remove(0);
	}
	
	public void shuffle(int iter)
	{
		ArrayList<Card> l1 = new ArrayList<Card>();
		ArrayList<Card> l2 = new ArrayList<Card>();
		
		int n = cards.size();
		
		for(int i = 0; i < iter; i++)
		{
			int m = (int)(n / 2 - n / 10 + Math.random() * n / 5);
						
			for(int j = 0; j < m; j++)
				l1.add(cards.remove(0));
			
			while(!cards.isEmpty())
				l2.add(cards.remove(0));
			
			while(!l1.isEmpty() && !l2.isEmpty())
				if(Math.random() < 0.5)
					cards.add(l1.remove(0));
				else
					cards.add(l2.remove(0));
			
			while(!l1.isEmpty())
				cards.add(l1.remove(0));
			
			while(!l1.isEmpty())
				cards.add(l1.remove(0));
		}
	}
	
	public String toString()
	{
		String s = "";
		
		for(Card card : cards)
			s += card + "\n";
			
		return s;
	}
}