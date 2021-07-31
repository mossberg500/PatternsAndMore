package ua.lov.specialisttv.lambda2;

public class Radio2 implements ElectricityConsumer2 {
    public void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
