/**
 * Brian Dao
 * CMSC401
 * Majority Element Finder
 * 09/08/2022
 */
import java.util.Scanner;

public class cmsc401 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        // Initializing Majority Element Variable
        int majorityElement;

        // Receive first input and create new array
        int numLines = input.nextInt();
        int[] array = new int[numLines];

        // Add inputs to array
        for(int i = 0 ; i < numLines ; i++) {
            array[i] = input.nextInt();
        }

        // Boyer & Moore approach:
        // First element is selected as the Majority Element
        // Use a counter to determine a Majority Element
        int count = 0;
        int check = 0;
        majorityElement = array[0];

        // Scanning through the array, increasing or decrease the count depending on the next element
        // Change Majority Element if count ever goes below zero
        for(int i = 0 ; i < array.length - 1 ; i++) {
            if(array[i] == array[i+1] && array[i] == majorityElement) {
                count++;
            }
            else {
                if(count == 0) {
                    majorityElement = array[i + 1];
                }
                else {
                    count--;
                }
            }
        }

        // Check how many times majorityElement pops up in the array
        for(int i = 0 ; i < array.length ; i++) {
            if(array[i] == majorityElement) {
                check++;
            }
        }

        // Print if majorityElement is confirmed, Print -1 otherwise
        if(check > array.length/2) {
            System.out.println(majorityElement);
        }
        else{
            System.out.println(-1);
        }
    }
}
