import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class PokemonShowdownMainGui 
{
	String p1Name, p2Name;
	boolean p1Switch, p2Switch, p1Moved, p2Moved;
	Pokemon p1Active, p2Active;
	JLabel p1AndAllPokemon, p2AndAllPokemon, p1ActiveImg, p2ActiveImg,
	  p1StatusEffects, p2StatusEffects, previousMovesLog, currentTurnEvents;
	JProgressBar p1PokemonHP, p2PokemonHP;
	JScrollBar movesLogScroll;
	ArrayList<Pokemon> p1Pokemon, p2Pokemon, pokemonPool;

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
		//create the arraylists
		pokemonPool = new ArrayList<Pokemon>();
		p1Pokemon = new ArrayList<Pokemon>();
		p2Pokemon = new ArrayList<Pokemon>();
		
		loadPokemonDB();
		jfrm.setVisible(true);
		
		previousMovesLog = new JLabel("<html>");
		gbc.gridx = 8; gbc.gridy = 0;
		gbc.gridheight = 9; gbc.gridwidth = 3;
		jfrm.add(previousMovesLog, gbc);
		
		new SetupGui(this);
		
		
	}
	
	//Mechanics
	
	public void createOneVsOne()
	{
		p1Pokemon.add(pokemonPool.get((int)(Math.random()* 772)));
		p2Pokemon.add(pokemonPool.get((int)(Math.random()* 772)));
		p1Active = p1Pokemon.get(0);
		p2Active = p2Pokemon.get(0);
	}
	
	public void createSixVsSix()
	{
		for (int x = 0; x < 6; x ++)
		{
			p1Pokemon.add(pokemonPool.get((int)(Math.random()* 772)));
			p2Pokemon.add(pokemonPool.get((int)(Math.random()* 772)));
			p1Active = p1Pokemon.get(0);
			p2Active = p2Pokemon.get(0);
		}
	}
	
	public void addNames(String p1n, String p2n)
	{
		p1Name = p1n; 
		p2Name = p2n;
	}
	
	public void turnMove()
	{
		if (p1Switch)
		{
			
		}
		if (p2Switch)
		{
			
		}
		if (!p1Switch && !p2Switch)
		{
			if (p1Active.getSpeed() > p2Active.getSpeed())
			{
				
			}
			else if (p1Active.getSpeed() == p2Active.getSpeed())
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
    
	  /* Order of input
	  inScan.nextLine();//HP
	  inScan.nextLine();//attack
	  inScan.nextLine();//defense
	  inScan.nextLine();//spattack
	  inScan.nextLine();//spdefense
	  inScan.nextLine();//speed
	   */
	  while(inScan.hasNextLine())
	  {
	    
	      String tempName = inScan.nextLine();
	      int tempHP = Integer.parseInt(inScan.nextLine().trim());
	      int tempAttack = Integer.parseInt(inScan.nextLine().trim());
	      int tempDefense = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpAttack = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpDefense = Integer.parseInt(inScan.nextLine().trim());
	      int tempSpeed = Integer.parseInt(inScan.nextLine().trim());
	      pokemonPool.add(new Pokemon(tempName , tempHP, tempAttack, tempDefense, tempSpAttack, tempSpDefense, tempSpeed));
	      //System.out.println(new Pokemon(tempName , tempHP, tempAttack, tempDefense, tempSpAttack, tempSpDefense, tempSpeed));
	   }
	}
	

}

