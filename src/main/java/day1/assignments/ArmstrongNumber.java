package day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		int i=371;
		
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated=0,reminder,original;
		
		// Assign input into variable original 
		
		original =i;
		// Use loop to calculate: which loop to use until the number greater than 0??
		while(i>0) {
			reminder=i%10;
			i=i/10;
			calculated= calculated+(reminder*reminder*reminder);
		}
		if(calculated==original)
		{
			System.out.println(calculated+"is a armstrong number");
		}
	}
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			
		
		// Check whether calculated and original are same
		
			//When it matches print it as Armstrong number
			
		
		
		
		
		
		
		
		
		
		

	}

