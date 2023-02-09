package javaprograms;

public class SwapingToStrings {
public static void main(String[] args) {
	String a = "mahesh";
	String b= "Babu";
	System.out.println("Before swaping "+a+" "+b);
	a = a+b;
	b = a.substring(0, a.length()-b.length());
	a = a.substring(b.length());
    System.out.println("After swaping "+a+" "+b);


}
}
