package org.example;

public class Volumes {

    // Volume of a sphere: (4/3) * π * r^3
    public static double sphere(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double cylinder(double radius, double height) {
        if (radius < 0 || height < 0) throw new IllegalArgumentException("Radius and height must be non-negative");
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double cone(double radius, double height) {
        if (radius < 0 || height < 0) throw new IllegalArgumentException("Radius and height must be non-negative");
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}