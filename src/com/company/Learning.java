package com.company;

public class Learning {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 5;
        System.out.println(a+b);
        int var = 5;
        int var2 = var / 2;
        var2 += 5;
        var2 *= 2;
        var2 = var2 - 4;
        System.out.println("Anutka");
        System.out.println("value of var2 = " + var2);

        boolean flag = b > a;
        flag = b == 5;
        flag = a != 3;
        flag = !flag;
        flag = true && false;
        System.out.println(flag);

        if (a < b) {
            if (a == 2) {
                System.out.println("a = 3");
            } else if (a == 3) {
                System.out.println("1");
            } else if (a == 5) {
                System.out.println("2");
            } else {
                System.out.println("inner else");
            }
            System.out.println("if condition");
        } else {
            System.out.println("outer else");
        }

        for (a = 0; a <= 5; a++) {
            System.out.println(a);
        }

        for (a = 0; a <= 5; a++) {
            if (flag || a == 3) {
                System.out.println("flag is true");
            }
        }

        if (++a == 6) {
            System.out.println("sometext: " + a);
        }

        System.out.println(a);

        String s = "Anutka is very\" pretty";
        System.out.println(s);

        System.out.println(a % 4);
        System.out.println(++a);
        System.out.println(a);
        System.out.println("end");
    }
}
