package ua.lov.pattern.observer;

//  за кем наблюдают
public interface Observed {
    // добавить подписчика
    public void addObserver(Observer observer);
    //удалить подписчика
    public void removeObserver(Observer observer);
    //уведомить наблюдателей
    public void notifyObservers();

}
