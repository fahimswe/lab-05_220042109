public class Square implements Shape {
    private int x,y;
    private double sideLength;

    public Square (int x, int y, double sideLength){
        this.x=x;
        this.y=y;
        this.sideLength= sideLength;
    }
    public double calculateArea() {

        return sideLength * sideLength;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
