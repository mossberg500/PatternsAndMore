package ua.lov.specialisttv.lambda2;

public class Lamp2 implements ElectricityConsumer2 {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }


    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
