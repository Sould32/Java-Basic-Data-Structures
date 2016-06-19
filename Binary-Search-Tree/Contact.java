package binarySearchTree;

/**
 * @author Souleymane
 * @version <Dec 5, 2015>
 */
public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    /**
     * default constructor
     */
    public Contact() {
        this(null, null, null);
    }

    /**
     * @param firstName
     *            of the contact
     * @param lastName
     *            of the contact
     * @param phoneNUmber
     *            to be store under this contact
     */
    public Contact(String firstName, String lastName, String phoneNUmber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNUmber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNUmber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNUmber
     *            the phoneNUmber to set
     */
    public void setPhoneNumber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }

    /**
     * Compares two contacts and returns how they relate to each other It first
     * compares the lastName field, then the firstName, and finally the
     * phoneNumber. If you get a positive number, the value of "this" is
     * "greater than" or "later" in the alphabet and should be placed after the
     * node. for example same last name, but comparing first names:
     * "Alice".compareTo("Juan") will return negative "Leron".compareTo("Juan")
     * will return positive "Juan".compareTo("Juan") will compare phoneNumber
     * 
     * @param other
     *            contact
     * @return positive if other bigger
     */
    @Override
    public int compareTo(Contact other) {
        if (lastName.compareTo(other.getLastName()) < 0) {
            return -1;
        }
        // compare last name
        else if (lastName.compareTo(other.getLastName()) > 0) {
            return +1;
        }
        // compare firstName
        else {
            if (firstName.compareTo(other.getFirstName()) < 0) {
                return -1;
            }
            // compare first name
            else if (firstName.compareTo(other.getFirstName()) > 0) {
                return +1;
            }
            // compare phone num
            else {
                if (phoneNumber.compareTo(other.getPhoneNumber()) < 0) {
                    return -1;
                }
                // comapare number
                else if (phoneNumber.compareTo(other.getPhoneNumber()) > 0) {
                    return +1;
                }
            }
        }
        return 0;

    }

    /**
     * @return str 
     */
    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName
                + ", phoneNumber=" + phoneNumber + "]";
    }

}