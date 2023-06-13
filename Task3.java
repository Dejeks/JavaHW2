package org.example.Homework.HW2;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};

        int sumOfIndices = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                sumOfIndices += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumOfIndices;
            }
        }

        System.out.println("Массив после замены отрицательных на сумму: " + Arrays.toString(array));
    }
}
