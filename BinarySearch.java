import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {3, 4, 53, 5, 66, 32, 52, 63};

        // Sort the array before performing binary search
        Arrays.sort(arr);

        // Input: Element to search
        int key = 3;
    
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is at mid
            if (arr[mid] == key) {
                result = mid;
                break;
            }

            // If key is smaller than mid, search left subarray
            else if (key < arr[mid]) {
                right = mid - 1;
            } else { // Search right subarray
                left = mid + 1;
            }
        }

        if (result == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
