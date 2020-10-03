package oops;

import java.util.Scanner;

public class SentenceReversalWordByWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the sentence to be reversed: ");
		
		//Taking the input sentence
		String s = sc.nextLine(); 
		
		reverseWords(s);
		
	}
	
	//method to reverse a sentence word by word
	static void reverseWords(String s) {
		
		int i = s.length() - 1;		//initial pointing variable
		String ans = "";
		
		while (i>=0) {
			//ignoring the trailing space from the end of sentence
			while (i>=0 && s.charAt(i) == ' ') i--;			
			
			int j = i;		//end pointing variable
			
			//avoiding adding an extra space to the ans var when there are leading spaces in the sentence
			if (i<0) break;
			
			//selecting the words until we encounter a white space
			while (i>=0 && s.charAt(i) != ' ') i--;
			
			if (ans.isEmpty()) {
				ans =  ans.concat(s.substring(i+1,j+1));
			} else {
				ans = ans.concat(' ' + s.substring(i+1,j+1));
			}
			
		}
		
		System.out.println("Reversed sentence is: ");
		System.out.println(ans);
		
	}

}
