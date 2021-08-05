package ua.lov.homeworkOOP.lesson2;

public class Triangular extends Shape {
    Point a = new Point();
    Point b = new Point();
    Point c = new Point();

    public Triangular() {
        super();
    }

    public Triangular(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return (dist(a, b) + dist(b, c) + dist(a, c));
    }

    @Override
    double getArea() {
        double hP = this.getPerimeter() / 2;
        return Math.sqrt(hP * (hP - dist(a, b))
                * (hP - dist(b, c)) * (hP - dist(a, c)));
    }

    @Override
    public String toString() {
        return "Triangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
