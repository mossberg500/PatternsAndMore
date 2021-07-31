package ua.lov.pattern.delegate;

public class DelegateApp {
    public static void main(String[] args) {
        A a = new A();
        a.f();
        Painter painter = new Painter();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}

class A {
    void f() {
        System.out.println("f()");
        /*
        *
        *
        *
        *
        *
        *
         */
    }
}
/*
 класс B делегирует выполнение каких-то задач
 другому классу (класс A)
 Класс B ничего не далает. Он только вызывает метод
 класса A
 */
class B {
    A a = new A();
    void f() {
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics{
    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}

class Square implements Graphics{
    @Override
    public void draw() {
        System.out.println("Рисуем кадрат");
    }
}

class Circle implements Graphics{
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Painter {
 //   void drawTriangle() {System.out.println("рисуем треугольник"); }
 //   void drawSquare() {System.out.println("рисуем квадрат"); }
    Graphics graphics;
    // метод мутатор который получает конкретный экземпляр нашей графики (g)
    // и присваиает нашему атрибуту (graphics) ссылку на него
    void setGraphics(Graphics g) {
        graphics = g;
    }
    /*
        художник сам ничего не рисует он в качестве сылки хранит
        конкретный экземпляр нашей фигуры и просто вызывает метод draw()
        этой фигуры. Наш художник делегирует рисование фигуры конкретным экземплярам
        наших фигур которые мы будем передавать художнику
     */
    void draw(){
        graphics.draw();
    }


}