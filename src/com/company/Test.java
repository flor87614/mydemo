package com.company;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) throws Exception {
        SimpleList<Integer> list = new MySimpleList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        list.insert(3,9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        Optional<Integer> value = list.get(300);
        System.out.println(list);
        System.out.println(value.orElse(null));
        int size = list.size();
        System.out.println("size = " + size);
        SimpleList<Integer> list2 = new MySimpleList();
        list2.add(11);
        list2.add(5);
        list2.add(13);
        list2.add(6);
        list2.add(15);

        list.addAll(list2);
        System.out.println(list);
        int first = list.first(6);
        System.out.println(first);
        int last = list.last(5);
        System.out.println(last);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(10));
        System.out.println(list.contains(130));
        System.out.println(list.toString( ));



        SimpleList<String> stringList = new MySimpleList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");

        SimpleList<String> stringList2 = new MySimpleList<>();
        stringList2.add("one");
        stringList2.add("two");
        stringList2.add("three");
        stringList2.add("four");
        stringList2.add("five");
        stringList2.add("six");

        stringList.addAll(stringList2);
        System.out.println(stringList.contains("three"));
        System.out.println(stringList.first("three"));
        System.out.println(stringList.last("three"));

        System.out.println(stringList);
    }
}
