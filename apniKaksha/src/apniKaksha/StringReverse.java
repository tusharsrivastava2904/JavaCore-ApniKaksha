package apniKaksha;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String[] arr=s.split(" ",0);
		
		for(int i=arr.length-1;i>=0;i--) {
			String t=arr[i];
			String p=t.trim();
			System.out.print(p+" ");
			
		}
	}

}
