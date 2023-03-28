package javaprograms;

public class Swathi_Pattren {
public static void main(String[] args) {

	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=40;j++)
		{
			if((i==1||i==4)&&j>1&&j<5||j==1&&i>1&&i<4||j==5&&i>4&&i<7||i==7&&j<5)
				System.out.print("* ");
			else if(j==7||j==13||(j==i+6||j==14-i)&&i>3)
				 System.out.print("* ");
			else if((j==15||j==19)&&i>1||(i==1||i==4)&&j>15&&j<19)
				 System.out.print("* ");
			else if(i==1&&j>20&&j<26||j==23)
				 System.out.print("* ");
			else if(j==27||j==31||i==4&&j>27&&j<31)
				 System.out.print("* ");
			else if(j==35||(i==1||i==7)&&j>32&&j<38)
				 System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
