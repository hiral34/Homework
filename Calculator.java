public class Calculator {           //My class for calculating two digits
    static int a=30;                //initialising and declaring static integer a
    //static int b=15;
    public static void add(int a,int b){    //addition method with no return and two parameters
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b)); //printing output from method as not returning anything.
    }
    public static void subtract(int a, int b){  //subtraction method with no return and two parameters
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a-b)); //printing output of subtraction of two numbers
    }
    public static void mult(int a, int b){ //multiplication method that accepts two parameters and returns nothing
        System.out.println("Multiplication of " + a + " and " + b + " is: " + a*b); //prints the output of multiplication of two numbers
    }
    public static void divide(int a,int b){ //division method that accepts two parameters and returns nothing
        System.out.println("Division of " + a + " by " + b  + " is: " + a/b); //printing output of division of two numbers
    }
    public static void main(String[] args){ //main class
        System.out.println("My Calculator");    //printing class header
        add ( a, 10);   //calling addition method by sending two parameters, 1st is static variable and second local
        subtract(a,15); //calling subtraction method
        mult(a,5);  //calling multiplication method
        divide(a,5);    //calling  division method
    }

}
