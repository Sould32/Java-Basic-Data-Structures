/**
 * @author Souleymane <sould32>
 * @version <2015>
 */
package binarySearchTree;

import student.TestCase;

/**
 * @author Souleymane
 * @version <Dec 5, 2015>
 */
public class ContactTest extends TestCase {

    private Contact henry;
    private Lab13BinarySearchTree<Contact> phoneContact;
    private Contact nasri;
    private Contact allen;
    private Contact zou;

    /**
     * set up instnace fields
     */
    public void setUp() {
        henry = new Contact();
        henry.setFirstName("Therry");
        henry.setLastName("Henry");
        henry.setPhoneNumber("000 111 222");
        phoneContact = new Lab13BinarySearchTree<Contact>();
        nasri = new Contact("Therry", "Henry", "000 111 122");
        allen = new Contact("Allen", "Cradle", "000 111 322");
        zou = new Contact("Allen", "Henry", "000 111 322");
    }

    /**
     * test setter
     */
    public void testSetMthds() {
        assertEquals(henry.compareTo(nasri), 1);
        assertEquals(nasri.compareTo(henry), -1);
        assertEquals(henry.compareTo(henry), 0);
        assertEquals(allen.compareTo(henry), -1);
        assertEquals(henry.compareTo(allen), 1);
        assertEquals(zou.compareTo(henry), -1);
        assertEquals(henry.compareTo(zou), +1);
    }

    /**
     * test insert
     */
    public void testInsert() {
        phoneContact.insert(henry);
        assertFalse(phoneContact.isEmpty());
        assertNotNull(phoneContact.findMax());
        assertNotNull(phoneContact.findMin());
    }

    /**
     * test the remove method
     */
    public void testRemove() {
        phoneContact.insert(henry);
        phoneContact.insert(allen);

        phoneContact.remove(henry);
        Contact result = phoneContact.findMin();
        assertEquals(allen.toString(), result.toString());

        phoneContact.insert(nasri);
        phoneContact.insert(zou);
        String str = "(" + allen.toString() + ", " + zou.toString() + ", "
                + nasri.toString() + ", " + henry.toString() + ")";
        assertEquals(str, phoneContact.toString());
    }

    /**
     * test remove item not present
     */
    public void testRemoved() {
        Exception exception = null;
        try {
            phoneContact.remove(nasri);
        }
        // catch
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
            phoneContact.insert(henry);
            phoneContact.insert(allen);
            phoneContact.insert(henry);
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
        phoneContact.insert(henry);
        phoneContact.insert(allen);
        Contact result = phoneContact.find(henry);
        assertEquals(henry, result);
        assertNull(phoneContact.find(zou));
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
    }

}
