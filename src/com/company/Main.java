package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"papaya", "feijoa", "lychee", "pitahaya", "guava", "pomelo", "tamarind"};

        String[] food = Arrays.copyOf(fruits, fruits.length);

        for (int i = 0; i < food.length; i++) {
            System.out.println("Food item #" + (i + 1) + ": " + food[i]);
        }

        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};

        int[] result = {0, 0, 0};

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i] += score[i][j];
            }
            System.out.println("Result of sum #" + (i+1) + ": " + result[i]);
        }
    }
}
