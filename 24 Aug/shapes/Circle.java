package NCG_24_Aug.shapes;

public class Circle extends Shapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

  @Override
  public double calculateCircumference() {
        return 2*3.14*radius;
    }

  @Override
  public void print() {
    System.out.println("The circumference is "+calculateCircumference()+" and area is "+ calculateArea());
  }
}
