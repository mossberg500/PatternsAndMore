package ua.lov.pattern.observer;

import java.util.List;

// Observer - подписчик, наблюдатель
public interface Observer {
    // обработать собития
    public void  handlerEvent(List<String> vacancies);

}
