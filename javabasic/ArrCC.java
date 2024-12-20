import java.util.Scanner;

public class ArrCC {
    // Method to find and print all subarrays
    public static void SubArr(int nums[]) {
        int totalSub = 0;
        // Outer loop to fix the starting point
        for (int start = 0; start < nums.length; start++) {
            // Inner loop to fix the ending point
            for (int end = start; end < nums.length; end++) {
                // Loop to print elements between start and end
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                }
                totalSub++;
                System.out.println(); // Move to the next line for the next subarray
            }
            System.out.println(); // Extra space for better readability
        }
        System.out.println("The total subarrays are: " + totalSub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Create an array of the given size
        int nums[] = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the method to print subarrays
        SubArr(nums);
    }
}
