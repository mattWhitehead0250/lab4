/**
 * Testing class for Equipment object
 *
 * @author Matt Whitehead
 * @version 2019-02-10
 */

public class EquipmentTest {
	//tests equipment constructor
	public void equipmentConstructorTest() throws AssertException
	{
		String string = "Batarang/5,5.0,5.0,A boomerang for bats";
		Equipment equipment = new Equipment(string);
		String equipName = equipment.getName();
		Integer equipCount = equipment.getCount();
		Double equipTotalWeight = equipment.getTotalWeight();
		Double equipTotalPrice = equipment.getTotalPrice();
		String equipDescription = equipment.getDescription();
		
		Assert.assertEquals("Batarang", equipName);
		Assert.assertEquals(5, equipCount, .01);
		Assert.assertEquals(5.0, equipTotalWeight, .01);
		Assert.assertEquals(5.0, equipTotalPrice, .01);
		Assert.assertEquals("A boomerang for bats", equipDescription);
		
	}
	//tests equipment toString
	public void equipmentToStringTest() throws AssertException
	{
		Equipment equipment = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		String expected = "Name: Batarang, Number: 5, Weight: 5.00 lbs, Price: $5.00 - A boomerang for bats";
		String actual = equipment.toString();
		Assert.assertEquals(expected, actual);
	}
	//tests equipment equals
	public void equipmentEqualsTest() throws AssertException
	{
		Equipment equipment1 = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		Equipment equipment2 = new Equipment("Bat Shark Repellent/3,3.0,3.0,Shark repelling bat spray");
		Boolean expected = false;
    	Boolean actual = equipment1.equals(equipment2);
    	Assert.assertEquals(expected, actual);
    	//Equipment equipment3 = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
    	//expected = true;
    	//actual = equipment1.equals(equipment3);
    	//Assert.assertEquals(expected,actual);
	}
}