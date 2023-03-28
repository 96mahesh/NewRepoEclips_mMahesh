package javaprograms;

public class V_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=14;j++)
		{
			if(j==i||j==14-i)
			System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();
	}
}
}
