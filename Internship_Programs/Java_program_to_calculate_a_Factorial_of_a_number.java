package Internship_Programs;
import java.util.*;
public class Java_program_to_calculate_a_Factorial_of_a_number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum =1;
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			sum = sum*i;
			
		}
		System.out.println("Factorial is = "+sum);
		
	}

}
