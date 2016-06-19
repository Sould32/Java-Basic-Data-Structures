/**
 * @author Souleymane <sould32>
 * @version <2015>
 */
package recursivetree;

/**
 * @author Souleymane
 *
 * @version<Nov 23, 2015>
 */
public class Expressions {

    /**
     * @param args
     *            of the main
     */
    public static void main(String[] args) {

        BinaryTree<String> e = new BinaryTree<String>("e");
        BinaryTree<String> c = new BinaryTree<String>("c");
        BinaryTree<String> b = new BinaryTree<String>("b");
        BinaryTree<String> d = new BinaryTree<String>("d");
        BinaryTree<String> a = new BinaryTree<String>("a");
        BinaryTree<String> plus = new BinaryTree<String>("+", c, d);
        BinaryTree<String> devid = new BinaryTree<String>("/", plus, e);
        BinaryTree<String> minus = new BinaryTree<String>("-", a, b);
        BinaryTree<String> multiply = new BinaryTree<String>("*", minus, devid);
        System.out.print(multiply.toInOrderString());
    }

}
