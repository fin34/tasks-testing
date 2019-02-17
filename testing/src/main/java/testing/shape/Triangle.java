package testing.shape;

public class Triangle implements Shape {

    private final String name = "Triangle";
    private double sideLenght;
    private double heightToTheSide;

    public Triangle(double sideLenght, double heightToTheSide) {
        this.sideLenght = sideLenght;
        this.heightToTheSide = heightToTheSide;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return (sideLenght*heightToTheSide)/2;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sideLenght=" + sideLenght +
                ", heightToTheSide=" + heightToTheSide +
                '}';
    }
}
