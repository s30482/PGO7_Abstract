public class Rectangle implements Figure {
    public double sideA;
    public double sideB;
    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double getArea() {
        double area = sideA*sideB;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*(sideB+sideA);
        return perimeter;

    }
    public String getType(){
        return "Rectangle";
    }
}
