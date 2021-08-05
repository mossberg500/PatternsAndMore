package ua.lov.homeworkOOP.lesson1.triangle;

public class myTriangle {
    public static void main(String[] args) {
        Triangle triangleFirst = new Triangle(10, 15, 20);
        Triangle triangleTwo = new Triangle(16.5, 11.7, 20.9);
        System.out.println(triangleFirst);
        System.out.println(triangleFirst.getSquare());
        System.out.println(triangleTwo);
        System.out.println(triangleTwo.getSquare());
    }
}
