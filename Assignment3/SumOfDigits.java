public class SumOfDigits {

    public static void main(String[] args) {

        SumOfInteger result = new SumOfInteger();
        result.sum();
    }

    public static class SumOfInteger {
        int number = 123456, sum = 0;

        public void sum() {
            while (number != 0) {
                int digit = number % 10;
                sum = sum + digit;
                number /= 10;
            }
            System.out.println("Summ of Digits of Given Number is : " + sum);
        }
    }
}
