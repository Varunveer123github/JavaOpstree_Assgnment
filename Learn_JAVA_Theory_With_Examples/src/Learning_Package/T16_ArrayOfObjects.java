package Learning_Package;

//An Array of Objects is a collection of references to objects of a specific class. 
//This allows storing multiple objects of the same type in a single array.    ________________________________________
//1. Why Use an Array of Objects?
//   •	To manage a collection of similar objects efficiently.
//   •	Grouping related objects for operations like sorting, searching, or processing.
//________________________________________
//2. Declaring and Initializing an Array of Objects
//   Declaration
//        ClassName[] arrayName = new ClassName[size];
//   Initialization
//   •	The array is created with references initialized to null.
//   •	Objects need to be instantiated separately.
//   Example:
      class Book {
         String title;
         String author;

         Book(String title, String author) {
           this.title = title;
           this.author = author;
           }

           void display() {
             System.out.println("Title: " + title + ", Author: " + author);
            }
           }

        public class T16_ArrayOfObjects {
            public static void main(String[] args) {
        // Declare and initialize an array of Book objects
        Book[] books = new Book[3];

        // Create individual objects and assign to array elements
        books[0] = new Book("Java Programming", "James Gosling");
        books[1] = new Book("Effective Java", "Joshua Bloch");
        books[2] = new Book("Head First Java", "Kathy Sierra");

        // Access and display each object
        for (Book book : books) {
            book.display();
        }
    }
}

//Output:
//Title: Java Programming, Author: James Gosling
//Title: Effective Java, Author: Joshua Bloch
//Title: Head First Java, Author: Kathy Sierra
//________________________________________
//3. Accessing Objects in the Array
//You can access objects in the array using their index and call methods or access fields.
//Example:
//System.out.println(books[0].title); // Outputs: Java Programming
//books[1].display(); // Outputs: Title: Effective Java, Author: Joshua Bloch
//________________________________________
//4. Dynamic Initialization
//You can initialize the array dynamically based on input or runtime conditions.
//Example:
        
//import java.util.Scanner;
//
//class Employee {
//    String name;
//    int age;
//
//    Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("Employee Name: " + name + ", Age: " + age);
//    }
//}
//
//public class DynamicArrayOfObjects {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Create an array of Employee objects
//        Employee[] employees = new Employee[2];
//
//        // Initialize each element dynamically
//        for (int i = 0; i < employees.length; i++) {
//            System.out.print("Enter employee name: ");
//            String name = scanner.nextLine();
//            System.out.print("Enter employee age: ");
//            int age = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline
//            employees[i] = new Employee(name, age);
//        }
//
//        // Display employee details
//        for (Employee emp : employees) {
//            emp.display();
//        }
//    }
//}
//________________________________________
//5. Key Points to Remember
//   1.	Default Values:
//      o	When an array of objects is created, all elements are initialized to null until assigned.
//   2.	Employee[] employees = new Employee[5];
//   3.	System.out.println(employees[0]); // Outputs: null
//   4.	Homogeneous Data:
//      o	All elements in the array must be of the same class or its subclass.
//   5.	Memory Usage:
//      o	The array stores references to objects, not the objects themselves.
//   6.	Array of Interfaces:
//      o	You can create an array of interfaces and store objects of classes implementing that interface.
//________________________________________
//6. Use Cases
//Student Management System: Storing and managing student records.
//E-commerce: Managing product details in an inventory.
//Game Development: Storing player or enemy object 


