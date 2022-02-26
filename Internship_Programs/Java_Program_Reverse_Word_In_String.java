package Internship_Programs;

public class Java_Program_Reverse_Word_In_String {
	public void reverse_Word_In_String(String str)
	   {
		
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
}	   
class Main{
public static void main(String[] args) 
{
	   Java_Program_Reverse_Word_In_String obj = new Java_Program_Reverse_Word_In_String();
	obj.reverse_Word_In_String("Welcome ");
	obj.reverse_Word_In_String("Java Program");
}
}

