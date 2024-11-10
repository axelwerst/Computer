package com.gmail.axelwerst;

import java.util.Arrays;

public class Util {
    private int[] array;
    private int delet;

    public Util() {
        this.array = array;
        this.delet = delet;
    }
    public int getDelet() {
        return delet;
    }
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public void setDelet(int delet) {
        this.delet = delet;
    }

    public int[] removeNumber() {
        int abcurz = 0;
        if (array == null) {
            return new int[0];  // Повертаємо порожній масив, якщо array == null
        }

        for (int num : array) {
            if (num == delet) {
                abcurz++;
            }
        }

        int[] result = new int[array.length - abcurz];
        int t = 0;

        for (int num : array) {
            if (num != delet) {
                result[t] = num;
                t++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Util{" +
                "result=" + Arrays.toString(removeNumber()) +
                '}';
    }
}
