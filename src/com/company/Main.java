package com.company;

public class Main {

    public static void main(String[] args) {
        String source = "Hello Anton Putin";
        String[] array = source.split(" ");
        source = "";
        for(int i = array.length - 1; i >= 0; i--) {
            source += array[i] + " ";
        }
        System.out.println(source);
    }
}