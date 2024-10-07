import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
public class TestShapeSorting {
    @Test
    public void testShapesSortedByArea() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 5, 2));
        shapes.add(new Circle(0, 0, 1));
        shapes.add(new Rectangle(0, 0, 2, 5));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Circle.class, shapes.get(0).getClass());
        assertEquals(Square.class, shapes.get(1).getClass());
        assertEquals(Rectangle.class, shapes.get(2).getClass());
    }
    @Test
    public void testShapesSortedByXPositionWhenAreaEqual() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 1, 2));
        shapes.add(new Square(2, 1, 2));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(2, shapes.get(0).getX());
        assertEquals(5, shapes.get(1).getX());
    }
    @Test
    public void testShapesSortedByYPositionWhenAreaAndXEqual() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2, 5, 2));
        shapes.add(new Square(2, 1, 2));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(1, shapes.get(0).getY());
        assertEquals(5, shapes.get(1).getY());
    }
    @Test
    public void testDifferentShapeTypesSorted() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1, 1, 1));
        shapes.add(new Rectangle(2, 2, 2, 2));
        shapes.add(new Square(3, 3, 2));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Circle.class, shapes.get(0).getClass());
        assertTrue(shapes.get(1) instanceof Shape);
    }
    @Test
    public void testShapesWithSameXAndYCoordinates() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 5, 2));
        shapes.add(new Rectangle(5, 5, 2, 2));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Square.class, shapes.get(0).getClass());
        assertEquals(Rectangle.class, shapes.get(1).getClass());
    }
    @Test
    public void testSortingWithNegativeCoordinates() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(-3, -4, 2));
        shapes.add(new Rectangle(-5, -6, 2, 3));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Rectangle.class, shapes.get(0).getClass());
        assertEquals(Circle.class, shapes.get(1).getClass());
    }
    @Test
    public void testIdenticalShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2, 2, 3));
        shapes.add(new Square(2, 2, 3));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Square.class, shapes.get(0).getClass());
        assertEquals(Square.class, shapes.get(1).getClass());
    }
    @Test
    public void testSortingWithSmallAreas() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(0, 0, 0.5));
        shapes.add(new Rectangle(1, 1, 0.5, 0.5));
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertEquals(Rectangle.class, shapes.get(0).getClass());
        assertEquals(Circle.class, shapes.get(1).getClass());
    }
    @Test
    public void testLargeNumberOfShapes() {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            shapes.add(new Square(i, i, i + 1));
        }
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);

        assertEquals(1, shapes.get(0).calculateArea(), 0.001);
        assertEquals(10000, shapes.get(99).calculateArea(), 0.001);
    }
    @Test
    public void testEmptyShapeList() {
        List<Shape> shapes = new ArrayList<>();
        ShapePrinter printer = new ShapePrinter();
        printer.printShapes(shapes);
        assertTrue(shapes.isEmpty());
    }
}
