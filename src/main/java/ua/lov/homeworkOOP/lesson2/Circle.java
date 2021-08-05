package ua.lov.homeworkOOP.lesson2;

public class Circle extends Shape {
    Point O = new Point();
    Point pR = new Point();

    public Circle(Point O, Point pR) {
        this.O = O;
        this.pR = pR;
    }

    public Circle() {
        super();
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * dist(pR, O));
    }

    @Override
    public double getArea() {
        return (Math.PI * dist(pR, O) * dist(pR, O));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "O=" + O +
                ", pR=" + pR +
                '}';
    }
}
