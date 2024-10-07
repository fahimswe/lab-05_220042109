import java.util.Collections;
import java.util.List;

public class ShapePrinter {
    public void printShapes(List<Shape> shapes) {
        Collections.sort(shapes, new ShapeComparator());
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() +
                    " Area: " + shape.calculateArea() +
                    " X: " + shape.getX() +
                    " Y: " + shape.getY());
        }
    }
}
