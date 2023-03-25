package mycalculatorpackage;



public class CalculatorSwitchCase {
	
	public double doMath(String Mathoperation, double number1, double number2){
		   switch (Mathoperation)  
		   {
		     case "1":
		     System.out.println("Your answer is " + add(number1, number2));
		     break;

		     case "2":
		     System.out.println("Your answer is " + sub(number1, number2));
		     break;

		     case "3":
		     System.out.println("Your answer is " + div(number1, number2));
		     break;

		     case "4":
		     System.out.println("Your answer is " + mul(number1, number2));
		     break;

		     default:
		     System.out.println("");      
		   }
		return 0;
		 }
		 public double add(double number1, double number2){
		   return number1 + number2;
		 }
		 public double sub(double number1, double number2){
		   return number1 - number2;
		 }
		 public double mul(double number1, double number2){
		   return number1 * number2;
		 }
		 public double div(double number1, double number2){
		   return number1 / number2;
		 }
		}

