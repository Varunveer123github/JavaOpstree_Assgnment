public class Switch_Calculator {

    public static void main(String[] args) {
        int num1 = 10, num2 = 5, result;
        char op = '/';

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Please check operator....");
        }
    }
}
