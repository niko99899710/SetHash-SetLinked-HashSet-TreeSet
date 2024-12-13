package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 (){
        System.out.println("Задание 1");
        HashSet<colorFruits> color1 = new HashSet<>();
        color1.add(new colorFruits ("cherry","red"));
        color1.add(new colorFruits("blueberry","blue"));
        color1.add(new colorFruits("curran","black"));
        System.out.println(color1);

        HashSet <colorFruits> color2 = new HashSet<>();
        color2.add(new colorFruits("lemon","yellow"));
        color2.add(new colorFruits("raspberry","pink"));
        color2.add(new colorFruits("curran","black"));
        System.out.println(color2);


        color1.retainAll(color2);
        System.out.println(color1);

    }
    public static void task2 (){
        System.out.println("Задание 2");
        HashSet <Integer> oneNumbers = new HashSet<>();
        oneNumbers.add(1);
        oneNumbers.add(42);
        oneNumbers.add(37);
        oneNumbers.add(24);
        oneNumbers.add(12);
        oneNumbers.add(15);
        oneNumbers.add(14);
        oneNumbers.add(8);
        oneNumbers.add(9);
        for (Integer item: oneNumbers){
            if(item >15 && item%2==0){
                System.out.println("Четные и больше 15 "+ item);
        } else {
                System.out.println("оригинал " + item + " Число /2 " + item /2.0);
            }



           }
       }

    }
