package com.crack_byte;

import java.util.*;

public class PascalTriangle {
    static final Map<Integer, List<Integer>> map = new HashMap<>();

    static {
        map.put(0, Arrays.asList(1));
        map.put(1, Arrays.asList(1, 1));
        map.put(2, Arrays.asList(1, 2, 3));
    }

    static {
        map.put(0, Arrays.asList(1));
        map.put(1, Arrays.asList(1, 1));
        map.put(2, Arrays.asList(1, 2, 1));
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(4);
        generate = generate;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        int i = 0;
        while (i < numRows) {
            if (!map.containsKey(i)) {
                map.put(i, check(map.get(i - 1)));
            }
            list.add(map.get(i));
            ++i;
        }
        return list;
    }

    static List<Integer> check(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers.size());
        list.add(1);
        for (int i = 1; i < integers.size(); ++i) {
            list.add(integers.get(i) + integers.get(i - 1));
        }
        list.add(1);
        return list;
    }
}
