/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;


public class Library {
    public static void main(String[] args) {
        System.out.println("test");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String unseenTemperatures = findUnseenTemperatures(weeklyMonthTemperatures);
        System.out.println("Unseen temperatures: " + unseenTemperatures);
    }

    public static String findUnseenTemperatures(int[][] weeklyMonthTemperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;

        HashSet<Integer> uniqueTemperatures = new HashSet<>();

        for (int week = 0; week < weeklyMonthTemperatures.length; week++) {
            for (int day = 0; day < weeklyMonthTemperatures[week].length; day++) {
                int temp = weeklyMonthTemperatures[week][day];
                minTemp = Math.min(minTemp, temp);
                maxTemp = Math.max(maxTemp, temp);
                uniqueTemperatures.add(temp);
              }

            }

        String unseenTemperatures = "";
        for (int i = minTemp; i <= maxTemp; i++) {
            if (!uniqueTemperatures.contains(i)) {
                unseenTemperatures = +i + " ";
            }
        }
        return unseenTemperatures;
    }

        public int[] roll ( int n){
            int[] rolls = new int[n];
            Random random = new Random();
            int min = 1;
            int max = 6;

            for (int i = 0; i < n; i++) {
                rolls[i] = random.nextInt(max - min + 1) + min;
            }
            return rolls;
        }

        public boolean containsDuplicates ( int[] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        public double calculateAverage ( int[] array){
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            return (double) sum / array.length;
        }
    }



//ChatGPT Help with nested array
//ChatGPT help with unseen temperature syntax