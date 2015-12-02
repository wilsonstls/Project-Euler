package Euler;


/*  
  * Solution to Project Euler problem 1 
  *  
  * Multiples of 3 and 5
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  * Find the sum of all the multiples of 3 or 5 below 1000.
  * sum should be 233168
  *
  * Date: 12/01/2015
  * By:   KW
  *
  */   
 
public class p001 { 
 	 
 	public static void main(String[] args) { 
                System.out.println("If we list all the natural numbers below 10 that are multiples of 3 or 5; we get 3, 5, 6 and 9 ");
                System.out.println("The sum of these multiples is 23");
                
 		int sum = 0; 
 		for (int i = 0; i < 1000; i++) { 
 			if (i % 3 == 0 || i % 5 == 0) 
 			sum = (sum+i); 
 		} 

                System.out.println("And if we do the same for multiples below 1000 the sum would be:  "  +sum);
               
 	} 
 	 
} 
