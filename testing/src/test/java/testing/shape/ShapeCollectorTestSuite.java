package testing.shape;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        List<Shape> list = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(list);
        shapeCollector.addFigure(new Square(3.0));

        Assert.assertEquals(1,shapeCollector.getListOfShape().size());
    }

    @Test
    public void testRemoveFigure(){
        List<Shape> list = new ArrayList<>();
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(6.0, 9.0);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);

        Assert.assertEquals(1, shapeCollector.getListOfShape().size());
    }

    @Test
    public void testgetFigure(){
        List<Shape> list = new ArrayList<>();
        Square square = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        shapeCollector.addFigure(square);

        Assert.assertEquals(square, shapeCollector.getFigure(0));
    }
}
