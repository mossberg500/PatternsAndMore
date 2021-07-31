package ua.lov.pattern.factorymethod;

import java.util.Date;

public class FactoryMethodApp {
    public static void main(String[] args) {
  /*
        Watch watch = new DigitalWatch();
        watch.ShowTime();
        watch = new RomeWatch();
        watch.ShowTime();

   */
        WatchMaker maker = new RomeWatchMaker(); // new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.ShowTime();

        WatchMaker watchMaker = getWatchMaker("Digital");
        Watch watch1 = watchMaker.createWatch();
        watch1.ShowTime();
    }
    public static WatchMaker getWatchMaker(String maker) {
        if(maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if(maker.equals("Rome"))
            return new RomeWatchMaker();

        throw  new RuntimeException("Не поддерживаемая производстенная линия");
    }
}

interface Watch {
    void ShowTime();
}

class DigitalWatch implements Watch{
    @Override
    public void ShowTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch{
    @Override
    public void ShowTime() {
        System.out.println("VII-XX");
    }
}

// Производитель у которого фабричный метод
interface WatchMaker{
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
