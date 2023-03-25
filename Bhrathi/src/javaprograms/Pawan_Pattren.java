package javaprograms;

public class Pawan_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=75;j++)
		{
			if(j==1||(i==1||i==4)&&j<5||j==5&&i>1&&i<4) 
			System.out.print("* ");
			else if((j==7||j==11)&&i>1||(i==1||i==4)&&j<11&&j>7) 				
				System.out.print("* ");
			else if(j==13||j==19||(j==i+12||j==20-i)&&i>3)
				System.out.print("* ");
			else if((j==21||j==25)&&i>1||(i==1||i==4)&&j>21&&j<25)
				System.out.print("* ");
			else if(j==27||j==33||j==i+26)
				System.out.print("* ");
			else if(j==37||j==i+34&&i>3||j==42-i&&i<4)
				System.out.print("* ");
			else if((j==43||j==47)&&i>1||(i==1||i==4)&&j>43&&j<47)
				System.out.print("* ");
			else if(j==49||i==7&&j>48&&j<54)
				System.out.print("* ");
			else if((j==i+53||j==61-i)&&i<5||j==57&&i>3)
				System.out.print("* ");
			else if((j==62||j==66)&&i>1||(i==1||i==4)&&j>62&&j<66)
				System.out.print("* ");
			else if(j==68||j==74||j==i+67)
				System.out.print("* ");
			else
			{
				System.out.print("  ");	
			}
		}
		
		System.out.println();
	}
}
}
