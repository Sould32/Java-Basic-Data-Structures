package deque;


/**
 * A deque implemented using a doubly-linked chain with sentinel nodes at each
 * end.
 *
 * @param <T>
 *            The type of elements contained in the deque.
 *
 * @author <Souleymane> <sould32>
 * @version <10/23/2015>
 */
public class Lab08Deque<T> extends DLinkedDeque<T>
{

    /**
     * Inserts a new item at the front of the deque.
     * 
     * @param data
     *            the item to insert.
     */
    public void addToFront(T data)
    {
        DLNode<T> newNode = new DLNode<T>(null, data, firstNode);
        if (isEmpty()) {
            lastNode = newNode;
        }
        else
        {
            firstNode.setPreviousNode(newNode);
        }
        firstNode = newNode;
        size++;
    } // end addToFront

    /**
     * Insert a new item at the rear of the deque.
     * 
     * @param data
     *            the item to insert.
     */
    public void addToBack(T data)
    {
        DLNode<T> newNode = new DLNode<T>(lastNode, data, null);
        if (isEmpty()) {
            firstNode = newNode;
        }
        else
        {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        size++;
    } // end addToBack

    /**
     * Remove the item at the front of the deque.
     * 
     * @return The item that was removed
     * @throws EmptyQueueException
     *             if there is not an element at the front
     */
    public T removeFront()
    {
        T data = getFront();
        firstNode = firstNode.getNextNode();
        if (firstNode == null) {
            lastNode = null;
        }
        else
        {
            firstNode.setPreviousNode(null);
        }
        size--;
        return data;
    } // end removeFront

    /**
     * Remove the item at the rear of the deque.
     * 
     * @return The item that was removed
     * @throws EmptyQueueException
     *                  if there is no element at the front
     */
    public T removeBack()
    {
        T data = getBack();
        lastNode.setData(null);
        lastNode = lastNode.getPreviousNode();
        if (lastNode == null) {
            firstNode = null;
        }
        else
        {
            lastNode.setNextNode(null);
        }
        size--;
        return data;
    } // end removeBack

    /**
     * Get the item at the front (the head) of the deque. Does not alter the
     * deque.
     * 
     * @return the item at the front of the deque.
     * @throws EmptyQueueException
     *                     if no element at the front
     */
    public T getFront()
    {
        if (isEmpty())
        {
            throw new EmptyQueueException();
        }
        return firstNode.getData();
    } // end getFront

    /**
     * Get the item at the rear (the tail) of the deque. Does not alter the
     * deque.
     * 
     * @return the item at the rear of the deque.
     * @throws EmptyQueueException
     *              if  no element at rear
     *            
     */
    public T getBack()
    {
        if (isEmpty())
        {
            throw new EmptyQueueException();
        }
        return lastNode.getData();
    } // end getBack

    /**
     * Check if the deque is empty
     * 
     * @return true if the deque has no items
     */
    public boolean isEmpty()
    {
        return size == 0;
    } // end isEmpty

    /**
     * Empty the deque.
     */
    public void clear()
    {
        firstNode = null;
        lastNode = null;
        size = 0;
    } // end clear

    // ----------------------------------------------------------
    /**
     * Returns a string representation of this deque. A deque's string
     * representation is written as a comma-separated list of its contents (in
     * front-to-rear order) surrounded by square brackets, like this:
     * 
     * [52, 14, 12, 119, 73, 80, 35]
     * 
     * An empty deque is simply [].
     *
     * @return a string representation of the deque
     */
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");
        DLNode<T> p = firstNode;
        while (p != null)
        {
            if (s.length() > 1) {
                s.append(", ");
            }
            s.append(p.getData());
            p = p.getNextNode();
        }
        s.append("]");
        return s.toString();
    }
    /**
     * Removes and returns the second entry of this deque The front entry stays
     * the same and the third entry becomes the second.
     * 
     * @return The second object of the deque. Null, if it doesn't exist.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    public T removeSecond()
    {
        if(size >= 2){
            DLNode<T> secondData = firstNode.getNextNode();
            T data = secondData.getData();
            secondData.setData(null);
            DLNode<T> afterSecondData = secondData.getNextNode();
            firstNode.setNextNode(afterSecondData);
            if (afterSecondData != null){
                afterSecondData.setPreviousNode(firstNode);
            }else{
                lastNode = firstNode;
            }
            size--;
            return data;
        }
        else{
            return null;
        }
    }

    /**
     * Removes and returns the front/back entry of this deque.
     * 
     * @return The object at the front/back of the deque. Null, if it doesn't
     *         exist.
     * @throws EmptyQueueException if the deque is empty before the operation.
     */
    public T removeSecondToLast()
    {
        if(size >= 2){
            DLNode<T> secondData = lastNode.getPreviousNode();
            T data = secondData.getData();
            secondData.setData(null);
            DLNode<T> afterSecondData = secondData.getPreviousNode();
            lastNode.setPreviousNode(afterSecondData);
            if (afterSecondData != null){
                afterSecondData.setNextNode(lastNode);
            }else{
                firstNode = lastNode;
            }
            size--;
            return data;
        }
        else{
            return null;
        }
    } // end removeSecondToLast
}
