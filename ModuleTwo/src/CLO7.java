/*
Author: Angel Chavez
Assignment: Module 2 CLO 7
Date: 2/11/2024
Language: Java
Description: program with a bug in it to demo the use of the debugger feature in intellij.
*/
public class CLO7 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    private static double calculateAverage(int[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
