public class Rectangle implements Shape{
    private int x,y;
    private double width, height;
    public Rectangle(int x, int y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public double calculateArea() {
        return width * height;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
