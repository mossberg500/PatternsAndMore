package ua.lov.specialisttv.predicates;

import java.util.ArrayList;
import java.util.List;

public class programAp {
    public static void main(String[] args) {
        List<Person> nums = new ArrayList<>();

        nums.add(new Person("Сергей", 38));
        nums.add(new Person("Даша", 7));
        nums.add(new Person("Глаша", 3));
        nums.add(new Person("Саша", 6));
        nums.add(new Person("Анна", 18));

//        for (Person p : nums)
//            System.out.println(p);

        //интерфейс Consumer
        nums.stream()
                .forEach(
                        (Person p) -> {
                            System.out.println(p);
                        }
                );

        nums.stream()
                .forEach(p -> System.out.println(p)
                );

        // Поскольку параметром метода println является
        // список параметров такой же, что и параметров
        // самого лямбда-выражения
        //метод println объекта ссылки System.out является реализацией
        // этого лямбда выражения

        nums.stream()
                .forEach(System.out::println);


        System.out.println("--predicate---------------");
        //predicate
        nums.stream()
                .filter(p -> p.getAge()>= 18 )
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())  )
                .map(p -> p.getName())
                .forEach(System.out::println);

        int summa = 0;
        int adultPersons = 0;
        for (Person p : nums) {
            if (p.getAge() >= 18) {
                summa += p.getAge();
                adultPersons++;
            }
        }
        double averageAge = (double)summa / adultPersons;
        System.out.println(averageAge);


        double averageAge2 = nums.stream()
                .filter(p -> p.getAge() >= 18)
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();

        System.out.println(averageAge2);



    }
}
