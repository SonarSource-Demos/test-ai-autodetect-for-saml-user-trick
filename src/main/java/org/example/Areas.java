package org.example;

public class Areas {

    // Area of a circle: π * r^2
    public static double circle(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        return Math.PI * radius * radius;
    }

    // Area of a square: side^2
    public static double square(double side) {
        if (side < 0) throw new IllegalArgumentException("Side must be non-negative");
        return side * side;
    }

    // Area of a rectangle: length * width
    public static double rectangle(double length, double width) {
        if (length < 0 || width < 0) throw new IllegalArgumentException("Length and width must be non-negative");
        return length * width;
    }

    // Area of a triangle: 0.5 * base * height
    public static double triangle(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Base and height must be non-negative");
        return 0.5 * base * height;
    }

    // Area of a regular heptagon: (7/4) * a^2 * cot(π/7)
    public static double heptagon(double side) {
        if (side < 0) throw new IllegalArgumentException("Side must be non-negative");
        double cotPiOver7 = 1 / Math.tan(Math.PI / 7);
        return (7.0 / 4.0) * side * side * cotPiOver7;
    }

    // Area of a regular pentagon: (5/4) * a^2 * cot(π/5)
    public static double pentagon(double side) {
        if (side < 0) throw new IllegalArgumentException("Side must be non-negative");
        double cotPiOver5 = 1 / Math.tan(Math.PI / 5);
        return (5.0 / 4.0) * side * side * cotPiOver5;
    }

    // Area of a parallelogram: base * height
    public static double parallelogram(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Base and height must be non-negative");
        return base * height;
    }

    // Area of a trapezoid: 0.5 * (base1 + base2) * height
    public static double trapezoid(double base1, double base2, double height) {
        if (base1 < 0 || base2 < 0 || height < 0) throw new IllegalArgumentException("Base1, base2, and height must be non-negative");
        return 0.5 * (base1 + base2) * height;
    }

    // Area of an ellipse: π * semiMajorAxis * semiMinorAxis
    public static double ellipse(double semiMajorAxis, double semiMinorAxis) {
        if (semiMajorAxis < 0 || semiMinorAxis < 0) throw new IllegalArgumentException("Semi-major and semi-minor axes must be non-negative");
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    // Area of a rhombus: (diagonal1 * diagonal2) / 2
    public static double rhombus(double diagonal1, double diagonal2) {
        if (diagonal1 < 0 || diagonal2 < 0) throw new IllegalArgumentException("Diagonals must be non-negative");
        return (diagonal1 * diagonal2) / 2;
    }
}