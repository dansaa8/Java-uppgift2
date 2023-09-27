package org.example;

abstract public class Shape implements Comparable<Shape>{
    public abstract double getArea();
    public abstract double getPerimeter();

    public static Circle circle(double radius) {
        return new Circle(radius);
    }

    public static Rectangle rectangle(double base, double height) {
        return new Rectangle(base, height);
    }

    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }

}
