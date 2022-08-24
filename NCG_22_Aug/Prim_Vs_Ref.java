package NCG_22_Aug;

class Name {
  private String name;

  public Name(String name) {
    this.name = name;
  }
}

class Name1 {
  private String name;

  public Name1(String name) {
    this.name = name;
  }

  public String toString() {
    return this.name;
  }
}

public class Prim_Vs_Ref {
  public static void main(String[] args) {
    // primitive variable
    int value = 10;
    System.out.println(value);
    //  Reference variable
    Name luke = new Name("Luke");
    System.out.println(luke);

    Name1 luke1 = new Name1("Luke");
    System.out.println(luke1); // equal to System.out.println(luke.toString());
  }
}
