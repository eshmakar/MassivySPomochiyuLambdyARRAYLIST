package com.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); //Строковой массив
        list.add("one"); //добавляем элементы по одному
        list.add("two");
        list.add("three");
        list.add("for");
        list.add("five");
        System.out.println("Список: " + list);
        System.out.println("Заменяем: " + list.get(1)+"\n");
        list.set(1, "dva"); // замена 2 элемента по индексу
        System.out.println("Список: " + list);
        list.forEach((x) -> System.out.println("Элемент: "+x)); //обходим список с помощью лямбда выражении


    }
}
