package week2;

import java.util.Scanner;   
public class ReverseNumber {
   public static void main(String args[])
   {
      System.out.println("Enter below the number you want to reverse");
      Scanner in = new Scanner(System.in);				 /*to get the value from user*/
      int number;  number = in.nextInt();	   			/*input value is stored in number*/
 
      int length = (int) Math.log10(number)+1;	/*getting the length of the number*/
 
      	 System.out.println("The number you have entered are in Reversed order: ");				   
     for ( int i = length  ; i >0 ; i-- )	/*with the length value the loop execute until the condition satisfied*/
     {
    	 System.out.print("" + number%10); /*% is MOd that will give reminder,One by one the reversed number start printing here*/
    	 number = number/10;
     }
   }
}