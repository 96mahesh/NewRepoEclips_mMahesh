package javaprograms;

public class Incemental_Decremental {
public static void main(String[] args) {
	
	int a=11,b=22;
	int c= a+b+a++ + b++ + ++a+ ++b;
	
	System.out.println("Value of a :"+a+"\n Value of b :"+b+"\n Value of c :"+c);
}
}
