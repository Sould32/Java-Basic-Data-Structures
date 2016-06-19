package binarySearch;

import student.TestCase;

/**
 * tests the static find methods for EventFinder
 * 
 * @author margaretellis
 * @version 11-11-2015
 *
 */
public class EventFinderTest extends TestCase {

    private HistoricEvent[] tcip;

    /**
     * method for initializing scenario between test methods
     */
    public void setUp() {

        // these instances are created for WebCAT JaCoCo's code coverage bug
        new EventFinder();
        tcip = new HistoricEvent[0];
        new TimelineEvents();
    }

    /**
     * test the first find
     */
    public void testFirstFind() {
        HistoricEvent madeUp = new HistoricEvent(1990, "lab");
        HistoricEvent made = new HistoricEvent(1995, "Java");
        assertEquals(4, EventFinder.find(madeUp, 
                TimelineEvents.TIMELINE, 3, 4));
        assertEquals(6, EventFinder.find(madeUp, 
                TimelineEvents.TIMELINE, 6, 5));
        assertEquals(4, EventFinder.find(madeUp, 
                TimelineEvents.TIMELINE, 3, 4));
        assertEquals(4, EventFinder.find(madeUp, 
                TimelineEvents.TIMELINE, 4, 6));
        assertEquals(5, EventFinder.find(made, 
                TimelineEvents.TIMELINE, 5, 5));
        assertEquals(5, EventFinder.find(made, 
                TimelineEvents.TIMELINE, 5, 6));
        assertEquals(6, EventFinder.find(TimelineEvents.TIMELINE[6], 
                TimelineEvents.TIMELINE, 4, 5));
        assertEquals(3, EventFinder.find(made, 
                TimelineEvents.TIMELINE, 5, 2));
        assertEquals(5, EventFinder.find(made, 
                TimelineEvents.TIMELINE, 5, 5));
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[3], TimelineEvents.TIMELINE, 0, 6), 3);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[3], TimelineEvents.TIMELINE, 3, 4), 3);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[2], TimelineEvents.TIMELINE, 0, 6), 2);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[2], TimelineEvents.TIMELINE, 1, 3), 2);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[2], TimelineEvents.TIMELINE, 3, 1), 2);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[2], TimelineEvents.TIMELINE, 2, 3), 2);
        assertEquals(1, EventFinder.find(TimelineEvents.
                TIMELINE[0], TimelineEvents.TIMELINE, 1, 6));
        assertEquals(6, EventFinder.find(TimelineEvents.
                TIMELINE[6], TimelineEvents.TIMELINE, 1, 5));
    }

    /**
     * test the first find
     */
    public void testSecFind() {
        HistoricEvent madeUp = new HistoricEvent(2015, "lab");
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[3], tcip), 0);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[3], TimelineEvents.TIMELINE), 3);
        assertEquals(EventFinder.find(TimelineEvents.
                TIMELINE[2], TimelineEvents.TIMELINE), 2);
        assertEquals(0, EventFinder.find(TimelineEvents.
                TIMELINE[0], TimelineEvents.TIMELINE));
        assertEquals(7, EventFinder.find(madeUp, 
                TimelineEvents.TIMELINE));
    }

}
