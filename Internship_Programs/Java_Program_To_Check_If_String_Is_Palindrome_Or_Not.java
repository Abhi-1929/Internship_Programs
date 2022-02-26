package Internship_Programs;
import java.util.*;
public class Java_Program_To_Check_If_String_Is_Palindrome_Or_Not {
	public static void main(String args[]) {
	 String str, rev = "";
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a string to Check Palindrome or Not:");
     str = sc.nextLine();

     int length = str.length();

     for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);

     if (str.equals(rev))
        System.out.println(str+" is a palindrome");
     else
        System.out.println(str+" is not a palindrome");
}
}
