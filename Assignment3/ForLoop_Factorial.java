public class ForLoop_Factorial {

    static class Number {
        int a = 1, number = 5;

        public void factorial() {
            for (int i = 1; i <= number; i++) {
                a *= i;
            }
            System.out.println(a);

        }
    }

    public static void main(String[] args) {
        Number result = new Number();
        result.factorial();
    }
}
