package main;

import java.io.IOException;

import deck.Deck;
import deck.DeckList;
import fileReader.DeckListLoader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		DeckList dl = DeckListLoader.LoadDeckList("deck.txt");
		Deck d = dl.getDeck();
				
		d.shuffle(7);
			
		for(int i = 0; i < 7; i++)
			System.out.println(d.draw());
	}
}