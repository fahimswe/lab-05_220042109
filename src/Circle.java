public class Circle implements Shape {
    private int x, y;
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}