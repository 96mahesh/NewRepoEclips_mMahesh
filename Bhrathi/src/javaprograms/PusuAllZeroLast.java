package javaprograms;

import java.util.Scanner;

public class PusuAllZeroLast {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scan.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter Array value");
		
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Before Pushing All Zeros Last");
		for (int i : a) {
			System.out.print(i+" ");
		}
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]==0)
				{
					int temp =a[i];
					    a[i] =a[j];
					    a[j] =temp;
				         j++;
			}
		}
		System.out.println("\n After Pushing all Zeros Last  ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		scan.close();
		
	}


}
