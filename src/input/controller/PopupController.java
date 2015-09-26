package input.controller;

import input.model.Thing;
import input.view.PopupDisplay;

public class PopupController 
{
	private PopupDisplay myPopups;
	private Thing myThing;

	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("you typed in " + name);
		
		int age; 
		String tempAge = myPopups.getAnswer("Type in your age");
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -1;
		}
		
		
		
		myPopups.displayResponse("you typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -0.9999;
		}
		
		
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try 
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("you did not type in a valid integer </3");
		}
		
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
			
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("you had the wrong answer");
		}
		
		return isDouble;
	}
	
}
