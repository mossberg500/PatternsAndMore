package ua.lov.specialisttv.cloneobj;

import java.util.Arrays;

public class Car1 implements Cloneable {
    private String marka; //марка
    private double acceleration; //ускорение
    private double deceleration; // торможение
    private boolean pickUp;
    private String[] wheels = {"переднее левое", "переднее правое", "заднее левое", "заднее правое"};
    private Trailer trailer;

    public Car1() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getDeceleration() {
        return deceleration;
    }

    public void setDeceleration(double deceleration) {
        this.deceleration = deceleration;
    }

    public boolean isPickUp() {
        return pickUp;
    }

    public void setPickUp(boolean pickUp) {
        this.pickUp = pickUp;
    }

    public String[] getWheels() {
        return wheels;
    }

    public void setWheels(String[] wheels) {
        this.wheels = wheels;
    }

  /*  @Override
    public String toString() {
        return "Car1{" +
                "marka='" + marka + '\'' +
                ", acceleration=" + acceleration +
                ", deceleration=" + deceleration +
                ", pickUp=" + pickUp +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
*/
}
