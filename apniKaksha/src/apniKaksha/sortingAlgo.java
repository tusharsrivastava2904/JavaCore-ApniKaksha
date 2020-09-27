package apniKaksha;
import java.util.Scanner;
public class sortingAlgo {

	public static void main(String[] args) {
		
//Code for taking an array from user and sort it.
		
//		******BUBBLE SORT******
//		
//		******non-optimised basic algorithm flow******
//		
//		
//		Scanner sc= new Scanner(System.in);
//		
//		//array size 
//		System.out.println("Enter the size of list:");
//		int k=  sc.nextInt();
//		int a[]= new int[k];
//	
//		int n= a.length;
//		
//		//taking array from user
//		System.out.println("Enter the list of numbers to be sorted:");
//		for(int m=0;m<n;m++) {
//			a[m]=sc.nextInt();
//		}
//		
//		//sorting
//		for (int i=0;i<n-1;i++) {
//			for(int j=0;j<n-1;j++) {
//				if(a[j+1]<a[j]){
//					int temp =a[j];			//swapping using a temporary variable
//					a[j]= a[j+1];
//					a[j+1]= temp;
//				}
//			}
//		}
//		
//		//***using For-Each loop***
//		for (int item: a) {
//			System.out.print(item+"  ");	//printing the sorted array using For Each loop
//		}
//
//		
//		******using Opptimised conditions for bubble sort******
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter the size of the list to be sorted:");
//		int n= sc.nextInt();				//taking the size of the array
//		
//		int a[]=new int[n];
//		int l= a.length;
//		
//		System.out.println("Enter the values to be sorted:");
//		for(int i=0;i<l;i++) {
//				a[i]= sc.nextInt();			//taking values for the array
//		}
//		
//		boolean sorted= true;				//declaration of boolean condition
//		for(int i=0;i<l-1;i++) {			 
//			for(int j=0;j<l-1-i;j++) {		/*optimisation1: limiting condition reduced by 1
//															 each time to avoid itterating
//															 for numbers already sorted to
//															 the right-most array indices*/
//				if(a[j+1]<a[j]) {
//					int temp=a[j+1];		//swapping using a temporary variable
//					a[j+1]=a[j];
//					a[j]=temp;
//					sorted= false;			/*if swapping is performed even once the
//											  condition becomes false, and the outer loop
//											  is executed again*/
//				}
//			}
//		if(sorted) break;					/*optimisation2: if swapping is not performed
//		 													 for at least 1 time by the 
//		 													 inner-for loop; the outer loop
//		 													 terminates.*/
//		}
//		
//		System.out.println("Sorted array is:");
//		for(int item: a) {
//			System.out.print(item+"  ");	//printing the values of the sorted list.
//		}
//		
//		
//		******SELECTION SORT******
//		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int m= sc.nextInt();
		
		int a[]= new int[m];
		int n=a.length;
		
		System.out.println("Enter the values to be sorted using Selection Sort:");
		for(int i=0;i<=m-1;i++) {
			a[i]= sc.nextInt();					//Taking-in values.
		}
		
		for(int i=0;i<n-1;i++) {
			int minInd=i;						//minimum index value temporarily set to i.
			for(int j=i;j<n;j++) {				/*inner loop starts from the position of 
												outer loop (consider a pattern for 
												reference).*/
				if(a[j]<a[minInd]) {
					minInd=j;					/*This way we store the minimum value's
												index*/
				}
			int temp=a[i];						/* swapping minimum index to the left.*/
			a[i]=a[minInd];
			a[minInd]=temp;
			}
		}
		
		for(int item : a){
			System.out.print(item+"  ");		/*Printing out the sorted array.*/
		}
	}
}
