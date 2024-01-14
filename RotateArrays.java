package javaQues;

public class RotateArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotateBy = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateRight(array, rotateBy);

        System.out.println("\nArray after rotating to the right by " + rotateBy + " positions:");
        printArray(array);
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            rotatedArray[newPosition] = arr[i];
        }

        
        System.arraycopy(rotatedArray, 0, arr, 0, n);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

