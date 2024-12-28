package com.Algorithms;
import java.util.Arrays;

public class GreedyAlgorithm {//coin change example

    public static void coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }

        if (amount > 0) {
            System.out.println("Cannot make exact change");
        } else {
            System.out.println("Minimum coins required: " + count);
        }
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;
        coinChange(coins, amount);
    }
}
