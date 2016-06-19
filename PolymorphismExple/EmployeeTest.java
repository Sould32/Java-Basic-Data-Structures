/**
 * 
 */
package employees;

import student.TestCase;

/**
 * Test class for the Employee class.
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */
public class EmployeeTest extends TestCase {

    private Employee juan;
    private Employee sameJuan;
    private Object homoJuan;
    private Object mariam;
    private Object lowerCaseJuan;
    private Object nulljuan;

    /**
     * sets up each test method before it runs
     */
    public void setUp() {
        juan = new Employee("Juan", 50.36);
        sameJuan = new Employee("Juan", 50.36);
        homoJuan = new Employee("Juan", 50.36);
        mariam = new Employee("Mariam", 50.36);
        lowerCaseJuan = new Employee("juan", 30.25);
        nulljuan = null;
    }

    /**
     * test the method getName from Employee class
     */
    public void testGetName() {
        assertEquals("Juan", juan.getName());
    }

    /**
     * test the method testGetHourlyRate from Employee class
     */
    public void testGetHourlyRate() {
        assertEquals(50.36, juan.getHourlyRate(), 0.01);
    }

    /**
     * test the method testWeeklyPay from Employee class
     */
    public void testWeeklyPay() {
        assertEquals(2014.4, juan.weeklyPay(), 0.05);
    }

    /**
     * test the method the equals method from Employee class
     */
    public void testEqualsSameJuan() {
        assertTrue(juan.equals(sameJuan));
    }
    /**
     * test the method the equals method from Employee class
     */
    public void testEqualsJuan() {
        assertTrue(juan.equals(juan));
    }
    /**
     * test the method the equals method from Employee class
     */
    public void testEdqualsHomoJuan() {
        assertTrue(juan.equals(homoJuan));
    }

    /**
     * test the method the equals method from Employee class
     */
    public void testEdqualsMariam() {
        assertFalse(juan.equals(mariam));
    }

    /**
     * test the method the equals method from Employee class
     */
    public void testEdqualsLowerCaseJuan() {
        assertFalse(juan.equals(lowerCaseJuan));
    }

    /**
     * test the method the equals method from Employee class
     */
    public void test0EdqualsNulljuan() {
        assertFalse(juan.equals(nulljuan));
    }
}
