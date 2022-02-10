package com.company;

public class Circle {
    private static double pi = 3.14;
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        area();
        circumference();
        return "Circle{}";
    }

    static void area(){
        System.out.println("Area of circle is "+pi*(radius*radius));
    }
    static void circumference(){
        System.out.println("Circumference of circle is "+pi*2*radius);
    }
}
