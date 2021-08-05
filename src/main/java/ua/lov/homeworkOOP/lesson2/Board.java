package ua.lov.homeworkOOP.lesson2;

import java.util.Arrays;

/*
4. Создать класс доска. Доска поделена на 4 части, в каждую часть доски можно положить одну из фигур.
У доски должны быть методы, которые помещают и удаляют фигуру с доски.
Также должен быть метод, который выводит информацию о всех фигурах лежащих на доске и их сумарную площадь.
*/
public class Board {
    private Shape[] figure = new Shape[4];

    public Board() {
        super();
    }

    public Board(Shape[] figure) {
        this.figure = figure;
    }

    //Метод добавления фигуры на доску в pos позицию
    public void setFigureOnBoard(Shape shape, int pos) {
        if (pos > 4 || pos < 1) {
            System.out.println(" Invalid position on board");
        } else {
            figure[pos - 1] = shape;
            System.out.println(" A figure has been added to the board  " + figure[pos - 1].toString());
        }
    }

    //Метод удаления фигуры с доски по указанной области pos
    public void getFigureFromBoard(int pos) {
        if (pos > 4 || pos < 1) {
            System.out.println(" Invalid position on board");
        } else if (this.figure[pos - 1] == null) {
            System.out.println(" The position on the board is empty, please choose another");
        } else {
            System.out.println(" Specified part of the board has been released " + figure[pos - 1].toString());
            figure[pos - 1] = null;
        }


    }

    //Метод получения площади
    public double getSquareFigures() {
        double sum = 0;
        for (int x = 0; x < 4; x++) {
            if (figure[x] == null)
                sum += 0;
            if (figure[x] != null)
                sum += figure[x].getArea();
        }
        return sum;
    }

    @Override
    public String toString() {

        return "Board condition ----{" +
                "figure=" + Arrays.toString(figure) + '}' +
                " ---- Full square Board = " + getSquareFigures();
    }
}
