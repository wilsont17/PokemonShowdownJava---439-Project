import java.util.*;
import javax.swing.*;

public class PokemonShowdownMainGui 
{
	boolean p1switch, p2switch;
	Pokemon p1active, p2active;
	ArrayList<Pokemon> p1pokemon, p2pokemon, currentPokemonMoves, pokemonPool;

	PokemonShowdownMainGui()
	{
		
	}
	
	
	//Mechanics
	
	public void turnMove()
	{
		if (p1switch)
		{
			
		}
		if (p2switch)
		{
			
		}
		if (!p1switch && !p2switch)
		{
			if (p1active.getSpeed() > p2active.getSpeed())
			{
				
			}
			else if (p1active.getSpeed() == p2active.getSpeed())
			{
				
			}
			else
			{
				
			}
		}
	}
	

}
