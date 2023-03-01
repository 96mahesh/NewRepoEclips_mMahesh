package javaprograms;

import java.util.Scanner;

public class FristCharUppercase {
public static void main(String[] args) {
	String name = "powerStar";
	
	char a[] = name.toCharArray();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter frist Letter");
	String input = scan.next().toUpperCase();
	
	char x = input.charAt(0);
	
	for(int i=0;i<1;i++)
	{
		a[i]=x;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	scan.close();
}
}
