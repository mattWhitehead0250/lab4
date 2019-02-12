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
	//test expandZoo and addAnimal
	public void expandZooTest() throws AssertException
	{
		Animal a = new Animal("Green", "Chester", 350.0, 40);
	    Animal b = new Animal("Orange", "Tony", 200.5, 15);
	    
		Zoo zoo1 = new Zoo(1);
		
		zoo1.addAnimal(a);
		zoo1.addAnimal(b);
		Integer capacityExpected = 4;
		Integer capacityActual = zoo1.getCapacity();
		Assert.assertEquals(capacityExpected, capacityActual);
	}
	//test getTotalHeight
	public void getTotalHeightTest() throws AssertException
	{

	}
	//test getAverageWeight
	public void getAverageWeightTest() throws AssertException
	{

	}
	//test getAverageWeight by color
	public void getAverageWeightColorTest() throws AssertException
	{

	}
	//test toString
	public void toStringTest() throws AssertException
	{

	}
}