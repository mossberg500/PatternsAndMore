package ua.lov.mathematic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.sqrt;

public class Discr {
    private double a;
    private double b;
    private double c;



    public Map<String, Double> quare(double a, double b, double c) {
        Map<String, Double> map = new HashMap<String, Double>();
        double D = sqrt(b*b - 4*a*c);
        double x1 = (-b + D)/(2*a);
        double x2 = (-b - D)/(2*a);
        double sumX = x1 + x2;
        double x1sq = x1*x1;
        double x2sq = x2*x2;
        double dd = x1sq + x2sq;

        map.put("значение первого корня х1: ", x1);
        map.put("значение второго корня х2: ", x2);
        map.put("Сумма корней х1 и х2 : ", sumX);
        map.put("квадрат первого корня х1: ", x1sq);
        map.put("квадрат второго корня х2: ", x1sq);
        map.put("сумма крадратов корней : ", dd);
        return map;
    }
}
