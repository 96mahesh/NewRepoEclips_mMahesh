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
	System.out.println("Before Assinding Order");
	for (int i : a) {
		System.out.println(i);
	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;i<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
			}
		}
		
	}
	
	System.out.println("After Assinding Order");
	for (int i : a) {
	System.out.println(i);	
	}
	scan.close();
}
	
	
}
