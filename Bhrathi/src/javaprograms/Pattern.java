package javaprograms;

public class Pattern {

	public static void main(String[] args) {
	for(char i='A'; i<='E';i++)
	{
		for(char j='A'; j<=i; j++)
		{
			if(i%2==0)
			{
				System.out.print((int)j+" ");
			}
			else
			{
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
	}
}
