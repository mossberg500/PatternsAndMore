package ua.lov.pattern.facade;

public class FacadeApp {
    public static void main(String[] args) {
        Power power = new Power();
        power.on();

        DVDRom dvd = new DVDRom();
        dvd.load();

        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);

        System.out.println("--------Фасад------------");
        Computer computer = new Computer();
        computer.copy();



    }
}

// Фасад
class Computer{
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}

class Power{
    void on(){
        System.out.println("Включение питания");
    }
    void off(){
        System.out.println("Выключение питания");
    }
}

class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
        System.out.println("Диск загружен");
        data = true;
    }

    void unload(){
        System.out.println("Диск очищен");
        data = false;
    }
}

class HDD{
    void copyFromDVD(DVDRom dvd) {
        if(dvd.hasData()) {
            System.out.println("Происходит копирование данных с диска");
        }
        else {
            System.out.println("Вставьте диск с данными");
        }
    }
}