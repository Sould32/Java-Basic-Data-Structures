package employees;

//-------------------------------------------------------------------------
/**
 * Represents an average employee working 40 hours per week.
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */
public class Employee
{
    // ~ Fields ................................................................

    private String name;
    private double hourlyRate;

    // ~ Constructor ...........................................................
    /**
     * New Employee object.
     *
     * @param name
     *            Name of Employee
     * @param hourlyRate
     *            Pay rate of Employee (per hour).
     */
    public Employee(String name, double hourlyRate)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    // ~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Gets the employee's name.
     * 
     * @return the employee's name
     */
    public String getName() 
    {
        return name;
    }

    // ----------------------------------------------------------
    /**
     * Gets the pay rate (per hour).
     * 
     * @return the pay rate
     */
    public double getHourlyRate() 
    {
        return hourlyRate;
    }

    // ----------------------------------------------------------
    /**
     * Amount paid to the employee for an average 40 hour work week.
     * 
     * @return weekly Weekly pay for employee
     */
    public double weeklyPay() 
    {
        return hourlyRate * 40;
    }

    // ------------------------------------------------------------
    /*
     * Check if two Employee object are the same
     * 
     * @param Object an Employee object
     * 
     * @return true if two the Employee are aliases
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (this.getClass() == obj.getClass())
        {
            Employee other = (Employee) obj;
            return name.equals(other.name);
        } 
        else
        {
            return false;
        }
    }

}