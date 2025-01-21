package Assignment_Package;
//2.	Implement a program with methods to:
//          b.	Find the factorial of a given number.

public class CreteMethodCheckFactorial {

	    public void factorial(int x) {
	    	if(x<=0) {
	    		System.out.println("Please enter any positive number greater than 2 to see effective result!!!");
	    	}
	    	int result=1;
	    	for(int i=1;i<=x; i++) {
	    		result=i*result;
	    		System.out.println(result);
	    	}
	    	
	    }
	public static void main(String[] args) {
            int num1= 5;
            CreteMethodCheckFactorial obj=new CreteMethodCheckFactorial();
            obj.factorial(num1);
	}

}
