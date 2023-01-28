package org.example;

public class Main {
    public static void main(String[] args) {
        ListList<Integer> list = new ListList<>();
        list.addList(2);
        list.addList(4);
        list.addList(8);
        list.addList(15);
        list.addList(16);
        list.addList(23);
        list.addList(42);

        for (Integer num: list) {
            System.out.println(num);
        }
    }
}