package ua.lov.specialisttv.cloneobj;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car1 car1 = new Car1();
        car1.setMarka("volvo");
        car1.setAcceleration(5);
        Trailer tr = new Trailer("name", 50);
        car1.setTrailer(tr);

        // присвоение ссылок
        Car1 car2 = car1;
        System.out.print("car1 тот же объект при сравнении по ссылке  ");
        System.out.println(car1 == car2);

        System.out.print("car1 тот же объект при сравнении по  equals ");
        System.out.println(car1.equals(car2));


        System.out.println(car1);
        System.out.println(car2);
        System.out.println("-------------------------------------");

        Car1 clonedCar = (Car1)car1.clone();
        System.out.print("car1 тот же объект при сравнении по ссылке  ");
        System.out.println(car1 == clonedCar);
        System.out.print("car1 тот же объект при сравнении по equals  ");
        System.out.println(car1.equals(clonedCar));


        System.out.println(car1);
        System.out.println(clonedCar);
        System.out.print("car1.getMarka   ");
        System.out.println(car1.getMarka() == clonedCar.getMarka());

        System.out.print("car1..getAcceleration()   ");
        System.out.println(car1.getAcceleration() == clonedCar.getAcceleration());

        System.out.print("car1..getTrailer()   ");
        System.out.println(car1.getTrailer() == clonedCar.getTrailer());
        System.out.println(car1.getTrailer() + "    " + clonedCar.getTrailer());

    }
}
