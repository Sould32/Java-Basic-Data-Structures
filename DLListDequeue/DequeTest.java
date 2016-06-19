package deque;

import student.TestCase;

/**
 * Tests for the DLinkedDeque class.
 *
 * @author <Souleymane Dia> <sould32>
 * @version <10/23/2015>
 */
public class Lab08DequeTest extends TestCase {

    private Lab08Deque<String> deque;
    private Lab08Deque<String> line;
    private Lab08Deque<String> guarage;

    /**
     * Creates two brand new, empty sets for each test method.
     */
    public void setUp() {
        deque = new Lab08Deque<String>();
        line = new Lab08Deque<String>();
        guarage = new Lab08Deque<String>();
    }

    /**
     * test addToFront
     */
    public void testAddToFront() {
        deque.addToFront("banana");
        assertEquals(1, deque.size());
        deque.removeFront();
        assertTrue(deque.isEmpty());
    }

    /**
     * test addToBack
     */
    public void testAddToBack() {
        deque.addToBack("banana");
        assertEquals(1, deque.size());
        deque.removeBack();
        assertTrue(deque.isEmpty());
        deque.addToBack("banana");
        assertEquals("banana", deque.getBack());
    }

    /**
     * test remove front
     */
    public void testRemoveFront() {
        line.addToBack("patient1");
        line.addToFront("patient2");
        line.addToFront("doctor");
        line.addToBack("pedestrian");
        assertEquals("doctor", line.removeFront());
        assertEquals("patient2", line.removeFront());
    }

    /**
     * test empty remove front
     */
    public void testNullRemoveFront() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = line.removeFront();
        } catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof EmptyQueueException); // checks
                                                            // which
        // exception was
        // thrown
    }

    /**
     * test remove front
     */
    public void testRemoveBack() {
        deque.addToFront("patient1");
        deque.addToFront("patient2");
        deque.addToFront("doctor");
        deque.addToFront("pedestrian");
        assertEquals("patient1", deque.removeBack());
        assertEquals("patient2", deque.removeBack());
    }

    /**
     * test empty remove front
     */
    public void testNullRemoveBack() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = deque.removeBack();
        } catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof EmptyQueueException); // checks
                                                            // which
        // exception was
        // thrown
    }

    /**
     * test remove front
     */
    public void testgetFront() {
        line.addToBack("patient1");
        line.addToFront("patient2");
        line.addToFront("doctor");
        line.addToBack("pedestrian");
        assertEquals("doctor", line.getFront());
        assertEquals("pedestrian", line.getBack());
        assertEquals("doctor", line.getFront());
        line.removeFront();
        assertEquals("patient2", line.getFront());
    }

    /**
     * test empty remove front
     */
    public void testNullGetFront() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = line.getFront();
        } catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof EmptyQueueException); // checks
                                                            // which
        // exception was
        // thrown
    }

    /**
     * test getBack
     */
    public void testgetBack() {
        deque.addToBack("patient1");
        deque.addToFront("patient2");
        deque.addToFront("doctor");
        deque.addToBack("pedestrian");
        assertEquals("pedestrian", deque.getBack());
        assertEquals("doctor", deque.getFront());
        assertEquals("pedestrian", deque.getBack());
    }

    /**
     * test empty remove front
     */
    public void testNullGetBack() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = line.getBack();
        } catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof EmptyQueueException); // checks
                                                            // which
        // exception was
        // thrown
    }

    /**
     * test the empty method
     */
    public void testEmpty() {
        assertTrue(line.isEmpty());
        line.addToBack("data");
        assertFalse(line.isEmpty());
        assertEquals(1, line.size());
    }

    /**
     * test the clear method
     */
    public void testSize() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        assertEquals(3, guarage.size());
        guarage.removeBack();
        assertEquals(2, guarage.size());
    }

    /**
     * test to array
     *//*
         * public void testToArray(){ guarage.toArray();
         * guarage.addToBack("cool"); guarage.addToFront("Toyota");
         * guarage.addToFront("Tesla"); guarage.addToBack("sports car");
         * guarage.toArray(); }
         */
    /**
     * test remove second
     */

    public void testRemoveSec() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        assertEquals("yellow", guarage.removeSecond());
        assertEquals(2, guarage.size());
        assertEquals("red", guarage.getFront());
        assertEquals("blue", guarage.getBack());
        assertEquals("blue", guarage.removeSecond());
    }

    /**
     * test remove remove second
     */

      public void testRemoveS(){
          line.addToBack("data");
          assertNull(line.removeSecond());
          assertNull(line.removeSecondToLast()); 
      }
    
    /**
     * remoove 
     */
    public void testRemoveSecLast() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        guarage.addToBack("ferrari");
        assertEquals("blue", guarage.removeSecondToLast());
        assertEquals(3, guarage.size());
        assertEquals("red", guarage.getFront());
        assertEquals("ferrari", guarage.getBack());
        assertEquals("yellow", guarage.removeSecondToLast());
        assertEquals("red", guarage.removeSecondToLast());
    }

    /**
     * test clear
     */
    public void testClear() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        guarage.clear();
        assertTrue(guarage.isEmpty());
    }

    /**
     * test to string method
     */
    public void testToString() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        line.addToFront("vanilla");
        line.addToFront("banana");
        assertEquals("[banana, vanilla]", line.toString());
        guarage.clear();
        assertEquals("[]", guarage.toString());
    }

    /**
     * test isEmpty
     */
    public void testNullEmpty() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        guarage.firstNode = null;
        assertFalse(guarage.isEmpty());
    }

    /**
     * test isEmpty
     */
    public void testNullEmpti() {
        guarage.addToFront("blue");
        guarage.addToFront("yellow");
        guarage.addToFront("red");
        guarage.lastNode = null;
        assertFalse(guarage.isEmpty());
    }
}
