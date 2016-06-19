package binarySearch;
//-------------------------------------------------------------------------
/**
 * Represents one event in a historical timeline.
 *
 * @author  Stephen Edwards
 * @author Souleymane Dia
 * @author maellis1
 * @version 11-10-2015
 */
public class HistoricEvent implements Comparable<HistoricEvent>
{
    //~ Instance/static variables .............................................

    private int year;
    private String title;
    private String description;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new HistoricEvent without a description.
     * @precondition title cannot be null
     * @param year The year the event occurred (A.D.)
     * @param title The title of the event
     */
    public HistoricEvent(int year, String title)
    {
        this(year, title, null);
    }


    // ----------------------------------------------------------
    /**
     * Create a new HistoricEvent.
     * @param year The year the event occurred (A.D.)
     * @param title The title of the event
     * @param description The description for the event
     */
    public HistoricEvent(int year, String title, String description)
    {
        this.year = year;
        if (title == null)
        {
            this.title = "No Title";
        } 
        else
        {
            this.title = title;
        }
        this.description = description;
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Get this event's year.
     * @return This event's year.
     */
    public int getYear()
    {
        return year;
    }


    // ----------------------------------------------------------
    /**
     * Get this event's title.
     * @return This event's title, which may be null.
     */
    public String getTitle()
    {
        return title;
    }


    // ----------------------------------------------------------
    /**
     * Get this event's description.
     * @return This event's description, which may be null.
     */
    public String getDescription()
    {
        return description;
    }


    // ----------------------------------------------------------
    /**
     * Generate a human-readable representation of this event.
     * @return This event in string form.
     */
    public String toString()
    {
        // When concatenating many strings to produce a result, it is more
        // efficient to use a string builder, rather than using '+' on strings.
        StringBuilder result = new StringBuilder();

        result.append('[');
        result.append(year);
        result.append("] ");
        result.append(title);
        if (description != null)
        {
            result.append(": ");
            result.append(description);
        }
        return result.toString();
    }


    /** 
     * compare two method 
     * @param data argument to be compared
     * @return return integer depending on the result
     */
    @Override
    public int compareTo(HistoricEvent data) {
        if (this.year - data.year < 0) {
            return -1;
        }
        else if (this.year - data.year > 0) {
            return 1;
        } 
        else {
            if (this.title.compareTo(data.title) < 0) {
                return -1;
            }
            else if (this.title.compareTo(data.title) > 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    
    

   
}
    
    
    

