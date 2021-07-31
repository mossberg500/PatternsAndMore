package ua.lov.specialisttv.lambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    //Ссылка (лист ссылок) на интерфейс (ссылка на объект любого класса
    // реализующего данный интерфейс
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    // метод отвечающий за подписку на событие
    public void addElectricityListener(ElectricityConsumer listener) {
        // можно прописать проверки на null и на то
        // был ли уже добавлен объект до этого
        if(listener != null && listeners.indexOf(listener) == -1)
        listeners.add(listener);
    }

    // метод отвечающий за отписку на событие
    public void removeElectricityListener(ElectricityConsumer listener) {
        // можно прописать проверки на null и на то
        // был ли уже добавлен (удалён) объект до этого
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включён");

        // Проверка ссылки на реальный объект
  //      if(electricityConsumer != null)
  //          electricityConsumer.electricityOn();

        for (ElectricityConsumer c: listeners)
            c.electricityOn();
    }
}
