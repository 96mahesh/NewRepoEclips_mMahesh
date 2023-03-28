package javaprograms;

public class Avinash_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if((i==1||i==4)&&j>1&&j<5||(j==1||j==5)&&i>1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		for(int j=1;j<=14;j++){
			if(j==i||j==14-i)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		for(int j=1;j<=35;j++)
		{
			if((i==1||i==7)&&j<6||j==3)
			System.out.print("* ");
			else if(j==7||j==13||j==i+6)
				System.out.print("* ");
			else if((j==14||j==18)&&i>1||(i==1||i==4)&&j>14&&j<18)
				System.out.print("* ");
			else if(j==19&&i>1&&i<4||(i==1||i==4)&&j>19&&j<23||j==23&&i>4&&i<7||i==7&&j>19&&j<23)
				System.out.print("* ");
			else if(j==24||j==28||i==4&&j>24&&j<28)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
