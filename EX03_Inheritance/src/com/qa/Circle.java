package com.qa;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
     public double getArea() {
         return Math.PI * radius * radius;
     }
     public Point getCentrePoint() {
         return new Point(getX(), getY());
     }

}
