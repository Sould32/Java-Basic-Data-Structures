package linkedlist;

/**
 * This is a basic implementation of a linked list
 *
 * @author Mark Wiggans (mmw125)
 * @version 4/14/2015
 * @author Christina Olk (colk)
 * @version 9.4.15
 * @author Grace Fields
 * @version 10.26.15
 * @author Souleymane Dia (~implementation)
 * @version<10/30/15>
 * 
 * @param <E>
 *            This is the type of object that this class will store
 */

public class SinglyLinkedList<E> implements LList<E> {

    public static class Node<T> {

        // The data element stored in the node.
        private T data;

        // The next node in the sequence.
        private Node<T> next;

        /**
         * Creates a new node with the given data
         *
         * @param data
         *            the data to put inside the node
         */
        public Node(T data) {
            this.data = data;
            next = null;
        }

        /**
         * Sets the node after this node
         *
         * @param next
         *            the node after this one
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }

        /**
         * @param data
         *            to be set
         */
        public void setData(T data) {
            this.data = data;
        }

        /**
         * Gets the next node
         *
         * @return the next node
         */
        public Node<T> next() {
            return next;
        }

        /**
         * Gets the data in the node
         *
         * @return the data in the node
         */
        public T getData() {
            return data;
        }
    }

    // the head of the linked list
    private Node<E> head;

    // the size of the linked list
    private int size;

    /**
     * Creates a new LinkedList object
     */
    public SinglyLinkedList() {
        head = null;
        size = 0;

    }

    /**
     * Gets the number of elements in the list
     *
     * @return the number of elements
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Adds the object to the position in the list
     *
     * @precondition obj cannot be null
     * @param index
     *            where to add the object
     * @param obj
     *            the object to add
     * @throws IndexOutOfBoundsException
     *             if index is less than zero or greater than size
     * @throws IllegalArgumentException
     *             if obj is null
     */
    @Override
    public void add(int index, E obj) {
        // check if the object is null
        if (obj == null) {
            throw new IllegalArgumentException("Object is null");
        }

        // check if the index is out of bounds
        if ((index < 0) || (index > size)) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        // empty stack case
        if (isEmpty()) {
            head = new Node<E>(obj);
        }
        else if (index == 0) {
            Node<E> newNode = new Node<E>(obj);
            newNode.setNext(head);
            head = newNode;
        }
        // all other cases
        else {
            Node<E> current = head;
            int currentIndex = 0;
            @SuppressWarnings("unused")
            boolean found = false;
            while ((current != null)) {
                if (currentIndex == (index - 1)) {
                    Node<E> before = current;
                    Node<E> nodeAt = (current.next);
                    Node<E> newNode = new Node<E>(obj);
                    before.setNext(newNode);
                    newNode.setNext(nodeAt);
                    found = true;
                }
                current = current.next;
                currentIndex++;
            }
        }
        size++;
    }

    /**
     * Adds the object to the end of the list.
     *
     * @precondition obj cannot be null
     * @param obj
     *            the object to add
     * @throws IllegalArgumentException
     *             if obj is null
     */
    @Override
    public void add(E obj) {
        // check if the object is null
        if (obj == null) {
            throw new IllegalArgumentException("Object is null");
        }

        Node<E> current = head;

        // empty stack case
        if (isEmpty()) {
            head = new Node<E>(obj);
        }

        // other cases
        else {
            while (current.next() != null) {
                current = current.next();
            }
            Node<E> newNode = new Node<E>(obj);
            current.setNext(newNode);
        }
        size++;
    }

    /**
     * Checks if the array is empty
     *
     * @return true if the array is empty
     */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Removes the first instance of the given object from the list
     *
     * @param obj
     *            the object to remove
     * @return true if successful
     */
    @Override
    public boolean remove(E obj) {
        Node<E> current = head;

        if (head == null) {
            return false;
        }
        // account for matching head
        if (obj.equals(current.data)) {
            head = head.next;
            size--;
            return true;
        }

        // account for 2+ size
        while (current.next != null) {
            if ((obj.equals(current.next.data))) {
                Node<E> before = current;
                Node<E> after = (current.next).next;
                before.setNext(after);
                size--;
                return true;
            }
            current = current.next;
        }

        // this accounts for the isEmpty case or the object does not exist
        return false;
    }

    /**
     * Removes the object at the given position
     *
     * @param index
     *            the position of the object
     * @return true if the removal was successful
     * @throws IndexOutOfBoundsException
     *             if there is not an element at the index
     */
    @Override
    public boolean remove(int index) {
        // // if the index is invalid
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        } 
        else {

            Node<E> current = head;
            int currentIndex = 0;

            // account for 1 size
            if ((index == 0) && (head != null)) {
                head = head.next;
                size--;
                return true;
            }
            // account for 2+ size
            while (current != null) {
                if (currentIndex == (index - 1)) {
                    Node<E> before = current;
                    Node<E> after = (current.next).next;
                    before.setNext(after);
                    size--;
                    return true;
                }
                current = current.next;
                currentIndex++;
            }
            // if the element was never found, this also handles empty case
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if no node at the given index
     */
    @Override
    public E get(int index) {

        Node<E> current = head;
        int currentIndex = 0;
        E data = null;
        while (current != null) {
            if (currentIndex == (index)) {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }

        // check if the data was null...
        if (data == null) {
            // ... if so throw an exception
            throw new IndexOutOfBoundsException("Index exceeds the size.");
        }
        return data;
    }

    /**
     * Checks if the list contains the given object
     *
     * @param obj
     *            the object to check for
     * @return true if it contains the object
     */
    @Override
    public boolean contains(E obj) {
        Node<E> current = head;
        while (current != null) {
            if (obj.equals(current.data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /**
     * Removes all of the elements from the list
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Gets the last time the given object is in the list
     *
     * @param obj
     *            the object to look for
     * @return the last position of it. -1 If it is not in the list
     */
    @Override
    public int lastIndexOf(E obj) {
        int lastIndex = -1;
        Node<E> current = head;
        int currentIndex = 0;
        while (current != null) {
            if (obj.equals(current.data)) {
                lastIndex = currentIndex;
            }
            currentIndex++;
            current = current.next;

        }
        return lastIndex;
    }

    /**
     * Returns a string representation of the list If a list contains A, B, and
     * C, the following should be returned "{A, B, C}" (Without the quotations)
     *
     * @return a string representing the list
     */
    @Override
    public String toString() {
        String result = "{";

        Node<E> current = head;
        while (current != null) {
            result += "" + current.data;
            current = current.next;
            if (current != null) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }
}
