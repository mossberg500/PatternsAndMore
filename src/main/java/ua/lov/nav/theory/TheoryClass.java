package ua.Lessons.nav.theory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class TheoryClass {

    @Test
    public void main1307() {

        List<Integer> list = new ArrayList<>();
        for (int i = 100; i > 0; i--) {
            list.add((int) (Math.random() * 1000));
        }

        int result = 0;
        for (Integer integer : list) {
            Integer temp = integer / 3;
            if(temp > 200){
                result += temp *10;
            }
        }

        Integer collect = list
                .stream()
                .map(i -> i / 3)
                /*
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 500;
                    }
                })
                */
                .filter(i -> i > 200)
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer * 10;
                    }
                })
                /*
                .collect(Collectors.summingInt(new ToIntFunction<Integer>() {
                    @Override
                    public int applyAsInt(Integer integer) {
                        return integer;
                    }
                }));
                 */
                .collect(Collectors.summingInt(i -> i));

        System.out.println(collect);
        System.out.println(result);
    }
}
