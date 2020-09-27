package apniKaksha;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		boolean isAnagram=false;
		boolean visited[]= new boolean[b.length()];
		
		if(a.length()==b.length()) {			/*Preliminary check*/
			for(int i=0;i<a.length();i++) {		/*iterating through characters of 'a' 
												and selecting char for comparison.*/
				char c=a.charAt(i);
				isAnagram=false;
				for(int j=0; j<b.length();j++) {
					if(b.charAt(j)==c && visited[j]==false) {
					/*comparing chosen char while iterating through 'b' in indices not
					 visited (i.e;already counted once)*/
						isAnagram=true;
						visited[j]=true;	//marking the index as visited.
						break;
					}
				}
				if(isAnagram==false) {
					break;
				}
			}
		}
		System.out.println(isAnagram?"Anagram":"not Anagram");
	
	}

}
