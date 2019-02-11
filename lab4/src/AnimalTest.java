/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
    	// Use the full constructor
    	Animal animal = new Animal("Orange", "Tony", 200.1, 20);
    	Assert.assertEquals("Orange", animal.getColor());
    	Assert.assertEquals("Tony", animal.getName());
    	Assert.assertEquals(200.1, animal.getWeight(), .01);
    	Assert.assertEquals(20.0, animal.getHeight(), .01);
    	
    	String expected = "Tony, a Orange-colored animal. 200.1 pounds, 20.0 inches";
    	String actual = animal.toString();
    	Assert.assertEquals(expected, actual);
    }
    
    public void equalsTest() throws AssertException
    {
    	Animal animal1 = new Animal("Orange", "Tony", 200.2, 20);
    	Animal animal2 = new Animal("Blue", "Tom", 200.5, 21);
    	Boolean expected = false;
    	Boolean actual = animal1.equals(animal2);
    	Assert.assertEquals(expected, actual);
    	Animal animal3 = new Animal("Blue", "Tom", 200.5, 21);
    	expected = true;
    	actual = animal3.equals(animal2);
    	Assert.assertEquals(expected, actual);
    }
}

