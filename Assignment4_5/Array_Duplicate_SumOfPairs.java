package Assignment_Package;

public class Array_Duplicate_SumOfPairs {

	// 3a. Find duplicate elements in an array
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
        if (!hasDuplicates) System.out.println("No duplicates found.");
        System.out.println();
    }

    // 3b. Find pairs of numbers that sum up to a target value
    public static void findPairsWithSum(int[] arr, int target) {
        System.out.println("Pairs with sum " + target + ": ");
        boolean foundPair = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    foundPair = true;
                }
            }
        }
        if (!foundPair) System.out.println("No pairs found.");
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 3, 67, 89, 3, 45};
      
        findDuplicates(array);

        findPairsWithSum(array, 90);
    }
}


