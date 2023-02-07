package javaprograms;

public class A_Pattren {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			for(int s=1; s<=10-i; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1||j==i||i==6)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
