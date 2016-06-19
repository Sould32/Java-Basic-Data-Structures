/**
 * 
 */
package employees;

import student.TestCase;

/**
 * Test class for the partTimeEmployee class .
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */

public class PartTimeEmployeeTest extends TestCase {

    private PartTimeEmployee rehan;
    private Object diffRehan;
    private Object homoRehan;
    private Object mariam;
    private Object lowerCaseRehan;
    private Object nullRehan;

    /**
     * sets up each test method before it runs
     */
    public void setUp() {
        rehan = new PartTimeEmployee("Rehan", 50.36, 25);
        diffRehan = new Employee("Rehan", 50.36);
        homoRehan = new PartTimeEmployee("Rehan", 50.36, 18);
        mariam = new PartTimeEmployee("Mariam", 50.36, 15);
        lowerCaseRehan = new PartTimeEmployee("rehan", 30.25, 13);
        nullRehan = null;
    }

    /**
     * test the method getHourlyRate in the PartTimeEmployee class.
     */
    public void testGetHourlyRate() {
        assertEquals(50.36, rehan.getHourlyRate(), 0.01);
    }

    /**
     * test the method weeklyPay in the PartTimeEmployee class.
     */
    public void testWeeklyPay() {
        assertEquals(1259, rehan.weeklyPay(), 0.01);
    }

    /**
     * test the method equal for two part timer
     */
    public void testEdqualsDiffRehan() {
        assertFalse(rehan.equals(diffRehan));
    }

    /**
     * test the method equal for two part timer
     */
    public void testEdqualsHomoRehan() {
        assertTrue(rehan.equals(homoRehan));
    }

    /**
     * test the method equal for two part timer
     */
    public void testEdqualsMariam() {
        assertFalse(rehan.equals(mariam));
    }

    /**
     * test the method equal for two part timer
     */
    public void testEdqualsLowerCaseJuan() {
        assertFalse(rehan.equals(lowerCaseRehan));
    }

    /**
     * test the method equal for two part timer
     */
    public void test0EdqualsNullRehan() {
        assertFalse(rehan.equals(nullRehan));
    }
}
