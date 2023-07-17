/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;
import java.util.Arrays;

public class Library {
    public static void main(String[] args){
        System.out.println("test");
    }
    public int[] roll(int n) {
        int[] rolls = new int[n];
        Random random = new Random();
        int min = 1;
        int max = 6;

        for (int i = 0; i < n; i++) {
            rolls[i] = random.nextInt(max - min + 1) + min;
        }
        return rolls;
    }

    public boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public double calculateAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }
}


//ChatGPT Help with nested array
