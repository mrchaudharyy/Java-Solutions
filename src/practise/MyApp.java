package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyApp {
    public static void main(String[] args) {
       String myString = "abcda";

        String collect = Arrays.asList(myString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
