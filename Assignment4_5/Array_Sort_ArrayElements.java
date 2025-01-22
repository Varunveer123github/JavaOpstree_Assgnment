package Assignment_Package;

public class Array_Sort_ArrayElements {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 3, 67, 89, 3, 45};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(array);

        findDuplicates(array);
    }
}
