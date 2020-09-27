package apniKaksha;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int total=0;
		
		System.out.println("Enter the number of students: ");
		int n= sc.nextInt();
		int[] mks= new int[n];
		
		for (int i=0; i<n; i++) {
			mks[i] =sc.nextInt();
			System.out.println();
		}
		
		for(int j=0;j<n;j++) {
			total+=mks[j];
		}
		int avg= total/n;
		System.out.println(avg);
	}

}
