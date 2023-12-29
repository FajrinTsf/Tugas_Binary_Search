// Java implementation of iterative Binary Search

import java.io.*;
import java.util.Arrays;

class BinarySearch {

    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    // Fungsi Bubble Sort dari tugas sebelumnya untuk mengurutkan array
    static void bubbleSort(int arr[], int n, String TypeSort) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;

            for (j = 0; j < n - i - 1; j++) {
                if (TypeSort == "ASC" && arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                } else if (TypeSort == "DESC" && arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break if (swapped == false)
            if (swapped == false) break;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        //int arr[] = { 2, 3, 4, 10, 40 };
        int arr[] = { 50, 7, 8, 40, 10, 4, 3, 2 };

        //Implementasi Bubble Sort
        bubbleSort(arr, arr.length, "ASC");
        System.out.println("========================================================");
        System.out.println("Sorted array : " + Arrays.toString(arr));

        int x = 8;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element " + x + " is not present in array");
        else
            System.out.println("Element " + x + " is present at "
                    + "index " + result);
    }
}
