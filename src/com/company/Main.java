package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> city =new HashMap<>();
        city.put("Madrid",35000);
        city.put("Barcelona",23000);
        city.put("Sevilla",45000);

        Iterator<Map.Entry<String,Integer>>iterator=city.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer>entry=iterator.next();
        System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}
