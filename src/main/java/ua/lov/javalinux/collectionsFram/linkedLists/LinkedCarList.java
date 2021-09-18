package ua.lov.javalinux.collectionsFram.linkedLists;

import ua.lov.javalinux.collectionsFram.arrayLists.Car;

public interface LinkedCarList {
    Car get(int index);
    void add(Car car);
    void add(Car car, int index);
    boolean remove(Car car);
    boolean removeAt(int index);
    int size();
    void clear();

}
