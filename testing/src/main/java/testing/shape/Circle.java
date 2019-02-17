package testing.shape;

public class Circle implements Shape{

    private final String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return Math.PI*(radius*radius);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
