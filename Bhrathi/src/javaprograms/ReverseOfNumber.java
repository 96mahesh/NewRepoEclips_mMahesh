package javaprograms;

public class ReverseOfNumber {
public static void main(String[] args) {

	
	int n = 121;
	final int b=n;
	int rev=0;
	
	while(n>0)
	{
		int rem = n%10;
		rev = rev*10+rem;
		n = n/10;
	}
	System.out.println(rev);
	
	if(b==rev)
		System.out.println("is  palindrome");
	else
	
		System.out.println("is not palindrome");
	
}
}

	
	
	
	
	


