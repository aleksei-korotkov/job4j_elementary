package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int result = 1;
        if (number == 0) {
            return result;
        } else {
            for (int i = 1; i <= number; i++) {
                if (number == 1) {
                    return result;
                }
                result = result * i;
            }
        }
        return result;
    }
}