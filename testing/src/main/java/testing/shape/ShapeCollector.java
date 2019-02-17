package testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> listOfShape;

    public ShapeCollector(List<Shape> listOfShape) {
        this.listOfShape = listOfShape;
    }

    public List<Shape> getListOfShape() {
        return listOfShape;
    }

    public void addFigure(Shape shape){
        listOfShape.add(shape);
    }

    public void removeFigure(Shape shape){
        listOfShape.remove(shape);
    }

    public Shape getFigure(int n){
        return listOfShape.get(n);
    }

    public void showFigures(){
        for (Shape shape:listOfShape) {
            System.out.println(shape);
        }
    }
}
