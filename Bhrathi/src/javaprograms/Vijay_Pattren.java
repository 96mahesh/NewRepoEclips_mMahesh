package javaprograms;

public class Vijay_Pattren {
public static void main(String[] args) {
	
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=15;j++)
		{
			if(j==i||j==14-i)
			System.out.print("*");
			else
			{
				System.out.print(" ");
			}
			
		}
		for(int k=0;k<=12;k++)
		{
			if((i==1||i==7)&&k<5||k==2)
			System.out.print("* ");
			else if(k==10&&i<7||k==6&&i>4&&i<7||i==7&&k>6&&k<10||i==1&&k>7&&k<13)
				System.out.print("* ");
			else
				System.out.print("  ");
				
		}
		for(int s=1;s<=8-i;s++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=8;l++)
		{
			
			if((l==1||l==i)||i==4&&l<4)
				System.out.print("* ");
			
			else
					System.out.print("  ");
		}
		for(int j=1;j<=9;j++)
		{
			if(j==8-i||i==j&&j<5)
			System.out.print("*");
			else
			{
				System.out.print("  ");

			}
		}
		System.out.println();
		
	}
}
}