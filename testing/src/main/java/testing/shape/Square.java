package testing.shape;

public class Square implements Shape {

    private final String name = "Square";
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return sideLenght*sideLenght;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sideLenght=" + sideLenght +
                '}';
    }
}
