package geometrics;

public class Square implements GeometricFigure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
