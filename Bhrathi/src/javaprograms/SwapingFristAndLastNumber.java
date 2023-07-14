package javaprograms;

import java.util.Arrays;

public class SwapingFristAndLastNumber {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50};
	System.out.println("Before swaping String : "+Arrays.toString(a));
	int b =a[0];
	    a[0]=a[a.length-1];
	    a[a.length-1]=b;
	    System.out.println("After  swaping String : "+Arrays.toString(a));
	    
	    SwapingString.main();
	    
}
}

class SwapingString{
	public static void main() {
		
		String name = "mahesh";
		char a[] = name.toCharArray();
		System.out.println("Before swaping String : "+Arrays.toString(a));
		char b = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = b;
		System.out.println("After  swaping String : "+Arrays.toString(a));
	}
}