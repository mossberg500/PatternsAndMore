package ua.lov.homeworkOOP.lesson1.triangle;

public class Triangle {
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(double sizeA, double sizeB, double sizeC) {
        super();
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }
    public Triangle(){
        super();
    }
    public double getSizeA() {
        return sizeA;
    }
    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }
    public double getSizeB() {
        return sizeB;
    }
    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }
    public double getSizeC() {
        return sizeC;
    }
    public void setSizeC(double sizeC) {
        this.sizeC = sizeC;
    }
    public double getSquare() {
        double p = (sizeA + sizeB + sizeC)/2;
        return Math.sqrt(p * (p - sizeA) * (p - sizeB) * (p - sizeC));
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sizeA=" + sizeA +
                ", sizeB=" + sizeB +
                ", sizeC=" + sizeC +
                '}';
    }
}
