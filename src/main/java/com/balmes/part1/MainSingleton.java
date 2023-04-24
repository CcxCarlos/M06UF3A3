package com.balmes.part1;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        boolean uuidIsEqual = s1.equals(s2);
        System.out.println("Són iguals: " + uuidIsEqual);

        if (uuidIsEqual){
            System.out.println("s1: " + s1.getUuid());
            System.out.println("s2: " + s2.getUuid());
        }
    }
}