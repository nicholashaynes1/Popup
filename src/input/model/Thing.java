package input.model;

public class Thing 
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * This sets your things objects to pre recored data.
	 */
	public Thing()
	{
		age = -99;
		weight = -.00000000005;
		name = "";
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;	
	}
	
	public void setWeight(double weight)
	{
		this.age = age;
	}
	
	/**
	 * Changes the older values to new user input information.
	 * @param name sets the name to the users input.
	 * @param age sets age to user input.
	 * @param weight sets weight to user input.
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * This method takes all user info and repeats it back to our user.
	 */
	public String toString()
	{
		String thingInfo = name + "is" + age + "years old and is" + weight + "Lbs";
		
		return thingInfo;
	}
}
