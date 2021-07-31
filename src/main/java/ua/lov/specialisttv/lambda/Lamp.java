package ua.lov.specialisttv.lambda;

public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
