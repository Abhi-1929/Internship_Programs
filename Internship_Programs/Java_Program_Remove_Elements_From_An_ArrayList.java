package Internship_Programs;
import java.util.*;

public class Java_Program_Remove_Elements_From_An_ArrayList {
	 public static void main(String[] args) {  
	       
	      ArrayList<String> arr = new ArrayList<String>(5);  
	       
	      arr.add("Abhishek");  
	      arr.add("Nimish");  
	      arr.add("Varun");  
	      System.out.println("The list of the size is: " + arr.size());    
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }    
	      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());    
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }  
	   }  

}
