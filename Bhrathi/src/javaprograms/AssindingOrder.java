package javaprograms;

import java.util.Scanner;

public class AssindingOrder {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = scan.nextInt();
	int a[] = new int[size];
	System.out.println("Enter Array Value");
	for(int i=0;i<a.length;i++)
	{
		a[i] = scan.nextInt();
	}
	System.err.println("Before Assinding Order");
	for (int i : a) {
		System.out.print(i+" ");
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
			}
		}
	}
	
	System.err.println(" \n After Assinding order");
	
	for (int i : a) {
		System.out.print(i+" ");
	}
	
	
}
	
	
}
