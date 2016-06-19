/**
 * 
 */
package icecream;

import student.TestCase;

/**
 * @author Souleymane <sould32>
 * @version 09/25/2015
 */
public class IceCreamConeTest extends TestCase {

    private IceCreamCone myCone;
    private IceCreamCone urCone;
    private IceCreamCone nullCone;

    /**
     * set up instance fields
     */
    public void setUp() {
        myCone = new IceCreamCone();
        urCone = new IceCreamCone();
        nullCone = null;
    }

    /**
     * test add
     */
    public void testAdd() {
        myCone.addScoop("vanilla");
        assertTrue(myCone.contains("vanilla"));
        assertFalse(myCone.emptyCone());
    }

    /**
     * test eat scoop
     */
    public void testEatScoop() {
        myCone.addScoop("vanilla");
        assertEquals("vanilla", myCone.eatScoop());
    }

    /**
     * test current scoop method
     */
    public void testCuurentScoop() {
        myCone.addScoop("vanilla");
        assertEquals("vanilla", myCone.currentScoop());
    }

    /**
     * test to string method
     */
    public void testToString() {
        myCone.addScoop("vanilla");
        assertEquals("[vanilla]", myCone.toString());
    }

    /**
     * test the equal method
     */
    public void testEquals() {
        myCone.addScoop("vanilla");
        urCone.addScoop("vanilla");
        String nullString = null;
        assertTrue(myCone.equals(myCone));
        assertTrue(myCone.equals(urCone));
        assertFalse(myCone.equals("cone"));
        assertFalse(myCone.equals(nullCone));
        assertFalse(myCone.equals(nullString));
        assertFalse(myCone.equals(new Object()));
    }
    /**
     * test num scoop
     */
    public void testNumscoop() {
        myCone.addScoop("vanilla");
        assertEquals( 1 , myCone.numScoops() );
    }
    /**
     * test contain
     */
    public void testContain() {
        myCone.addScoop("vanilla");
        assertTrue(myCone.contains("vanilla"));
        assertFalse(urCone.contains("vanilla"));
    }
    /**
     * test the empty method
     */
    public void testEmpty() {
        assertTrue(urCone.emptyCone());
        myCone.addScoop("vanilla");
        assertFalse(myCone.emptyCone());
    }
}
