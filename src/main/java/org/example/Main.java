//Пусть дан произвольный список из 100 целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        {
            for (int i = 0; i < 100; i++) {
                list.add(new Random().nextInt(20));//created new random list
            }
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2 = list;
        for (int j = 0; j < list2.size(); j++) {
            if (list2.get(j) % 2 == 0) list2.remove(j--);//removed all odd numbers

        }
        System.out.println(list2);
        int min = list2.get(0);
        int max = list2.get(0);
        int length = list2.size();
        int summa = 0;
        int overage = 1;
        for (Integer k : list2) {
            if (k < min)
                min = k;
            if (k > max)
                max = k;

        }
        System.out.println("the smallest number is " + min);
        System.out.println("the highest number is " + max);

        for (int s = 0; s < length; s++) {
            summa = summa + list2.get(s);
            overage = summa / length;
        }

        System.out.println("the overage number is " + overage);
    }
}








