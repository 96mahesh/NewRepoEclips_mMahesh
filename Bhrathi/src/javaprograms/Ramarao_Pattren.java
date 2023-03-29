package javaprograms;

public class Ramarao_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=45;j++)
		{
			if((i==1||i==4)&&j<5||j==1||j==5&&i>1&&i<4||j==i-3)
			System.out.print("* ");
			else if((j==7||j==11)&&i>1||(i==1||i==4)&&j>7&&j<11)
				System.out.print("* ");
			else if(j==13||j==19||(j==12+i||j==20-i)&&i<5)
				System.out.print("* ");
			else if((j==21||j==25)&&i>1||(i==1||i==4)&&j>21&&j<25)
				System.out.print("* ");
			else if(j==27||(i==1||i==4)&&j>27&&j<31||j==31&&i>1&&i<4||j==i+23&&i>3)
				System.out.print("* ");
			else if((j==33||j==37)&&i>1||(i==1||i==4)&&j>33&&j<37)
				System.out.print("* ");
			else if((j==38||j==42)&&i>1&&i<7||(i==1||i==7)&&j>38&&j<42)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
