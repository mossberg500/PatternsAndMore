package ua.lov.specialisttv.lambda;

public class ProgramApp {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();

        // подписка на событие Event subscribe
        //  switcher.electricityConsumer = lamp;

        switcher.addElectricityListener(lamp);
        switcher.switchOn();
        System.out.println("-------------------");
        switcher.addElectricityListener(new Radio());
        switcher.switchOn();
        System.out.println("---------- класс---------");
        class Fire implements ElectricityConsumer {
            @Override
            public void electricityOn() {
                System.out.println("Пожар");
            }
        }
        switcher.addElectricityListener(new Fire());
        switcher.switchOn();

        System.out.println("----------анонимный класс---------");
        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn() {
                        System.out.println("Пожар из анон.класса");
                    }
                }
        );
        switcher.switchOn();

        System.out.println("--------лямбда-----------");


        // На этапе компиляции компилятор видит тип передааемого параметра в заголовке метода
        // void addElectricityListener(ElectricityConsumer listener)
        // поэтому имя интерфейса тоже можно опустить
        /*
        switcher.addElectricityListener(
                    public void electricityOn() {
                        System.out.println("Пожар из лямбда");
                    }
        );
        */

        // в функциональном интерфейсе один единственный метод electricityOn()
        // когда мы хотим его реализовать, нет необходимости указывать его имя - имя метода
        /*
        switcher.addElectricityListener(
                    () {
                        System.out.println("Пожар из лямбда");
                    }
        );
        */
        // разделяем набор параметров в круглых скобочках и тела метода реализующего метод
        // интерфейса ставим ->
        /*
        switcher.addElectricityListener(
                    () -> {
                        System.out.println("Пожар из лямбда");
                    }
        );
        */

        /*
        switcher.addElectricityListener(
                () -> {
                    System.out.println("Пожар из лямбда");
                }
        );
         */
        //или
        switcher.addElectricityListener(
                () -> System.out.println("Пожар из лямбда")
        );
        switcher.switchOn();
    }

}
