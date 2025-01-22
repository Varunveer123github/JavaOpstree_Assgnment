package Assignment_Package;

public class Array_LArgest_Smallest_Average {
    public static void initializeArray() {
        int[] arr = {12, 45, 3, 67, 89, 3, 45};
        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        findLargestSmallest(arr);
        calculateAverage(arr);
    }

    public static void findLargestSmallest(int[] arr) {
        int largest = arr[0], smallest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    public static void calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Average: " + average);
    }
	public static void main(String[] args) {
		Array_LArgest_Smallest_Average obj= new Array_LArgest_Smallest_Average();
		obj.initializeArray();
	}

}
