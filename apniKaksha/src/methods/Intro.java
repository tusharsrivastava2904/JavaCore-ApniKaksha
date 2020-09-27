package methods;
import java.util.Scanner;
public class Intro {

	public static void main(String[] args) {
		//code to find the greater number.
		Scanner sc= new Scanner(System.in);
		
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		
		System.out.println(maxOf(no1,no2));
		}
		
	static int maxOf(int a, int b) {
		return a>b? a:b; 
	}
}
