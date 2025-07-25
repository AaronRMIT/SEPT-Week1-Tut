package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Data
        int[][] data = new int[][]{
                {70,61,72,83,38},
                {7,2,76,4,99},
                {28,9,13,78,19},
                {68,84,41,62,18},
                {37,57,40,13,50},
        };

        // Sort
        BubbleSort bubbleSort = new BubbleSort();
        for (int[] x : data) {
            String arrStr = Arrays.toString(bubbleSort.sort(x));
            System.out.println(arrStr);

        }
    }
}
