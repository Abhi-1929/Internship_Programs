package Internship_Programs;
import java.util.*;
class Operation{
	Scanner sc = new Scanner(System.in);
	double num01 ;
	double num02 ;
	double sum;
	double result;
	public double Addition() {
		sum = num01+num02;
		System.out.println("Addition result is = ");
		return sum;
	}
	public double Substraction() {
		sum = num01-num02;
		System.out.println("Substraction result is = ");
		return sum;
	}
	public double Multiplication() {
		sum = num01*num02;
		System.out.println("Multiplication result is = "+ sum);
		return sum;
	}
	public double Division() {
		sum = num01%num02;
		System.out.println("Division result is = "+ sum);
		return sum;
	}
	public Operation(double a , double b) {
		num01 = a;
		num02 = b;
		System.out.println("Enter The Operation You Want = ");
		char Operator = sc.nextLine().charAt(0);
		switch(Operator) {
		case '+':
			result = Addition();
			System.out.println(result);
			break;
		case '-':
			result = Substraction();
			System.out.println(result);
			break;
		case '*':
			result = Multiplication();
			System.out.println(result);
			break;
		case '%':
			result = Division();
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}
public class Java_program_to_perform_basic_Calculator_operations {
	public static void main(String args[]) {
		Operation op = new Operation(10,20);
	}

}
