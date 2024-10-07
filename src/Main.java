import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 5, 2));
        shapes.add(new Circle(1, 2, 1));
        shapes.add(new Rectangle(3, 3, 2, 3));
        shapes.add(new Square(3, 3, 2));
        shapes.add(new Circle(7, 8, 2));
        shapes.add(new Rectangle(6, 6, 1, 2));
        shapes.add(new Square(1, 1, 4));
        shapes.add(new Circle(3, 2, 1.5));
        shapes.add(new Square(4, 4, 1));
        shapes.add(new Rectangle(2, 2, 3, 4));
        ShapePrinter printer = new ShapePrinter();
        System.out.println("Shapes sorted by area and position");
        printer.printShapes(shapes);
    }
}