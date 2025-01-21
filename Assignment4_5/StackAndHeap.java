      package Assignment_Package;
//1.	Write a program to demonstrate memory allocation in the stack and heap:
//a.	Create a class Person with fields name and age.
//b.	Instantiate multiple objects of Person and explain in comments where they are stored in memory.
//2.	Explain with comments how local variables, method calls, and object references behave in 
//      the stack and heap.

      public class StackAndHeap {

          static class Person {
              String name; // Stored in the heap (object)
              int age;     // Stored in the heap (object)
          }

          public static void main(String[] args) {
              // Local variable 
              int localVariable = 42;   // stored in the stack
              System.out.println("Local Variable (stored in stack): " + localVariable);

              // Create Person objects
              Person person1 = new Person(); // Reference  in stack, object  in heap
              person1.name = "Varun";        // Name stored in heap as part of the object
              person1.age = 26;              // Age stored in heap as part of the object

              Person person2 = new Person(); // Reference in stack, object stored in heap
              person2.name = "Nitin";          // Name in heap as part of the object
              person2.age = 24;              // Age in heap as part of the object

              System.out.println("Person1: Name = " + person1.name + ", Age = " + person1.age);
              System.out.println("Person2: Name = " + person2.name + ", Age = " + person2.age);
          }
      }

