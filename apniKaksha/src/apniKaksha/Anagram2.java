package apniKaksha;
import java.util.Scanner;
public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		boolean isAnagram=true;
		int al[]= new int[256];				//array for ASCII values of all char in 'a'.
		int bl[]= new int[256];				//array for ASCII values of all char in 'b'.
		
		if(a.length()==b.length()) {		//preliminary check.
			for (char c: a.toCharArray()) {	//iterating through char of 'a' to select char.
				int index= (int)c;			//type-casting the chosen char to int to get ASCII. 
				al[index]++;				//counting the repetition.
			}
			for (char c: b.toCharArray()) {	//iterating through char of 'b' to select char.
				int index= (int)c;			//type-casting the chosen char to int to get ASCII.
				bl[index]++;				//counting the repetition.
			}
			for (int i=0;i<256;i++) {		//iterating through the two ASCII arrays, 'al' and 'bl'
				if (al[i]!=bl[i]) {			//comparing the no. of repetition of char.
					isAnagram=false;		//if a single repetition value does't match--break.
					break;
				}
			}
		}else {
			isAnagram= false;
		}
		
		System.out.println(isAnagram? "Anagram": "Not Anagram");
	}

}
