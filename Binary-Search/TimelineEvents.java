package binarySearch;
//-------------------------------------------------------------------------
/**
 * This class provides a single constant definition that represents a
 * timeline of when different programming languages were created.
 * The timeline is represented in the form of an array of
 * {@link HistoricEvent} objects.
 *
 * This timeline is partially taken from
 * http://visual.ly/history-programming-languages.
 *
 *  @author Alexandra LaMontagne alamon
 *  @version Apr 29, 2015
 */
public class TimelineEvents
{
    // ----------------------------------------------------------
    /**
     * The timeline of events in the history of computing.
     */
    public static final HistoricEvent[] TIMELINE = {
        new HistoricEvent(1883, "Ada Lovelace",
            "Ada Lovelace credited with first computer programming language;"
            + " wrote an algorithm for the Analytical Engine (early mechanical"
            + " computer)."),

        new HistoricEvent(1972, "C",
            "C was created by Dennis Ritchie in Bell Labs and the name \"C\""
            + " was based on an earlier language called \"B\"."),

        new HistoricEvent(1983, "C++",
            "C++ is used by Adobe, Google Chrome, Firefox, and Internet"
            + " Explorer and the name \"C++\" was formerly C with Classes;"
            + " ++ is the increment operator in \"C\"."),

        new HistoricEvent(1987, "Perl",
            "Perl is used by IMDb and Amazon and was named \"Perl\""
            + " because \"Pearl\" was already taken."),

        new HistoricEvent(1991, "Python",
            "Python is used by Google, Yahoo, and Spotify and was named for"
            + " the British comedy troupe Monty Python."),

        new HistoricEvent(1995, "Java",
            "Java was created by James Gosling at Sun Microsystems and was"
            + " named for the amount of coffee consumed while developing"
            + " the language."),

        new HistoricEvent(1995, "Javascript",
            "Javascript is used by Gmail, Firefox, and Adobe Photoshop and was"
            + " named \"Javascript\" because it was the final choice after"
            + " \"Mocha\" and \"Livescript\".")
    };
}
