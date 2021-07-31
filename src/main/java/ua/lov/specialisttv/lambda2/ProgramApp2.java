package ua.lov.specialisttv.lambda2;

public class ProgramApp2 {

    public static void fire(Object sender) {
        System.out.println("Fire !!!");
    }

    public static void main(String[] args) {
        Switcher2 switcher = new Switcher2();
        Lamp2 lamp = new Lamp2();
        Radio2 radio2 = new Radio2();

        switcher.addElectricityListener(lamp);
        switcher.switchOn();
        System.out.println("-------------------");
        switcher.addElectricityListener(radio2);
        switcher.switchOn();
        switcher.removeElectricityListener(lamp);
        switcher.removeElectricityListener(radio2);

        System.out.println("----------анонимный класс---------");

        // Захат переменных
        String message = "Пожар";

        switcher.addElectricityListener(
                new ElectricityConsumer2() {
                    @Override
                    public void electricityOn(Object sender) {
                        System.out.print("Пожар из анон.класса ");
                        System.out.println(message);
                    }
                }
        );
        switcher.switchOn();


        System.out.println("--------лямбда-----------");
        switcher.addElectricityListener(sender -> System.out.println("Пожар из лямбда") );
        switcher.switchOn();

        System.out.println("-------- :: -----------");

        // заголовок метода fire вызов которого у нас реализует лямбда-выражение
        // в точности до имени самого метода совпадает с заголовком единственного
        // метода нашего функционального интерфейса

        // фактически лямбда-выражение что делает? Вызывается лямбда-выр. с параметром
        // Object которое в свою очередь просто вызывает другой метод с таким же параметром

        switcher.addElectricityListener(s -> ProgramApp2.fire(s));

        //если параметры метода совпадают в точности с параметрами лямбда-выражения
        // можно указать что все лямбда выражение сразу  реализуется методом fire
        switcher.addElectricityListener(ProgramApp2::fire);


    }

}
