public class Circle implements Figure {
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        double area = 3.14 * (radius * radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimetr = 2 * 3.14 * radius;
        return perimetr;

    }
    public String getType(){
        return "Circle";
    }
}
