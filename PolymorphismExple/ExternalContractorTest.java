/**
 * 
 */
package employees;

import student.TestCase;

/**
 * Test class for the ExternalContractor class
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */
public class ExternalContractorTest extends TestCase {

    private ExternalContractor sould;
    private Object diffSould;
    private Object homosould;
    private Object mariam;
    private Object lowerCaseSould;
    private Object nullSould;

    /**
     * sets up each test method before it runs
     */
    public void setUp() {
        sould = new ExternalContractor("Souldia", 56);
        diffSould = new Employee("Souldia", 50.36);
        homosould = new ExternalContractor("Souldia", 50.36);
        mariam = new ExternalContractor("Mariam", 50.36);
        lowerCaseSould = new ExternalContractor("souldia", 30.25);
        nullSould = null;
    }

    /**
     * test the method getHourlyRate for the ExternalContractor class
     */
    public void testGetHourlyRateOne() {
        assertEquals(38.50, sould.getHourlyRate(1), 0.01);
    }

    /**
     * test the method getHourlyRate for the ExternalContractor class
     */
    public void testGetHourlyRateTwo() {
        assertEquals(41.75, sould.getHourlyRate(2), 0.01);
    }

    /**
     * test the method getHourlyRate for the ExternalContractor class
     */
    public void testGetHourlyRateThree() {
        assertEquals(45.50, sould.getHourlyRate(3), 0.01);
    }

    /**
     * test the method getHourlyRate for the ExternalContractor class
     */
    public void testGetHourlyRateFive() {
        assertEquals(45.50, sould.getHourlyRate(5), 0.01);
    }

    /**
     * test the method weeklyPay for the ExternalContractor class
     */
    public void testWeeklyPayOne() {
        assertEquals(1540, sould.weeklyPay(40, 1), 0.01);
    }

    /**
     * test the method weeklyPay for the ExternalContractor class
     */
    public void testWeeklyPayTwo() {
        assertEquals(1670, sould.weeklyPay(40, 2), 0.01);
    }

    /**
     * test the method weeklyPay for the ExternalContractor class
     */
    public void testWeeklyPayThree() {
        assertEquals(1820, sould.weeklyPay(40, 3), 0.01);
    }

    /**
     * test the method weeklyPay for the ExternalContractor class
     */
    public void testWeeklyPayFive() {
        assertEquals(1820, sould.weeklyPay(40, 5), 0.01);
    }
    /**
     * test the method weeklyPay for the ExternalContractor class
     */
    public void testWeeklyPayNegative() {
        assertEquals(0, sould.weeklyPay(40, -1), 0.01);
    }
    /**
     * test the method weekly pay for two contractor
     */
    public void testEdqualsDiffRehan() {
        assertFalse(sould.equals(diffSould));
    }

    /**
     * test the method equal for two contractor
     */
    public void testEdqualsHomoRehan() {
        assertTrue(sould.equals(homosould));
    }

    /**
     * test the method equal for two contractor
     */
    public void testEdqualsMariam() {
        assertFalse(sould.equals(mariam));
    }

    /**
     * test the method equal for two contractor
     */
    public void testEdqualsLowerCaseSould() {
        assertFalse(sould.equals(lowerCaseSould));
    }

    /**
     * test the method equal for two contractor
     */
    public void test0EdqualsNullSould() {
        assertFalse(sould.equals(nullSould));
    }
}
