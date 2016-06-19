/**
 * 
 */
package icecream;
import java.util.*;
/**
 * @author Souleymane <sould32>
 * @version 09/25/2015
 
 */
public class IceCreamCone implements IceCreamConeADT {
    
    private Stack<String> flavor;
    private int numOfIceCream;
    /**
     * create a new instance
     */
    public IceCreamCone() {
        numOfIceCream = 0;
        flavor = new Stack<String>();
    }
    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#eatScoop()
     */
    @Override
    public String eatScoop() {
        numOfIceCream--;
        return flavor.pop();
    }

    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#addScoop(java.lang.String)
     */
    @Override
    public void addScoop(String newFlavor) {
        flavor.push(newFlavor);
        numOfIceCream++;
    }

    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#numScoops()
     */
    @Override
    public int numScoops() {
        return numOfIceCream;
    }

    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#contains(java.lang.String)
     */
    @Override
    public boolean contains(String newFlavor) {
        return flavor.search(newFlavor) > -1;
    }

    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#emptyCone()
     */
    @Override
    public boolean emptyCone() {
        return numOfIceCream == 0;
    }

    /* (non-Javadoc)
     * @see icecream.IceCreamConeADT#currentScoop()
     */
    @Override
    public String currentScoop() {
        return flavor.peek();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return flavor.toString();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null) || (other.getClass() != this.getClass())) {
            return false;
        }
        return flavor.equals(((IceCreamCone) other).flavor);
    }


}
