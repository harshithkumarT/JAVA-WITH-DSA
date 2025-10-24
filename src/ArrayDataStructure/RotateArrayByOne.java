package ArrayDataStructure;

public class RotateArrayByOne {

    /**
     * Rotates the given array by one position in clockwise direction.
     * <p>
     * Clockwise rotation means:
     * - The last element moves to the first position.
     * - All other elements shift one place to the right.
     * <p>
     * Example:
     * Input  : [1, 2, 3, 4, 5]
     * Output : [5, 1, 2, 3, 4]
     */
    public static void rotateByOne(int[] arr) {
        // Step 1: Check if array is null or has length <= 1 — nothing to rotate
        if (arr == null || arr.length <= 1) {
            return; // No rotation needed
        }

        // Step 2: Store the last element temporarily (it will move to the front)
        int lastElement = arr[arr.length - 1];

        // Step 3: Shift all elements one position to the right
        // We move from end → start to avoid overwriting values we still need
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 4: Put the last element at the first position
        arr[0] = lastElement;
    }

    // Helper method to print array in readable form
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}