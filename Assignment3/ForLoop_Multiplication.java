
public class ForLoop_Multiplication {

    static class Number {
        int a = 6, result;

        public void tableOf() {
            for (int i = 1; i <= 10; i++) {
                result = a * i;
                System.out.println(result);
            }

        }
    }

    public static void main(String[] args) {
        Number myTable = new Number();
        myTable.tableOf();
    }
}