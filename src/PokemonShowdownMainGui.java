import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class PokemonShowdownMainGui 
{
	boolean p1switch, p2switch;
	Pokemon p1active, p2active;
	ArrayList<Pokemon> p1pokemon, p2pokemon, currentPokemonMoves, pokemonPool;

	JFrame jfrm;
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	
	PokemonShowdownMainGui() throws FileNotFoundException
	{
		jfrm = new JFrame("Pokemon Showdown");
		gb = new GridBagLayout();
		gbc = new GridBagConstraints();
		jfrm.setLayout(gb);
		jfrm.setSize(1280,720);
		loadPokemonDB();
		jfrm.setVisible(true);
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
	
	
	public void loadPokemonDB() throws FileNotFoundException
	{
	  File inFile = new File("resources/pokemonstats.txt");
    Scanner inScan = new Scanner(inFile);
	  inScan.nextLine();//pokemon
	  inScan.nextLine();//HP
	  inScan.nextLine();//attack
	  inScan.nextLine();//defense
	  inScan.nextLine();//spattack
	  inScan.nextLine();//spdefense
	  inScan.nextLine();//speed

	  while(inScan.hasNextLine())
	  {
	    
	      String tempName = inScan.nextLine();
	      int tempHP = Integer.parseInt(inScan.nextLine().trim());
	      int tempAttack = Integer.parseInt(inScan.nextLine().trim());
	      int tempDefense = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpAttack = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpDefense = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpeed = Integer.parseInt(inScan.nextLine().trim());
	      
	      System.out.println(new Pokemon(tempName , tempHP, tempAttack, tempDefense, tempSpAttack, tempSpDefense, tempSpeed));
	   }
	  System.out.println("finished");
	  
	  
	}
	

}

