package deck;

public class Card
{
	private String name;
	
	public Card(String name)
	{
		this.name = name;
	}
	
	public String getName() { return name; }
	
	public String toString()
	{
		return name;
	}
}