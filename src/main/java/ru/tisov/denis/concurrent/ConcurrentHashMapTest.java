package ru.tisov.denis.concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");

        Iterator<String> iterator = map.keySet().iterator();

        int i = 4;
        while (iterator.hasNext()) {
            System.out.println("i: " + i);
            System.out.println(map.get(iterator.next()));
            map.put(i * 100 + "", i + "");
            i += 1;
        }

    }

}
