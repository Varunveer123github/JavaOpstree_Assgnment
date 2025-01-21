package Assignment_Package;

public class ArrayLarSmallAverage{
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 20, 1, 15};
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > largest) {
                largest = num; 
            }
            if (num < smallest) {
                smallest = num; 
            }
            sum += num; 
        }

        double average = (double) sum / numbers.length;
        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Average of elements: " + average);
    }
}
