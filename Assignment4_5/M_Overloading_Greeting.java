package Assignment_Package;

//2.	Create a class Greeting with a method sayHello:
//      a.	One version takes no parameters and prints a general greeting.
//      b.	Another version takes a string parameter for the name and prints a personalized greeting

public class M_Overloading_Greeting {

	public void sayHello() {
		System.out.println("Hello! Good Morning!");
	}
	public void sayHello(String name) {
		System.out.println("Hello! "+name+ " Good Morning!, How are you doing?");

	}
	public static void main(String[] args) {
		M_Overloading_Greeting obj= new M_Overloading_Greeting();
		obj.sayHello();
		obj.sayHello("Varun Pandey");

	}

}
