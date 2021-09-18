package ua.lov.javalinux.collectionsFram.arrayLists;

import org.junit.Before;
import org.junit.Test;
import ua.lov.javalinux.collectionsFram.linkedLists.CarLinkedList;
import ua.lov.javalinux.collectionsFram.linkedLists.LinkedCarList;

import static org.junit.Assert.*;

public class CarLinkedListTest {
    private LinkedCarList linkedCarList;

    @Before
    public void setUp() throws Exception {
        linkedCarList = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            linkedCarList.add(new Car("Brand" + i, i));
        }

    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        //       for (int i=0; i<100; i++) {
        //           carList.add(new Car("Brand" + i, i));
        //       }
        assertEquals(100, linkedCarList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        //      for (int i=0; i<100; i++) {
        //          carList.add(new Car("Brand" + i, i));
        //      }
      //  assertEquals(100, carList.size());
        assertTrue(linkedCarList.removeAt(5));
        assertEquals(99, linkedCarList.size());
    }
    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        Car car = new Car("Toyota", 15);
        linkedCarList.add(car);
        assertEquals(101, linkedCarList.size());
        assertTrue(linkedCarList.remove(car));
        assertEquals(100, linkedCarList.size());
    }

    @Test
    public void whenNonExistentElementRemovedThenReturnFalse() {
        Car car = new Car("Toyota", 15);
        assertFalse(linkedCarList.remove(car));
        assertEquals(100, linkedCarList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        linkedCarList.clear();
        assertEquals(0, linkedCarList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutBoundsThenThrownException() {
        linkedCarList.get(100);
    }

    @Test
    public void methodGetReturnRightValue() {
        Car car = linkedCarList.get(0);
        assertEquals("Brand0", car.getBrand());
    }

    @Test
    public void insertIntoMiddle() {
        Car car = new Car("BMW", 1);
        linkedCarList.add(car, 50);
        Car carFromList = linkedCarList.get(50);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void insertIntoFirstPosition() {
        Car car = new Car("BMW", 1);
        linkedCarList.add(car, 0);
        Car carFromList = linkedCarList.get(0);
        assertEquals("BMW", carFromList.getBrand());
    }
    @Test
    public void insertIntoLastPosition() {
        Car car = new Car("BMW", 1);
        linkedCarList.add(car, 100);
        Car carFromList = linkedCarList.get(100);
        assertEquals("BMW", carFromList.getBrand());
    }
}
