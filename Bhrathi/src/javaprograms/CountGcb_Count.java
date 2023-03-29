package javaprograms;

public class CountGcb_Count {
public static void main(String[] args) {
	int m = 360 , n = 210 , gcd=0;
	for(int i=1;i<=m&&i<=n;i++)
	{
		if(m%i==0&&n%i==0)
		{
			
			gcd=i;
		}
	}
	System.out.printf("GCD of %d and %d is: %d", m, n, gcd);  
}
}
