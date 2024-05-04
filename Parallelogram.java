public class Parallelogram implements Figure{
    public double baseSide;
    public double side;
    public double height;
    public Parallelogram(double baseSide, double side, double height){
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }



    @Override
    public double getArea() {
        double area = baseSide*height;
        return area;

    }

    @Override
    public double getPerimeter() {
        double perimeter = (baseSide+side)*2;
        return perimeter;
    }

    public String getType(){
        return "Parallelogram";
    }
}
