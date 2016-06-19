/**
 * class to rep
 * 
 */
package arraystack;

import java.util.EmptyStackException;
/**
 * 
 * @author Souleymane
 *@version 10/02/2015
 * @param <T> type 
 */
public class ArrayBasedStack<T> implements StackADT<T> {

    private T[] myArray;    
    private int size = 0;
    private int capacity;
    /**
     * constructor
     * @param capacity the init capa
     */
    @SuppressWarnings("unchecked")
    public ArrayBasedStack(int capacity) {
        @SuppressWarnings("unused")
        T[] stack = (T[]) new Object[capacity];
        myArray = stack;
        size = 0;
        this.capacity = capacity;
    }
    /**
     * default
     */
    public ArrayBasedStack() {
        this(100);
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#peek()
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myArray[size - 1];
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#pop()
     */
    @Override
    public T pop() {
        T top = peek();
        size--;
        return top;        
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#push(java.lang.Object)
     */
    @Override
    public void push(T item) {
        if (arrayFull()) {
            expandCapacity();
        }
        myArray[size] = item;
        size++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#contains(java.lang.Object)
     */
    @Override
    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(myArray[i])) {
                return true;
            }
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#size()
     */
    @Override
    public int size() {
        return size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#clear()
     */
    @Override
    public void clear() {
        size = 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see arraystack.StackADT#toArray()
     */
    @Override
    public Object[] toArray() {
        Object[] temp = new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = myArray[i];
        }
        return temp;
    }

    /**
     * Expands the capacity of the stack by doubling its current capacity.
     */
    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        T[] temp = (T[]) new Object[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;
        capacity = capacity * 2;
    }
    /**
     * private method
     * @return true or false
     */
    private boolean arrayFull() {
        return size == capacity;
    }

    /**
     * Represents the stack as a string
     *
     * [] for empty stack
     *
     * bottom ............top of stack
     *
     * [ one, two, three, four] for a non empty stack
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        int iMax = size() - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0;; i++) {
            builder.append(String.valueOf(myArray[i])); // will print null or
                                                        // the
                                                        // toString
            if (i == iMax) // we will always get to here at some point
            {
                // we are at the last element, so we do not want a comma so just
                // place the last bracket and return
                return builder.append(']').toString();
            }
            builder.append(", ");
        }
    }

    /**
     * 2 Stacks are defined as being equal if they both contain the same number
     * of elements and equal (as defined by the respective equals()) elements in
     * the same order
     *
     * @param obj
     *            the other object to compare to this
     *
     * @return true if this and obj are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(this.getClass())) {
            // as it is generic
            @SuppressWarnings("unchecked")
            ArrayBasedStack<T> other = (ArrayBasedStack<T>) obj;
            Object[] otherArray = other.toArray();
            if (size() != other.size()) {
                return false;
            }
            for (int i = 0; i < size(); i++) {

                if (!(myArray[i].equals(otherArray[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
