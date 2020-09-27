package apniKaksha;
import java.util.Scanner;
public class Anagram3 {

	public static void main(String[] args) {
		
	//OPTIMISED CODE FOR Class Anagram2.
		
		Scanner sc= new Scanner(System.in);
		
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		int al[]= new int[256];		//ASCII array
		boolean isAnagram=true;
		
		if(a.length()==b.length()) {	//preliminary check.
			for(char c: a.toCharArray()) {	//iterating through char of 'a'
				int index= (int) c;			//type-casting the char to its ASCII value
				al[index]++;				//counting the repetition of the chosen char within 'a'.
			}
			for(char c: b.toCharArray()) {	//iterating through char of 'b'
				int index= (int) c;			//type-casting the char to its ASCII value
				al[index]--;				/*substracting this repetition from the 
											repetition value generated while iterating within 'a'*/
			}
			for(int i=0;i<256;i++) {		/*iterating through the ASCII array to find all 
											repetitions ultimately turns to zero(0).*/
				if(al[i]!=0) {
					isAnagram=false;
					break;
				}else {
					isAnagram=true;
				}
			}
		}else {
			isAnagram=false;
		}
		
		System.out.println(isAnagram? "Anagram":"Not an Anagram");
	}

}
