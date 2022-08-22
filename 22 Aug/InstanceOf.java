package NCG_22_Aug;

// Java program to demonstrate working of instanceof Keyword

    // Class 1
// Parent class
    class Parent {
        int value = 1000;
    }

    // Class 2
// Child class
    class Child extends Parent {
        int value = 10;
    }

    // Class 3
// Main class
    public class InstanceOf {

        // Main driver method
        public static void main(String[] args)
        {

            // Creating object of child class
            Child cobj = new Child();
            Parent par = cobj;

            System.out.println(cobj.value);
            System.out.println(par.value);


            // Using instanceof to make sure that par
            // is a valid reference before typecasting
            if (par instanceof Child)
            {
                System.out.println("Value accessed through " +
                        "parent reference with typecasting is " +
                        ((Child)par).value);
            }

            // A simple case
            if (cobj instanceof Child)
                System.out.println("cobj is instance of Child");
            else
                System.out.println(
                        "cobj is NOT instance of Child");

            // instanceof returning true for Parent class also
            if (cobj instanceof Parent)
                System.out.println(
                        "cobj is instance of Parent");
            else
                System.out.println(
                        "cobj is NOT instance of Parent");

            // instanceof returns true for all ancestors

            // Note : Object is ancestor of all classes in Java
            if (cobj instanceof Object)
                System.out.println(
                        "cobj is instance of Object");
            else
                System.out.println(
                        "cobj is NOT instance of Object");
        }
    }


