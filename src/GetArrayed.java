import java.util.Random;
import java.util.Scanner;

public class GetArrayed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.print("Array Contents: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        int userInput = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100: ", 1, 100);
        System.out.println("You entered: " + userInput);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
            }
        }
        System.out.println("The value " + userInput + " was found " + count + " times in the array.");
        int userInput2 = SafeInput.getRangedInt(in, "Enter another integer value between 1 and 100: ", 1, 100);
        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput2) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + userInput2 + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userInput2 + " was not found in the array.");
        }
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int[] values) {
        if (values.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
