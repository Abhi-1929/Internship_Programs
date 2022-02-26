package Internship_Programs;
import java.util.*;
public class Java_program_to_calculate_Fibonacci_Series_up_to_n_numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upto how Much Number You Want Print Fibonacci Series =");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 1 ; i<n ; i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
