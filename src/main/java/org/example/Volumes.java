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

    public static double rectangularPrism(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Length, width, and height must be non-negative");
        }
        return length * width * height;
    }

    public static double toroid(double majorRadius, double minorRadius) {
        if (majorRadius < 0 || minorRadius < 0) {
            throw new IllegalArgumentException("Major and minor radii must be non-negative");
        }
        return 2 * Math.PI * Math.PI * majorRadius * Math.pow(minorRadius, 2);
    }

    public static double zeppelin(double length, double diameter) {
        if (length < 0 || diameter < 0) {
            throw new IllegalArgumentException("Length and diameter must be non-negative");
        }
        double a = length / 2.0;
        double b = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * a * b * b;
    }
}