package com.company;

import javax.crypto.spec.PSource;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.Callable;

import static java.lang.System.in;
import static java.lang.System.setOut;


public class Main {

    public static void main(String[] args) {
        // write your code here
        intNum();
        ArrayList();
        LinkedList();


    }

    public static void intNum() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Numbers before to sort: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Numbers after to sort: " + Arrays.toString(array));
    }

    public static void ArrayList() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, random.nextInt(2));
        }
        System.out.println(arrayList);
            System.out.println("ArrayList before to sort: "+ arrayList);
            Collections.sort(arrayList);
            System.out.println("ArrayList after to sort: "+ arrayList);
    }

    public static void LinkedList() {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i, random.nextInt(2));
        }
        System.out.println(linkedList);
        System.out.println("LinkedList before to sort: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("LinkedList after to sort: " + linkedList);
        }
    }




