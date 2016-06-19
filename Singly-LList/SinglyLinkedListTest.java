/**
 * 
 */
package linkedlist;

import student.TestCase;

/**
 * @author Souleymane<sould32>
 * @version <10/30/2015>
 *
 */
public class SinglyLinkedListTest extends TestCase {

    private SinglyLinkedList<String> list;
    private SinglyLinkedList<String> line;
    private SinglyLinkedList<String> guarage;
    private SinglyLinkedList.Node<String> node;

    /**
     * Creates two brand new, empty sets for each test method.
     */
    public void setUp() {
        node = new SinglyLinkedList.Node<String>("hungry");
        list = new SinglyLinkedList<String>();
        line = new SinglyLinkedList<String>();
        guarage = new SinglyLinkedList<String>();
        list.add("orange");
        list.add("apple");
        list.add("banana");
        list.add("pineapple");
    }

    /**
     * test getData
     */
    public void testNode() {
        assertEquals("hungry", node.getData());
    }

    /**
     * test addToFront
     */
    public void testAdd() {

        assertEquals(4, list.size());
        assertTrue(list.remove(2));
        list.add(0, "melon");
        assertEquals(4, list.size());
    }

    /**
     * add with exception
     */
    public void testAddNul() {
        Exception thrown = null;
        try {
            list.add(-5, "hello");
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * add with exception
     */
    public void testAddNullObject() {
        Exception thrown = null;
        try {
            String str = null;
            list.add(2, str);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IllegalArgumentException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * add with exception
     */
    public void testAddNull() {
        Exception thrown = null;
        try {
            String str = null;
            guarage.add(str);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IllegalArgumentException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * test addWithIndex
     */

    public void testAddPosition() {
        list.add(1, "grapes");
        list.add(3, "water");
        list.add(6, "bottle");
        assertEquals(7, list.size());
        line.add(0, "red");
        assertEquals(1, line.size());
    }

    /**
     * add with exception
     */
    public void testAddOutBound() {
        Exception thrown = null;
        try {
            String str = "outIndex";
            guarage.add(5, str);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * add with exception
     */
    public void testAddNullObj() {
        Exception thrown = null;
        try {
            String str = null;
            line.add(str);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IllegalArgumentException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * test empty
     */
    public void testEmpty() {
        assertTrue(line.isEmpty());
        line.add("data");
        assertFalse(line.isEmpty());
        assertEquals(1, line.size());
    }

    /**
     * test remove front
     */
    public void testRemoveFront() {
        assertFalse(guarage.remove("noCarsYet"));
        assertTrue(list.remove(0));
        list.remove("banana");
        list.remove("apple");
        assertEquals(1, list.size());
        list.add(1, "grapes");
        list.add(2, "water");
        list.add(3, "bottle");
        list.remove("pineapple");
        assertFalse(list.remove("cool"));
    }

    /**
     * add with exception
     */
    public void testRemov() {
        list.remove("orange");
        Exception thrown = null;
        try {
            line.remove(-10);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * add with exception
     */
    public void testRemo() {
        Exception thrown = null;
        try {
            line.remove(10);
        }
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * test empty
     */
    public void testEmptyList() {
        list.remove("banana");
        list.remove("apple");
        list.remove("pineapple");
        assertTrue(list.remove(0));
    }
    /**
     * add with exception
     */
    public void testRem() {
        Exception thrown = null;
        try {
            guarage.remove(0);

        }
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }
    /**
     * test contain
     */
    public void testContains() {
        assertTrue(list.contains("apple"));
        assertFalse(list.contains("vagetarien"));
        list.add("water");
    }

    /**
     * test empty remove front
     */
    public void testClear() {
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    /**
     * test get
     */
    public void testGet() {
        assertEquals("banana", list.get(2));
        assertEquals("apple", list.get(1));
        assertEquals("pineapple", list.get(3));
    }

    /**
     * add with exception
     */
    public void testGetNullObj() {
        Exception thrown = null;
        try {
            line.get(10);
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException); // checks
        // which
        // exception was
        // thrown
    }

    /**
     * test last index
     */
    public void testLastIndex() {
        assertEquals(2, list.lastIndexOf("banana"));
        assertEquals(0, list.lastIndexOf("orange"));
        assertEquals(3, list.lastIndexOf("pineapple"));
    }

    /**
     * test the toString
     */
    public void testToString() {
        guarage.add("vanilla");
        guarage.add("banana");
        assertEquals("{vanilla, banana}", guarage.toString());
        guarage.clear();
        assertEquals("{}", guarage.toString());
    }

}
