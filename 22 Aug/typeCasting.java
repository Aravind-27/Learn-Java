package NCG_22_Aug;

// Java Program showing ClassCastException

// Importing input output classes
import java.io.*;

// Class 1
// Parent class/ Member class
class Member {

    // Member variable of this class
    String name;
    long phone;

    // Member function of this class
    void chat()
    {

        // Print message of Member/ Child class
        System.out.println(
                name + " : chatting in whatsapp group");
    }
}

// Class 2
// Child class/ Admin class
class Admin extends Member {

    // Member function of this class
    void addUser()
    {

        // Print message of Admin/ Parent class
        System.out.println(
                name
                        + " : adding a new user in whatsapp group");
    }
}

// Class3 - Main class
public class typeCasting{

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object Ad
        Member mem = new Admin();

        // Upcasting access only general property of
        // superclass

        // Custom entry for Member class
        mem.name = "Sneha";
        mem.phone = 9876543210l;
        // Calling function
        mem.chat();

        Admin ad = (Admin)mem;

        // Downcast to access specific property of subclass
        ad.addUser();
    }
}
