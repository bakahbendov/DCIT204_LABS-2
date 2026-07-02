import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Input target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Brute Force Search
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n===== Pair Found =====");
                    System.out.println("Index 1 : " + i);
                    System.out.println("Value 1 : " + numbers[i]);
                    System.out.println("Index 2 : " + j);
                    System.out.println("Value 2 : " + numbers[j]);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found whose sum equals " + target + ".");
        }

        scanner.close();
    }
}
