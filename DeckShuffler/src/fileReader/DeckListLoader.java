package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import deck.Card;
import deck.CardComponent;
import deck.DeckList;

public class DeckListLoader
{
	public static DeckList LoadDeckList(String deckListLocation) throws IOException
	{
		FileReader fr = new FileReader(deckListLocation);
		BufferedReader reader = new BufferedReader(fr);
		
		ArrayList<CardComponent> ccs = new ArrayList<CardComponent>();
		
		String readLine;
		
		while((readLine = reader.readLine()) != null)
		{
			String[] s = readLine.split(" ", 2);
			Card c = new Card(s[1]);
			CardComponent cc = new CardComponent(c, Integer.parseInt(s[0]));
			ccs.add(cc);
		}		
		
		reader.close();
		
		return new DeckList(ccs);
	}
}