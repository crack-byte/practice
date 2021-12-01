package com.crack_byte;

import java.util.HashMap;
import java.util.Map;

public class MostOccurredString {

    public static void main(String[] args) {
        String[] arr = {"geeks", "for", "geeks", "a",
                "portal", "to", "learn", "can", "be",
                "computer", "science", "zoom", "yup",
                "fire", "in", "be", "data", "geeks"};

        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        String key = "";
        int total = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey();
            Integer sum = entry.getValue();
            if (sum > total) {
                key = s;
                total = sum;
            } else if (sum == total) {
                if (key.compareTo(s) < 0) key = s;
            }
        }
    }
}
