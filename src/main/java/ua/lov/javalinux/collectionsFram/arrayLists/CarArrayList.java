package ua.lov.javalinux.collectionsFram.arrayLists;

import java.util.Arrays;

public class CarArrayList implements CarList {

    private Car[] cars = new Car[10];
    private int size = 0;

    // O(1) - операция выполняется за точное (константное)
    // время, и не заисит от размера коллекции - лучшая
    // алгоритмическая сложность, которая только возможна
    // (операция происходит очень быстро)
    @Override
    public Car get(int index) {
        checkIndex(index);
        //     if (index < 0 || index >= size) {
        //         throw new IndexOutOfBoundsException();
        //     }
        return cars[index];
    }

    // О(1)
    @Override
    public void add(Car car) {
        increaseArray();
        cars[size] = car;
        size++;

    }

    // O(N) - зависит от размера коллекции
    @Override
    public void add(Car car, int index) {
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
     //   if (size - index >= 0) {
            System.arraycopy(cars, index, cars, index + 1, size - index);
     //   }
     //   for (int i = size; i > index; i--) {
     //       cars[i] = cars[i - 1];
     //   }
        cars[index] = car;
        size++;
    }

    // O(N)
    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (cars[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    // O(N)
    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            cars[i] = cars[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        cars = new Car[10];
        size = 0;

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseArray() {
        if (size >= cars.length) {
            //cars = Arrays.copyOf(cars, cars.length*7/4);
            Car[] newArray = new Car[cars.length * 7 / 4];
            for (int i = 0; i < cars.length; i++) {
                newArray[i] = cars[i];
            }
            cars = newArray;
        }
    }
}
