package javaprograms;

public class FactoreCount {
public static void main(String[] args) {
	int n =4, f =0;
	
	for(int i=1;i<=n;++i)
	{
		if(n%i==0)
			System.out.println(i);
			f++;
		
	}
	
	System.out.println(f);
}
}
