package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    int[] arrayOfIndex = new int[2];
                    arrayOfIndex[0] = i;
                    arrayOfIndex[1] = j;
                    return  arrayOfIndex;
                }
            }
        }
        return new int[0];
    }

    public static int[] getIndexes2(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if ((array[i] + array[j]) == target) {
                return new int[] {i, j};
            }
            if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
 }