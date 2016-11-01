package ru.stqa.pft.sandbox;

/**
 * Created by Vitaliy on 01.11.2016.
 */
public class Equality {
    public static void main(String[] args) {
        String s1 = "Firefox";
        String s2 = new String (s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}