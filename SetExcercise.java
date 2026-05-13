package setExample;

import java.util.*;

public class SetExcercise {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1232221133);
        numbers.add(1232223333);
        numbers.add(1232223333);
        numbers.add(1232324533);
        numbers.add(1235623333);
        numbers.add(23000333);
        numbers.add(55);
        numbers.add(444223333);

        Set<Integer> uniqueNum =new HashSet<>(numbers);
        for (Integer num:uniqueNum){
            System.out.println(num);
        }


    }
}
