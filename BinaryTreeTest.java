/**
 * @author Souleymane <sould32>
 * @version <2015>
 */
package recursivetree;

import student.TestCase;

/**
 * @author Souleymane <souldia32>
 * 
 * @version <Nov 23, 2015>
 */
public class BinaryTreeTest extends TestCase {

    private BinaryTree<String> aphabet;

    /**
     * @throws java.lang.Exception
     */

    public void setUp() {

        aphabet = new BinaryTree<String>("A");

    }

    /**
     * main method test
     */
    public void testSetGetters() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals("B", aphabet.getLeft().getElement());
        assertEquals("C", aphabet.getRight().getElement());
        assertEquals("A", aphabet.getElement());
        aphabet.setElement("F");
        aphabet.setLeft(new BinaryTree<String>("D"));
        aphabet.setRight(new BinaryTree<String>("E"));
        assertEquals("D", aphabet.getLeft().getElement());
        assertEquals("E", aphabet.getRight().getElement());
        assertEquals("F", aphabet.getElement());
    }

    /**
     * post test
     */
    public void testtoPostOrderString() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals("((B)(C)A)", aphabet.toPostOrderString());
    }

    /**
     * inoder test
     */
    public void testtoInOrderString() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals("((B)A(C))", aphabet.toInOrderString());
    }

    /**
     * preoder test
     */
    public void testtoPreOrderString() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals("(A(B)(C))", aphabet.toPreOrderString());
    }

    /**
     * size of the entire tree
     */
    public void testSize() {
        BinaryTree<String> left2 = new BinaryTree<String>("1");
        BinaryTree<String> right2 = new BinaryTree<String>("2");
        aphabet.setLeft(left2);
        aphabet.setRight(right2);
        assertEquals(3, aphabet.size());
    }

    /**
     * height of the tree
     */
    public void testHeight() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals(2, aphabet.height());
    }

    /**
     * cloning of the tree
     */
    public void testClone() {
        BinaryTree<String> left = new BinaryTree<String>("B");
        BinaryTree<String> right = new BinaryTree<String>("C");
        aphabet = new BinaryTree<String>("A", left, right);
        assertEquals("((B)A(C))", aphabet.clone().toInOrderString());
    }

}
