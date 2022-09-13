package NCG_12_Sep;

public class nested {
    private int data = 30;

    class Inner {
      void msg() {
        System.out.println("data is " + data);
      }
    }

    public static void main(String args[]) {
      nested obj = new nested();
      nested.Inner in = obj.new Inner();
      in.msg();
    }
}
