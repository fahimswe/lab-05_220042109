import java.util.Comparator;
public class ShapeComparator implements Comparator<Shape>{
    public int compare(Shape s1, Shape s2){
        int areaCompare = Double.compare(s1.calculateArea(), s2.calculateArea());
        if (areaCompare != 0) {
            return areaCompare;
        }
        int xCompare = Integer.compare(s1.getX(), s2.getX());
        if (xCompare != 0) {
            return xCompare;
        }
        return Integer.compare(s1.getY(),s2.getY());
    }
}
