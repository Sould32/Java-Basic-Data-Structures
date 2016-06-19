package recursivetree;

//-------------------------------------------------------------------------
/**
 * Represents a binary tree of arbitrary structure. This class is different from
 * those in the textbook. It does not use a separate node class.
 *
 * @param <T>
 *            The type of data elements contained in the tree.
 *            Created by: John Lewis (lewis63) and Stephen Edwards (stedwar2)
 *            Revised (2015.04.30) by: Megan Rigsbee (mrigsbee)
 * 
 * @author <Souleymane Dia> <sould32> (~implementation)
 * @version <11/02/16>
 */
public class BinaryTree<T> {
    // ~ Instance/static variables .............................................

    private T element;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    // ~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a single binary tree node containing the given element and no
     * children.
     * 
     * @param value
     *            The data element to store in the new tree node.
     */
    public BinaryTree(T value) {
        element = value;
        left = null;
        right = null;
    }

    // ----------------------------------------------------------
    /**
     * Creates a single binary tree node containing the given element and child
     * subtrees.
     * 
     * @param value
     *            The data value to store on the new node.
     * @param leftChild
     *            A reference to the left child for the new node.
     * @param rightChild
     *            A reference to the right child for the new node.
     */
    public BinaryTree(T value, BinaryTree<T> leftChild,
            BinaryTree<T> rightChild) {
        element = value;
        left = leftChild;
        right = rightChild;
    }

    // ~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Get the data element in this node (i.e., stored at the root of this
     * tree).
     * 
     * @return This node's data element
     */
    public T getElement() {
        return element;
    }

    // ----------------------------------------------------------
    /**
     * Sets the data element in this node (i.e., store it at the root of this
     * tree).
     * 
     * @param value
     *            The new data value to store in this node
     */
    public void setElement(T value) {
        this.element = value;
    }

    // ----------------------------------------------------------
    /**
     * Get the left child of this node.
     * 
     * @return This node's left child, or null if none.
     */
    public BinaryTree<T> getLeft() {
        return left;
    }

    // ----------------------------------------------------------
    /**
     * Sets the left child of this node.
     * 
     * @param subtree
     *            A reference to the new left child for this node.
     */
    public void setLeft(BinaryTree<T> subtree) {
        left = subtree;
    }

    // ----------------------------------------------------------
    /**
     * Get the right child of this node.
     * 
     * @return This node's right child, or null if none.
     */
    public BinaryTree<T> getRight() {
        return right;
    }

    // ----------------------------------------------------------
    /**
     * Sets the right child of this node.
     * 
     * @param subtree
     *            A reference to the new right child for this node.
     */
    public void setRight(BinaryTree<T> subtree) {
        right = subtree;
    }

    // ----------------------------------------------------------
    /**
     * Calculate the size of this binary tree.
     * 
     * @return The size of this tree.
     */
    public int size() {
        int lChild = 0;
        int rChild = 0;
        if (right != null) {
            lChild = right.size();
        }
        if (left != null) {
            rChild = left.size();
        }
        return 1 + lChild + rChild;

        // Base case: current node has 0 children

        // Recursive Case 1: current node has 1 child on the left
        // Recursive Case 2: current node has 1 child on the right
        // Recursive Case 3: current node has 2 children
    }

    // ----------------------------------------------------------
    /**
     * Calculate the height of this binary tree. The height is longest path from
     * the root to a leaf node. Examples: A A A / / \ B B C Height: 1 2 2
     * 
     * @return The height of this tree.
     */
    public int height() {
        return height(this);
        // HINT: You may use the the max method from the Math
        // class to calculate the max of two values.
        // Syntax: Math.max(int, int)

        // Base case: current node has 0 children

        // Recursive case 1: current node has 1 child on the left
        // Recursive Case 2: current node has 1 child on the right

    }

    /**
     * @param tree
     *            to get the height
     * @return the height of the tree
     */
    private int height(BinaryTree<T> tree) {
        int longer = 0;
        if (tree != null) {
            longer = 1 + Math.max(height(tree.left), height(tree.right));
        }
        return longer;
    }

    // ----------------------------------------------------------
    /**
     * Produce a copy of this entire tree. The copy will contain duplicates of
     * all of the nodes in this tree, but will share references to the same data
     * values (i.e., this tree's node structure is duplicated, but the data
     * elements stored in the nodes are not).
     * 
     * @return A reference to a brand new duplicate of this tree.
     */
    public BinaryTree<T> clone() {
        BinaryTree<T> newOne = new BinaryTree<T>(element, left, right);

        // Create BinaryTree to hold clone.
        // Recursively copy the left subtree
        // Recursively copy the right subtree

        return newOne;
    }

    // ----------------------------------------------------------
    /**
     * Generate a string containing the "printed version" of this binary tree
     * using a pre-order traversal. The tree's contents are printed as a
     * parenthesized list.
     * 
     * Example: (A (B) (C)) Visually: A / \ Traversal: A B C B C
     * 
     * @return a printable representation of this tree's contents, using a
     *         pre-order traversal.
     */
    public String toPreOrderString() {
        StringBuilder info = new StringBuilder();
        info.append("(");
        info.append(element);
        if (left != null) {
            info.append(left.toPreOrderString());
        }
        if (right != null) {
            info.append(right.toPreOrderString());
        }
        info.append(")");
        return info.toString();
    }

    // ----------------------------------------------------------
    /**
     * Generate a string containing the "printed version" of this binary tree
     * using a in-order traversal. The tree's contents are printed as a
     * parenthesized list.
     * 
     * Example: ((B) A (C)) Visually: A / \ Traversal: B A C B C
     * 
     * @return a printable representation of this tree's contents, using an
     *         in-order traversal.
     */
    public String toInOrderString() {
        StringBuilder info = new StringBuilder();
        info.append("(");
        if (left != null) {
            info.append(left.toInOrderString());
        }
        info.append(element);
        if (right != null) {
            info.append(right.toInOrderString());
        }
        info.append(")");
        return info.toString();
    }

    // ----------------------------------------------------------
    /**
     * Generate a string containing the "printed version" of this binary tree
     * using a post-order traversal. The tree's contents are printed as a
     * parenthesized list.
     * 
     * For example, if a tree containing the data value A has a left child
     * containing B and a right child containing C, it would be printed as ((B)
     * (C) A). Visually: A / \ Traversal: B C A B C
     * 
     * The parentheses directly reflect the structure of each node in the tree.
     * 
     * @return a printable representation of this tree's contents, using a
     *         post-order traversal.
     */
    public String toPostOrderString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        if (left != null) {
            builder.append(left.toPostOrderString());
        }
        if (right != null) {
            builder.append(right.toPostOrderString());
        }
        builder.append(element);
        builder.append(")");

        return builder.toString();
    }
}
