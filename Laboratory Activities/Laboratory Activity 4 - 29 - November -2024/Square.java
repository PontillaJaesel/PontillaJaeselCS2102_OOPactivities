public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

    public void printShapeType() {
        System.out.println("Square");
    }
}
