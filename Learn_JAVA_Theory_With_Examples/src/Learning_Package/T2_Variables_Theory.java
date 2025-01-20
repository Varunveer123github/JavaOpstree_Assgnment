package Learning_Package;

//In Java, a variable is a container that holds data during program execution. 
//Variables are essential for storing and manipulating data, and they are defined with a data type and a name.
//________________________________________
//1. Types of Variables in Java

//A. Based on Scope

//1.  Local Variables:
//     o	Declared inside a method, constructor, or block.
//     o	Accessible only within the scope of that method or block.
//     o	Must be initialized before use.
//     o	Example: 
//               void display() {
//                   int age = 25; // Local variable
//                    System.out.println(age);         }
//2.  Instance Variables:
//     o	Declared inside a class but outside any method or constructor.
//     o	Belong to an instance of the class (each object has its own copy).
//     o	Default values are assigned if not initialized explicitly.
//     o	Example: 
//              class Person {
//                   String name; // Instance variable
//                     }
//3.  Static Variables:
//     o	Declared with the static keyword.
//     o	Shared among all instances of a class (only one copy exists).
//     o	Often used for constants or shared resources.
//     o	In Java, static variables cannot be directly declared in a non-static inner class. 
//          This restriction exists because non-static inner classes are tied to an instance of the enclosing class, 
//          while static members belong to the class itself and not to any instance.
//                using static final allows you to define a constant that is shared 
//                across all instances of the enclosing class or inner class.
//     o	Example: 
//              class Company {
//                  static String companyName = "TechCorp"; // Static variable
//                     }
//________________________________________
//B. Based on Data Type

//1.  Primitive Variables:
//     o	Store primitive data types like int, float, char, etc.
//     o	Example: 
//                int count = 10;
//2.  Reference Variables:
//     o	Store references to objects.
//     o	Example: 
//               String message = "Hello"; // Reference variable
//________________________________________
//2. Variable Declaration and Initialization
//     •	Declaration: Specify the data type and name. 
//                       int number;
//     •	Initialization: Assign a value to the variable. 
//                       number = 5;
//     •	Combined Declaration and Initialization: 
//                       int number = 5;
//________________________________________
//3. Access Modifiers with Variables
//     •	Variables can have access modifiers (public, private, protected, or default) to control their visibility.
//           Example: 
//               public int id;       // Accessible everywhere
//               private String name; // Accessible only within the class
//________________________________________
//4. Constants in Java
//     •	Declared using the final keyword.
//     •	Value cannot be changed once assigned.
//     •	Example: 
//               final double PI = 3.14159;
//________________________________________
//5.                                 Key Points for Interviews
//     •	Variables must be initialized before use.
//     •	Static variables are shared across all instances, while instance variables are unique to each object.
//     •	Local variables do not have default values and must be initialized explicitly.
//     •	Use final keyword for constants to ensure immutability.
//________________________________________

public class T2_Variables_Theory {
    class VariablesDemo {
        static final String company = "TechCorp"; // Static variable (needs to be `final` for inner classes)
        int employeeId;                          // Instance variable

        void display() {
            int age = 30; // Local variable
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
    	T2_Variables_Theory outer = new T2_Variables_Theory(); // Create instance of outer class
        VariablesDemo demo = outer.new VariablesDemo();  // Create instance of inner class
        demo.employeeId = 101;
        demo.display();
        System.out.println("Company: " + VariablesDemo.company);
    }
}

