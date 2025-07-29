package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return (a > b) ? max(a, c) : max(b, c);
    }

    public static int max(int a, int b, int c, int d) {
        return (a > b) ? max(a, c, d) : max(b, c, d);
    }
}