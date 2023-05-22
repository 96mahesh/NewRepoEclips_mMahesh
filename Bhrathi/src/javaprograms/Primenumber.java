package javaprograms;

public class Primenumber {
public static void main(String[] mahesh) {
	int n=7;
	int count =0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
			count++;
		}
	}
		if(count == 2)
		
			System.out.println("is prime number");
		
		else
		
			System.out.println("is not prime number");
		
	}
}

