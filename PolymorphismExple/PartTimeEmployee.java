package employees;

/**
 * Represents a part time employee working less than 40 hours per week.
 *
 * @author Souleymane Dia (Sould32)
 * @version 2015.09.03
 */
public class PartTimeEmployee extends Employee {

    private int hours;

    /**
     * constructor that initialize name, hourly rate and hours with the help of
     * the superclass
     * 
     * @param name Name of the Part time employee
     * @param hourlyRate hourly pay of the part time employee 
     * @param hours total hour worked by the part time employee
     */
    public PartTimeEmployee(String name, double hourlyRate, int hours) {
        super(name, hourlyRate);
        this.hours = hours;
    }

    /**
     * @return the hour amount of hour worked by a part timer
     */
    public int getHoursWorked() {
        return hours;
    }

    /*
     * override to the Employee weeklyPay for a partTimeEmployee
     * 
     * @return PartTmimeEmployee weeklyPay
     */
    @Override
    public double weeklyPay() {
        return getHourlyRate() * hours;
    }

}
