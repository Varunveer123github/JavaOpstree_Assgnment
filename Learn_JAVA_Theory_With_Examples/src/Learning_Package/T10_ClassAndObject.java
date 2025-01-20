package Learning_Package;

//Java is an object-oriented programming (OOP) language where the concepts of classes and objects 
//form the foundation.
//________________________________________
//1. What is a Class?
//   Definition:
//   A class is a blueprint or template for creating objects. 
//   It defines the structure (fields/attributes) and behavior (methods/functions) of objects.
//   Key Features:
//    •	Contains fields (variables) to hold data.
//    •	Contains methods to define the behavior.
//    •	Does not occupy memory until an object is created.
//    Syntax:
//    class ClassName {
//    // Fields (Attributes)
//    int attribute;
//
//    // Methods (Behaviors)
//    void methodName() {
//        // Method body
//    }
//    }
//     Example:
//       class Car {
//         String brand;  // Attribute
//         int speed;     // Attribute
//         void drive() {  // Behavior
//         System.out.println(brand + " is driving at " + speed + " km/h.");
//    }   
//  }
//
//________________________________________
//2. What is an Object?
//   Definition:
//   An object is an instance of a class. It represents a specific entity with a unique state and behavior.
//   Key Features:
//   •	Occupies memory when created.
//   •	Interacts with other objects via methods.
//   Syntax:
//     ClassName objectName = new ClassName();
//        Example:
//                public class Main {
//                public static void main(String[] args) {
//                   Car myCar = new Car();  // Object creation
//                   myCar.brand = "Tesla"; // Setting attributes
//                   myCar.speed = 100;
//                   myCar.drive();         // Calling method
//                     }
//                   }
//                 Output:
//               Tesla is driving at 100 km/h.
//________________________________________
//3. Differences Between Class and Object

//      Aspect      	 Class       	                      Object
//--------------------------------------------------------------------------------------------
//      Definition   	Blueprint for creating objects  	Instance of a class
//      Memory	        Does not occupy memory           	Occupies memory
//      Purpose	        Defines attributes and methods	    Holds specific data and behavior
//      Example	        Car	                                myCar (an instance of Car)
//---------------------------------------------------------------------------------------------
//________________________________________
//4. Why Use Classes and Objects?
//   •	Reusability: Code can be reused by creating multiple objects from a single class.
//   •	Encapsulation: Combines data and methods into a single unit.
//   •	Abstraction: Hides complex implementation details.
//   •	Inheritance: Enables creating new classes based on existing ones.
//   •	Polymorphism: Allows objects to take multiple forms.
//________________________________________
//5. Code Example Combining Class and Object
//class Person {
//    String name;  // Attribute
//    int age;      // Attribute
//
//    void introduce() {  // Behavior
//        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Creating objects
//        Person person1 = new Person();
//        person1.name = "Alice";
//        person1.age = 25;
//
//        Person person2 = new Person();
//        person2.name = "Bob";
//        person2.age = 30;
//
//        // Calling methods
//        person1.introduce();
//        person2.introduce();
//    }
//}
//Output:
//Hi, my name is Alice and I am 25 years old.
//Hi, my name is Bob and I am 30 years old.
//________________________________________
//                                              Interview Tips
//•	Emphasize the modularity and reusability provided by classes.
//•	Highlight the relationship between class and object (class as a blueprint, object as an instance).
//•	Be prepared to explain object lifecycle: declaration, instantiation, and initialization.
//  The object lifecycle in Java involves the following stages:
//    Creation: Objects are instantiated using new, reflection, deserialization, or cloning. 
//                Memory is allocated on the heap, and constructors initialize the object.
//    In Use: The object is actively used, with methods invoked and fields accessed. 
//                It remains in memory as long as there are active references.
//    Becomes Unreachable: When no references point to the object, it becomes eligible for garbage collection.
//    Garbage Collection: The JVM's Garbage Collector reclaims memory occupied by unreachable objects. 
//                This process is automatic and unpredictable.
//    Destruction: The object's memory is freed, and resources are returned to the JVM for reuse. 
//                  External resources (e.g., files, sockets) should be explicitly released before this stage.
//    Key Notes:
//    Garbage collection is non-deterministic and cannot be forced.
//    Avoid finalizers; use try-with-resources or explicit cleanup for resource management.
//
//    •	Mention real-life analogies to simplify the explanation.
//=====================================================================================================

