package Internship_Programs;
import java.util.*;
public class Java_program_to_calculate_Permutation_and_Combination_of_2_numbers {
	static int factor(int number) {  
	      int f = 1;  
	      int j = 1;  
	      while(j <= number) {  
	         f = f * j;  
	         j++;  
	      }  
	      return f;  
	   }  
	   public static void main(String args[]) {  
	         
	      List<Integer> numbers = new ArrayList<Integer>();  
	        
	      numbers.add(14);  
	      numbers.add(10);  
	      numbers.add(9);  
	      numbers.add(6);  
	      numbers.add(5);  
	        
	      int n = numbers.size();  
	      int r = 7;  
	      int result;  
	        
	      result = factor(n) / factor(n-r);  
	      System.out.println("The Permutation Value for the numbers list is: " + result);  
	   }  
}
