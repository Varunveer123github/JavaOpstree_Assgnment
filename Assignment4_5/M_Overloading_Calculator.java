package Assignment_Package;

public class M_Overloading_Calculator {
    public int calculateSum(int x, int y) {
        return x + y;
    }
    public int calculateSum(int x, int y, int z) {
        return x + y + z;
    }
    public int calculateSum(int[] arr) { 
        int sum = 0;
        for (int num : arr) { 
            sum += num;
        }
        return sum; 
    }

    public static void main(String[] args) {
        M_Overloading_Calculator obj = new M_Overloading_Calculator();

        int result1 = obj.calculateSum(5, 6);
        int result2 = obj.calculateSum(5, 6, 7);
        int[] num = {1, 2, 3, 4, 5, 6};

        System.out.println("The sum of two integers is: " + result1);
        System.out.println("The sum of three integers is: " + result2);
        System.out.println("The sum of array elements is: " + obj.calculateSum(num));
    }
}
