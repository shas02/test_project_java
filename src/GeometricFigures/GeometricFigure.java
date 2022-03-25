package GeometricFigures;

public abstract class GeometricFigure {

    private double area;
    private String color;

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public abstract void print();
    public abstract void showInformation();
}
