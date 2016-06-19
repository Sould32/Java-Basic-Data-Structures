/**
 * class rep
 */
package arraystack;

import student.TestCase;
/**
 * 
 * @author Souleymane
 * @version 10/02/2015
 */
public class ArrayBasedStackTest extends TestCase {
    private ArrayBasedStack<String> emptyStack;
    private ArrayBasedStack<String> stackFruit;
    private ArrayBasedStack<String> stackFruitCopy;
    private ArrayBasedStack<String> fruitCopy;
    private ArrayBasedStack<String> copy;

    /**
     * set up the instance variable and object
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void setUp() {
        stackFruit = new ArrayBasedStack();
        stackFruit.push("fruit");
        stackFruit.push("nuts");
        stackFruit.push("chips");

        emptyStack = new ArrayBasedStack();

        stackFruitCopy = new ArrayBasedStack(5);
        stackFruitCopy.push("fruit");
        stackFruitCopy.push("nuts");
        stackFruitCopy.push("chips");
        
        fruitCopy = new ArrayBasedStack(5);
        fruitCopy.push("chips");
        fruitCopy.push("banana");
        fruitCopy.push("nuts");
        
        copy = new ArrayBasedStack(5);
        copy.push("chips");
        copy.push("banana");
        copy.push("loo");
        copy.push("apple");
    }

    /**
     * test the isEmpty method
     */
    public void testIsEmpty() {
        assertFalse(stackFruit.isEmpty());
        assertTrue(emptyStack.isEmpty());
    }

    /**
     * test the peek method
     */
    public void testNullPeek() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = emptyStack.peek();
        } 
        catch (Exception exception) 
        {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof java.util.EmptyStackException); // checks
                                                                        // which
        // exception was
        // thrown
    }

    /**
     * test the peek method
     */
    public void testPeek() {
        assertEquals("chips", stackFruit.peek());
    }

    /**
     * test the pop method
     */
    public void testPop() {
        assertEquals("chips", stackFruit.pop());
        assertEquals("nuts", stackFruit.pop());
    }

    /**
     * test pop method for empty stack
     */
    public void testEmptyPop() {
        Exception thrown = null;
        try {
            @SuppressWarnings("unused")
            String empty = emptyStack.pop();
        } 
        catch (Exception exception) 
        {
            thrown = exception;
        }
        assertNotNull(thrown); // checks that an exception was actually thrown
        assertTrue(thrown instanceof java.util.EmptyStackException); // checks
                                                                        // which
        // exception was
        // thrown
    }

    /**
     * test the push method
     */
    public void testPush() {
        emptyStack.push("orange");
        emptyStack.push("not empty");
        assertEquals(2, emptyStack.size());
    }
    /**
     * test the push method
     */
    public void testFullPush() {
        for ( int i = 0 ; i < 7; i++ ) {
            stackFruitCopy.push("fruit");
        }
        assertEquals(10, stackFruitCopy.size() );
        emptyStack.push("orange");
        emptyStack.push("not empty");
        assertEquals(2, emptyStack.size());
    }

    /**
     * test the contains method
     */
    public void testContains() {
        assertTrue(stackFruit.contains("fruit"));
        assertFalse(emptyStack.contains("peach"));
        assertFalse(stackFruit.contains("cool"));
    }
    /**
     * test the size method
     */
    public void testEmptySize() {
        assertEquals(0, emptyStack.size());
    }

    /**
     * test the size method for non empty
     */
    public void testSize() {
        assertEquals(3, stackFruit.size());
        assertEquals(0, emptyStack.size());
        emptyStack.push("orange");
        assertEquals(1, emptyStack.size());
    }

    /**
     * test the clear method
     */
    public void testClear() {
        stackFruit.clear();
        assertEquals(0, stackFruit.size());
    }

    /**
     * test the toArray method
     */
    public void testToArray() {
        assertEquals("fruit", stackFruit.toArray()[0]);
        assertEquals("nuts", stackFruit.toArray()[1]);

    }

    /**
     * test the toString method
     */
    public void testEmptyToString() {
        assertEquals("[]", emptyStack.toString());
        assertEquals("[fruit, nuts, chips]", stackFruit.toString());
    }

    /**
     * test the toString method
     */
    public void testToString() {
        int space = 0;
        int semicolon = 0;
        assertEquals('[', stackFruit.toString().charAt(0));
        assertEquals(']', stackFruit.toString().charAt(stackFruit.
                toString().length() - 1));
        for (int i = 0; i < stackFruit.toString().length(); i++) {
            if (stackFruit.toString().charAt(i) == (' ')) {
                space++;
            }
            else if (stackFruit.toString().charAt(i) == (',')) 
            {
                semicolon++;
            }
        }
        assertEquals(semicolon, stackFruit.size() - 1);
        assertEquals(space, stackFruit.size() - 1);
    }

    /**
     * test the equal method
     */
    public void testEqual() {
        emptyStack = null;
        assertTrue(stackFruit.equals(stackFruit));
        assertTrue(stackFruit.equals(stackFruitCopy));
        assertFalse(stackFruit.equals("fruit"));
        assertFalse(stackFruit.equals(new Object()));
        assertFalse(stackFruit.equals(emptyStack));
        assertFalse(stackFruit.equals(fruitCopy));
        assertFalse(stackFruit.equals(copy));
    }

}
