package mycalculatorpackage;


import java.util.*;

public class CalculatorSwitchCaseMain {

	private static Scanner userInput;
	private static Scanner reader;

	public static void main(String[] args) {
		
		double num1,num2;
        reader = new Scanner(System.in);
        
		System.out.println("Enter two numbers");
        System.out.print("Enter number 1: ");
        num1 = reader.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = reader.nextDouble();


        userInput = new Scanner(System.in);
        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition, 2. Subtraction, 3. Divison, 4. Multiplication");
        String Mathoperation = userInput.next();
       
        CalculatorSwitchCase c1= new CalculatorSwitchCase();
        
        c1.doMath(Mathoperation, num1, num2);
	}

}
