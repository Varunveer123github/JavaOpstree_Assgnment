package Learning_Package;

//Control Flow Statements in Java (Interview-Oriented Explanation)
//Java provides multiple control flow statements to execute code based on conditions. These include if-else, if-else if, the ternary operator, and switch statements.
//________________________________________
//1. If-Else Statement
//Definition:
//•	Executes a block of code if a condition evaluates to true; otherwise, executes the else block.
//Syntax:
//if (condition) {
//    // Code to execute if condition is true
//} else {
//    // Code to execute if condition is false
//}
//Example:
//int age = 20;
//if (age >= 18) {
//    System.out.println("Eligible to vote.");
//} else {
//    System.out.println("Not eligible to vote.");
//}
//Key Points:
//•	Used for binary decisions (true/false).
//•	The else block is optional.
//________________________________________
//2. If-Else If Ladder
//Definition:
//•	Used to evaluate multiple conditions sequentially. If one condition is true, its block is executed, and the rest are skipped.
//Syntax:
//if (condition1) {
//    // Code to execute if condition1 is true
//} else if (condition2) {
//    // Code to execute if condition2 is true
//} else {
//    // Code to execute if none of the above conditions are true
//}
//Example:
//int marks = 85;
//if (marks >= 90) {
//    System.out.println("Grade: A");
//} else if (marks >= 75) {
//    System.out.println("Grade: B");
//} else if (marks >= 50) {
//    System.out.println("Grade: C");
//} else {
//    System.out.println("Fail");
//}
//Key Points:
//•	Conditions are evaluated top-down.
//•	Use when there are multiple decision paths.
//________________________________________
//3. Ternary Operator
//Definition:
//•	A compact way to replace a simple if-else statement. It is also known as a conditional operator.
//Syntax:
//variable = (condition) ? valueIfTrue : valueIfFalse;
//Example:
//int age = 20;
//String result = (age >= 18) ? "Adult" : "Minor";
//System.out.println(result); // Output: Adult
//Key Points:
//•	Useful for concise code.
//•	Not suitable for complex conditions or multiple statements.
//________________________________________
//4. Switch Statement
//Definition:
//•	Executes one block of code from many options based on the value of an expression.
//Syntax:
//switch (expression) {
//    case value1:
//        // Code to execute if expression == value1
//        break;
//    case value2:
//        // Code to execute if expression == value2
//        break;
//    default:
//        // Code to execute if no case matches
//}
//
//
//
//Example:
//int day = 3;
//switch (day) {
//    case 1:
//        System.out.println("Monday");
//        break;
//    case 2:
//        System.out.println("Tuesday");
//        break;
//    case 3:
//        System.out.println("Wednesday");
//        break;
//    default:
//        System.out.println("Invalid day");
//}
//Key Points:
//•	The break statement prevents fall-through.
//•	Starting from Java 14, you can use the enhanced switch with -> syntax: 
//•	switch (day) {
//    case 1 -> System.out.println("Monday");
//    case 2 -> System.out.println("Tuesday");
//    default -> System.out.println("Invalid day");
//}
//________________________________________
//Comparison Table
//Feature	If-Else	If-Else If	Ternary Operator	Switch
//Use Case	Binary decision	Multiple conditions	Simple conditional assignment	Multiple predefined values
//Readability	Moderate	Moderate	High for simple cases	High for discrete values
//Performance	Slower for many conditions	Slower for many conditions	Faster, compact	Faster for large cases
//Flexibility	Highly flexible	Highly flexible	Limited to expressions	Limited to discrete values
//________________________________________
//Sample Code
//public class ControlFlowDemo {
//    public static void main(String[] args) {
//        int number = 10;
//
//        // If-Else
//        if (number > 0) {
//            System.out.println("Positive");
//        } else {
//            System.out.println("Non-positive");
//        }
//
//        // If-Else If
//        if (number > 0) {
//            System.out.println("Positive");
//        } else if (number < 0) {
//            System.out.println("Negative");
//        } else {
//            System.out.println("Zero");
//        }
//
//        // Ternary
//        String result = (number > 0) ? "Positive" : "Non-positive";
//        System.out.println("Ternary Result: " + result);
//
//        // Switch
//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
//    }
//}
