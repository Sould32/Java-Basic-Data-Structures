package binarySearchTree;

import student.TestCase;

/**
 * @author Souleymane
 * @version <12/05/2015>
 */
public class Lab13BinarySearchTreeTest extends TestCase {

    private Lab13BinarySearchTree<Integer> phoneContact;

    /**
     * set instance fields
     */
    public void setUp() {
        phoneContact = new Lab13BinarySearchTree<Integer>();
        phoneContact.insert(10);
        phoneContact.insert(9);
        phoneContact.insert(5);
    }

    /**
     * test insert
     */
    public void testInsert() {
        phoneContact.insert(15);
        assertFalse(phoneContact.isEmpty());
        assertNotNull(phoneContact.findMax());
        assertNotNull(phoneContact.findMin());

        System.out.println(phoneContact.findMax());
        System.out.println(phoneContact.findMin());

    }

    /**
     * test the remove method
     */
    public void testRemove() {
        phoneContact.insert(15);
        phoneContact.insert(2);
        phoneContact.remove(2);
        int result = phoneContact.findMin();
        assertEquals(5, result);

        phoneContact.insert(4);
        phoneContact.insert(1);
        phoneContact.remove(5);
        phoneContact.insert(2);
        phoneContact.insert(5);

        phoneContact.insert(20);
        phoneContact.insert(14);
        phoneContact.insert(13);
        phoneContact.insert(12);
        phoneContact.remove(12);
        phoneContact.remove(15);
        phoneContact.remove(4);
        String str = "(1, 2, 5, 9, 10, 13, 14, 20)";
        assertEquals(str, phoneContact.toString());
    }

    /**
     * test remove item not present
     */
    public void testRemoved() {
        Exception exception = null;
        try {
            phoneContact.remove(50);
        }
        // catch exception
        catch (ItemNotFoundException e) {
            exception = e;
        }
        assertNotNull(exception);
    }

    /**
     * test duplicate entry
     */
    public void testDuplicate() {
        Exception exception = null;
        try {
            phoneContact.insert(9);
        }
        // catch exception
        catch (DuplicateItemException e) {
            exception = e;
        }
        assertNotNull(exception);
    }

    /**
     * test find method
     */
    public void testFind() {
        int result = phoneContact.find(9);
        assertEquals(9, result);
        assertNull(phoneContact.find(50));
    }

    /**
     * test empty
     */
    public void testEmpty() {
        phoneContact.makeEmpty();
        assertTrue(phoneContact.isEmpty());
    }

    /**
     * test the findMin method
     */
    public void testFindMin() {
        Lab13BinarySearchTree<String> num = new Lab13BinarySearchTree<String>();
        assertNull(num.findMin());
        assertEquals(num.toString(), "()");
    }

    /**
     * test the findMax method
     */
    public void testFindMax() {
        Lab13BinarySearchTree<String> num = new Lab13BinarySearchTree<String>();
        assertNull(num.findMax());
        assertEquals(num.toString(), "()");
        num.insert("empty");
        num.remove("empty");
        assertTrue(num.isEmpty());
    }
}
