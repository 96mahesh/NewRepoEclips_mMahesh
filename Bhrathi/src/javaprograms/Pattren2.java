package javaprograms;

public class Pattren2 {
public static void main(String[] args) {
	for(char i = 'A';i<='E';i++)
	{
		for(int s=i;s<='E';s++)
		{
			System.out.print("  ");
		}
		for(char j = 'A';j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
