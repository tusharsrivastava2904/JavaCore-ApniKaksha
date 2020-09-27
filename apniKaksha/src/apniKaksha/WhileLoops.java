package apniKaksha;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			
			int n= sc.nextInt();
			int r=0;
			int temp=n;
			
			while(temp>0) {
				int lastDigit= temp%10;
				r= r*10+lastDigit;
				temp/=10;
			}
			if(n==r) {
				System.out.println("PALLINDROME");
			}
			else {
				System.out.println("NOT A PALLINDROME");
			}
	}
}
