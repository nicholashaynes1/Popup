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
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in a integer value");
		}
		
		
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
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("type in a double value");
		}
		
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
	
	/**
	 * This tests to make sure our user input is a valid int so the program will not crash.
	 * @param input is a temporary holding spot for user input.
	 * @return if the test passes it returns the input value.
	 */

	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try 
		{
			int validInt = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("you did not type in a valid integer </3");
		}
		
		
		return isInt;
	}
	
	/**
	 * this tests that the user input a correct value for weight.
	 * @param input temporary holing spot for input
	 * @return if the tests passes it sets the weight value to the input.
	 */
	
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
			myPopups.displayResponse("you had the wrong type");
		}
		
		return isDouble;
	}
	
}
