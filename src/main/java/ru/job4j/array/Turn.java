package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length -  - 1];
            array[array.length - i - 1] = temp;
             if (i > (array.length / 2) - 2) {
                 break;
             }
        }
        return array;
    }
}
