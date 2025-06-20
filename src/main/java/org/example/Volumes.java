package org.example;

public class Volumes {

    // Volume of a sphere: (4/3) * π * r^3
    public static double sphere(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}