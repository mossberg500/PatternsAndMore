package ua.lov.pattern.observer;

import java.util.List;

// подписчик
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handlerEvent(List<String> vacancies) {
        System.out.println("Dear" + name + "\nУ нас есть некоторые изменения в вакансиях" + vacancies +
                "\n--------------------------------------------------\n");
    }
}
