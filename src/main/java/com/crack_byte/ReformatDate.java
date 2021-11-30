package com.crack_byte;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    static final Map<String, String> map = new HashMap<>(12);

    static {
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
    }

    public static void main(String[] args) {
        String s = reformatDate("2th Oct 2052");
        s=s;
    }

    public static String reformatDate(String date) {
        int i = 0, j = date.length();
        StringBuilder s = new StringBuilder();
        String day = null;
        String mon = null;
        while (i < j) {
            if (date.charAt(i) != ' ') {
                s.append(date.charAt(i));
            } else {
                if (day == null) {
                    if (s.length() == 3) {
                        day = '0'+s.substring(0, 1);
                    } else {
                        day = s.substring(0, 2);
                    }
                } else if (mon == null) {
                    mon = map.get(s.toString());
                }
                s = new StringBuilder();
            }
            i++;
        }
        return  s+ "-" + mon + "-" + day;
    }
}
