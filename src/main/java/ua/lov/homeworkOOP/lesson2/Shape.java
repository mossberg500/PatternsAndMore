package ua.lov.homeworkOOP.lesson2;

import java.awt.*;

public abstract class Shape {
    abstract double getPerimeter();
    abstract double getArea();
    // Метод рассчёта расстояния между друмя точками
    protected double dist(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }


}
