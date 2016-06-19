/**
 * 
 */
package collections;

/**
 * @author Souleymane Dia (sould32)
 * @version 2015.09.11
 */
public class MovieTest extends student.TestCase {

    private Movie movie;
    private Movie batman;
    private Movie nullMovi;
    private Object spiderman;
    /**
     * sets up movie object
     */
    public void setUp() {
        movie = new Movie("Spiderman");
        batman = new Movie("Spiderman");
        batman.setGenre("Action");
        batman.setYear(2002);
        batman.setRating(4);
        movie.setGenre("Action");
        movie.setYear(2002);
        movie.setRating(4);
        spiderman = new Object();
    }

    /**
     * test the getTittle method
     */
    public void testGetTittle() {
        assertEquals("Spiderman", movie.getTitle());
    }

    /**
     * test the getGenre method
     */
    public void testGetGenre() {
        assertEquals("Action", movie.getGenre());
    }

    /**
     * test the getGenre method
     *//*
         * public void testSetNullGenre(){ movie.setGenre(null); assertEquals(",
         * movie.getGenre()); }
         */
    /**
     * test the setGenre method
     */
    public void testSetGenre() {
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    /**
     * test the getRating method
     */
    public void testGetRating() {
        assertEquals(4, movie.getRating());
    }

    /**
     * test the setRating method
     */
    public void testSetRating() {
        movie.setRating(3);
        assertEquals(3, movie.getRating());
    }

    /**
     * test the getYear method
     */
    public void testGetYear() {
        assertEquals(2002, movie.getYear());
    }

    /**
     * test the setYear method
     */
    /*
     * public void testSetNegativeYear(){ movie.setYear(-2014); assertEquals(0,
     * movie.getYear()); }
     */
    /**
     * test the setYear method
     */
    public void testSetYear() {
        movie.setYear(2014);
        assertEquals(2014, movie.getYear());
    }

    /**
     * test the equal method
     */
    public void testEqual() {
        assertTrue(movie.equals(movie));
    }
    /**
     * test the equal method
     */
    public void testEqualSame() {
        assertFalse(movie.equals(spiderman));
    }
    /**
     * test the equal method
     */
    public void testEqualNotSame() {
        assertFalse(movie.equals(new Movie("Knight Tour")));
    }
    /**
     * test the equal method
     */
    public void testEqualBat() {
        assertTrue(movie.equals(batman));
    }
    /**
     * test the equal method
     */
    public void testEqualNull() {
        assertFalse(movie.equals(nullMovi));
    }
    

}
