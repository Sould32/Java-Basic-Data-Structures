/**
 * 
 */
package employees;

/**
 * Represents an External Contractor working paid ny project or hour.
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */
public class ExternalContractor extends Employee
{
    /**
     * New Employee object.
     *
     * @param name
     *            Name of Employee
     * @param hourlyRate
     *            Pay rate of Employee (per hour).
     */
    public ExternalContractor(String name, double hourlyRate)
    {
        super(name, hourlyRate);
    }

    /**
     * @precondition CustomerRank must be positive 
     *               and between 1 and 3 any number
     *               greater 3 will return 3 as the rank,
     * @param customerRank determine the customer rank
     * @return hourly rate
     */
    public double getHourlyRate(int customerRank) {
        double payRate = 0;
        switch (customerRank) 
        {
            case 1:
                payRate = 38.50;
                return payRate;
            case 2:
                payRate = 41.75;
                return payRate;
            case 3:
                payRate = 45.50;
                return payRate;
            default:
                if (customerRank > 3)
                {
                    payRate = 45.50;
                }
                return payRate;
        }
    }

    /**
     * The amount paid per week.
     * 
     * @precondition custRank must be positive
     * @param hours
     *            The number of hours worked per week.
     * @param custRank
     *            The customer's rank (1 - 3)
     * @return Returns the amount paid for a certain week.
     */
    public double weeklyPay(int hours, int custRank)
    {
        return getHourlyRate(custRank) * hours;
    }
}