//Class and Object Practical Examples in Java
//________________________________________
//1. Simple Example: Defining and Using a Class
//Code:
//class Animal {
//    String name; // Attribute
//    int age;     // Attribute
//
//    void speak() { // Method
//        System.out.println(name + " is " + age + " years old and says hello!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal dog = new Animal(); // Object creation
//        dog.name = "Buddy";
//        dog.age = 5;
//
//        dog.speak(); // Calling the method
//    }
//}
//Output:
//Buddy is 5 years old and says hello!
//________________________________________
//2. Constructor Example
//Code:
public class T10_ClassAndObject{
public static class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }
}


    public static void main(String[] args) {
//    	T10_ClassAndObject obj = new T10_ClassAndObject();
        Car myCar = new Car("Tesla", 2023); // Object with constructor
        myCar.displayInfo();
    }

}
//Output:
//Car: Tesla, Year: 2023
//________________________________________
//3. Encapsulation Example
//Code:
//class BankAccount {
//    private String accountHolder;
//    private double balance;
//
//    // Getter and Setter
//    public String getAccountHolder() {
//        return accountHolder;
//    }
//
//    public void setAccountHolder(String accountHolder) {
//        this.accountHolder = accountHolder;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        } else {
//            System.out.println("Invalid deposit amount!");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.setAccountHolder("Alice");
//        account.deposit(1000);
//
//        System.out.println("Account Holder: " + account.getAccountHolder());
//        System.out.println("Balance: $" + account.getBalance());
//    }
//}
//Output:
//Account Holder: Alice
//Balance: $1000.0
//________________________________________
//4. Real-World Example: Student Class
//Code:
//class Student {
//    String name;
//    int rollNumber;
//    double marks;
//
//    void displayDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Roll Number: " + rollNumber);
//        System.out.println("Marks: " + marks);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name = "John";
//        student1.rollNumber = 101;
//        student1.marks = 85.5;
//
//        student1.displayDetails();
//    }
//}
//Output:
//Name: John
//Roll Number: 101
//Marks: 85.5
//________________________________________
//5. Example Using Multiple Objects
//Code:
//class Rectangle {
//    int length, width;
//
//    void setDimensions(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    int calculateArea() {
//        return length * width;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Rectangle rect1 = new Rectangle();
//        rect1.setDimensions(5, 10);
//
//        Rectangle rect2 = new Rectangle();
//        rect2.setDimensions(7, 3);
//
//        System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
//        System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
//    }
//}
//Output:
//Area of Rectangle 1: 50
//Area of Rectangle 2: 21
//________________________________________
//6. Example with Array of Objects
//Code:
//class Book {
//    String title;
//    String author;
//
//    Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }
//
//    void displayInfo() {
//        System.out.println("Title: " + title + ", Author: " + author);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Book[] library = new Book[3];
//
//        library[0] = new Book("The Alchemist", "Paulo Coelho");
//        library[1] = new Book("1984", "George Orwell");
//        library[2] = new Book("To Kill a Mockingbird", "Harper Lee");
//
//        for (Book book : library) {
//            book.displayInfo();
//        }
//    }
//}
//Output:
//Title: The Alchemist, Author: Paulo Coelho
//Title: 1984, Author: George Orwell
//Title: To Kill a Mockingbird, Author: Harper Lee
//________________________________________
//Key Takeaways for Interviews
//1.	Basic Concepts: Understand how to create and use classes and objects.
//2.	Constructors: Highlight their role in initializing objects.
//3.	Encapsulation: Use getters and setters to protect data.
//4.	Reusability: Demonstrate using multiple objects and array of objects.
//5.	Real-World Examples: Relate examples to real-life scenarios like banking, students, or shapes.

