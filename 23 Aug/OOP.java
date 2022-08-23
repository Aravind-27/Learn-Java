package NCG_23_Aug;

public class OOP {
    private int counter = 0;
     OOP() {
        System.out.println("..Creating an object");
        counter++;
        System.out.println("Count "+this.counter);
    }
     OOP(String message) {
        System.out.println("Message : "+ message);
        System.out.println("Count "+ this.counter);
    }

    public static void main (String args[]){
        OOP obj = new OOP();
        OOP obj1 = new OOP("Hello there");

    }
}
