package org.example;

import java.util.Arrays;
import java.util.Scanner;

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

        // Other Sort with system.in
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(bubbleSort.sort(array)));
    }
}
