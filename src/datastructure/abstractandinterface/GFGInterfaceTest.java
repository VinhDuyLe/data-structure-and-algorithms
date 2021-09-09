package datastructure.abstractandinterface;

import java.io.OutputStream;

interface Shape2 {
    void draw();
    double area();
}
class Rectangle2 implements Shape2 {
    int length, width;
    Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area() {
        return (double)(length * width);
    }
}
class Circle2 implements Shape2 {
    double pi = 3.14;
    int radius;
    Circle2(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public double area() {
        return (double)(pi * Math.pow(radius,2)/2);
    }
}

public class GFGInterfaceTest {
    public static void main(String[] args) {
        Shape2 rect = new Rectangle2(2,3);
        System.out.println("Area of rectangle " + rect.area());
        Shape2 circle = new Circle2(2);
        System.out.println("Area of circle " + circle.area());
    }
}
