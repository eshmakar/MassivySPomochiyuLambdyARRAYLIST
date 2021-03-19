package com.test;

import java.util.ArrayList;

public class EcheKorocheVariant {

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
        list.add("раз");
        list.add("пять");
        list.add("четыре");
        list.add("два");
        list.add("три");

        list.sort(String::compareTo); // сортировка с помощью лямбды
        list.forEach(System.out::println); // вывод на консоль с помощью лямбды


    }
}
