package javaprograms;

public class Samreen_Pattren_Teacher {
public static void main(String[] args) {

	for(int i=1;i<=7;i++)
	{
		
		for(int j=1;j<=48;j++)
		{
			if((i==1||i==4)&&j<5&&j>1||j==1&&i<4&&i>1||j==5&&i>4&&i<7||i==7&&j<5)
			System.out.print("* ");
			else if((j==7||j==11)&&i>1||(i==1||i==4)&&j<11&&j>7)
				System.out.print("* ");
			else if(j==13||j==19||j==20-i&&i<5||j==12+i&&i<5)
				System.out.print("* ");
			else if(j==21||j==25&&i<4&&i>1||(i==1||i==4)&&j<25&&j>20||j==18+i&&i>3)
				System.out.print("* ");
			else if(j==27||(i==1||i==4||i==7)&&j>26&&j<32)
				System.out.print("* ");
			else if(j==33||(i==1||i==4||i==7)&&j>32&&j<38)
				System.out.print("* ");
			else if(j==39||j==45||j==38+i)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
