/**
 * Testing class for Zoo object
 *
 * @author Matt Whitehead
 * @version 2019-02-10
 */

public class ZooTest 
{
	//test zooConstructor
	public void zooTest() throws AssertException
	{
		Zoo zoo1 = new Zoo(3);
		Integer capacityExpected = 3;
		Integer capacityActual = zoo1.getCapacity();
		Assert.assertEquals(capacityExpected,capacityActual);
	}
	//test expandZoo, addAnimal, toString
	public void expandZooTest() throws AssertException
	{
		Animal a = new Animal("Green", "Snake", 350.0, 40);
	    Animal b = new Animal("Orange", "Tiger", 200.5, 15);
	    
		Zoo zoo1 = new Zoo(1);
		
		zoo1.addAnimal(a);
		zoo1.addAnimal(b);
		Integer capacityExpected = 2;
		Integer capacityActual = zoo1.getCapacity();
		Assert.assertEquals(capacityExpected, capacityActual);
		String toStringExpected = "These animals live in the zoo: \n" + 
				"Snake, a Green-colored animal. 350.0 pounds, 40.0 inches\n" + 
				"Tiger, a Orange-colored animal. 200.5 pounds, 15.0 inches\n";
		String toStringActual = zoo1.toString();
		Assert.assertEquals(toStringExpected, toStringActual);
	}
	//test getTotalHeight
	public void getTotalHeightTest() throws AssertException
	{
		Animal a = new Animal("Green", "Snake", 350.0, 40);
		Animal b = new Animal("Orange", "Tiger", 200.5, 15);
		
		Zoo zoo1 = new Zoo(3);
		zoo1.addAnimal(a);
		zoo1.addAnimal(b);
		
		Double expectedHeight = 40.0 + 15.0;
		Double actualHeight = zoo1.getTotalHeight();
		Assert.assertEquals(expectedHeight, actualHeight, .01);
	}
	//test getAverageWeight
	public void getAverageWeightTest() throws AssertException
	{
		Animal a = new Animal("Green", "Snake", 350.0, 40);
		Animal b = new Animal("Orange", "Tiger", 200.5, 15);
		
		Zoo zoo1 = new Zoo(3);
		zoo1.addAnimal(a);
		zoo1.addAnimal(b);
		
		int expectedWeight = (int) ((350.0 + 200.5)/2);
		int actualWeight = zoo1.getAverageWeight();
		Assert.assertEquals(expectedWeight, actualWeight);
	}
	//test getAverageWeight by color
	public void getAverageWeightColorTest() throws AssertException
	{
		Animal a = new Animal("Green", "Snake", 350.0, 40);
		Animal b = new Animal("Orange", "Tiger", 200.5, 15);
		
		Zoo zoo1 = new Zoo(3);
		zoo1.addAnimal(a);
		zoo1.addAnimal(b);
		
		int expectedWeight = (int) 350.0;
		int actualWeight = zoo1.getAverageWeight("Green");
		Assert.assertEquals(expectedWeight, actualWeight);
	}
}