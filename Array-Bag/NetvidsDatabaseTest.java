/**
 * 
 */
package collections;

import student.TestCase;

/**
 * represent a test class for Netvids data base
 * 
 * @author Souleymane Dia (sould32)
 * @version 2015.09.11
 */
public class NetvidsDatabaseTest extends TestCase {

    private NetvidsDatabase netvids;
    private Movie movie;
    private Movie batman;

    /**
     * Sets up the each of the test methods.
     */
    public void setUp() {
        netvids = new NetvidsDatabase();
        movie = new Movie("Spiderman");
        batman = new Movie("Batman");
    }

    /**
     * test add method
     */
    public void testAdd() {
        assertTrue(netvids.addMovie(movie));
        assertTrue(netvids.addMovie(batman));
        assertFalse(netvids.addMovie(movie));
    }

    /**
     * test the container method
     */
    public void testContain() {
        netvids.addMovie(batman);
        assertTrue(netvids.contains(batman));
        assertFalse(netvids.contains(new Movie("Ted")));
    }

    /**
     * test the isEmpty method
     */
    public void testSize() {
        assertEquals(0, netvids.size());
        netvids.addMovie(batman);
        assertEquals(1, netvids.size());
        netvids.addMovie(movie);
        assertEquals(2, netvids.size());
    }

    /**
     * test the isEmpty method
     */
    public void testIsEmpty() {
        assertTrue(netvids.isEmpty());
        netvids.addMovie(movie);
        assertFalse(netvids.isEmpty());
    }

    /**
     * test the doubleSize method
     */
    public void testExpandSize() {
        for (int i = 0; i < 11; i++) {
            netvids.addMovie(new Movie("Red" + "" + i));
        }
        assertEquals(11, netvids.size());
        assertEquals(20, netvids.capacity());
    }

    /**
     * test remove NoSuchelement exception
     */
    public void removeNo() {
        Exception exception = null;
        try {
            netvids.remove(new Movie("Troy"));
        }
        catch (Exception e) 
        {
            exception = e;
        }
        assertNotNull(exception);
    }

    /**
     * test remove IllegalArgumentException
     */
    public void testRemoveNull() {
        Movie nullString = null;
        Exception exception = null;
        netvids.addMovie(nullString);
        try {
            netvids.remove(nullString);
        }
        catch (Exception e)
        {
            exception = e;
        }
        assertNotNull(exception);
    }

    /**
     * test remove for an element present
     */
    public void testRemove() {
        Movie doodle = new Movie("googleDoodle");
        netvids.addMovie(doodle);
        assertEquals(doodle, netvids.remove(doodle));
    }

}
