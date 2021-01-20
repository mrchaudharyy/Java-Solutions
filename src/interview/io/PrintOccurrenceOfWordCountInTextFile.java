package interview.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintOccurrenceOfWordCountInTextFile {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/shubham.chaudhary/Personal/Programming/demo.txt"));

        String line = bufferedReader.readLine();

        // find occurrence of word in the string

        String[] spilt = line.split(" ");
        List<String> listOfStrings = new ArrayList<>();
        for (String word : spilt) {
            if (!listOfStrings.contains(word)) {
                listOfStrings.add(word);
            } else {
                System.out.println(word + " <- already exists");
            }
        }

        // find occurrence of char in the string

        String s = line.replace(" ", "");

        char[] arr = s.toCharArray();

        Map<String, Integer> map = new HashMap<>();

        for (char val : arr) {
            String value = String.valueOf(val);
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                int count = map.get(value);
                map.put(value, ++count);
            }
        }

        map.forEach((key, value) -> System.out.println(key + " appears " + value + " times"));
    }
}
