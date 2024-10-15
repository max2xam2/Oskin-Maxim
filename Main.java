package org.example;

public class Main{
    public static void main(String[] args) {
        NewArrayList<Integer> list = new NewArrayList<>(10);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list.get(0));
    }
}