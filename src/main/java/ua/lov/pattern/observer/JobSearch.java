package ua.lov.pattern.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("First java position");
        site.addVacancy("Second java position");


        Observer firstSubscriber = new Subscriber("Vasya");
        Observer secondSubscriber = new Subscriber("Petya");

        //добавляем подписчиков
        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        // добавляем третью вакансию
        site.addVacancy("Third java position");

        // удаляем вакансию
        site.removeVacancy("First java position");

    }
}
