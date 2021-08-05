package ua.lov.homeworkOOP.lesson2;

public class Rectangle extends Shape {
    Point a = new Point();
    Point b = new Point();
    Point c = new Point();
    Point d = new Point();

    public Rectangle() {
        super();
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    double getPerimeter() {
        return (dist(a, b) + dist(b, c) + dist(c, d) + dist(a, d));
    }

    @Override
    double getArea() {
        double hP = this.getPerimeter() / 2;
        return Math.sqrt((hP - dist(a, b)) * (hP - dist(b, c)) * (hP - dist(c, d)) * (hP - dist(a, d)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
