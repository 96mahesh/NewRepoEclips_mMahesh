package javaprograms;

public class Bharathi_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=50;j++)
		{
			if(j==1||(i==1||i==4||i==7)&&j<5||j==5&&i>1&&i<7&&i!=4)
			System.out.print("* ");
			else if(j==7||j==11||i==4&&j>7&&j<11)
				System.out.print("* ");
			else if((j==13||j==17)&&i>1||(i==1||i==4)&&j>13&&j<17)
				System.out.print("* ");
			else if(j==19||(i==1||i==4)&&j>19&&j<23||j==23&&i>1&&i<4||j==i+15&&i>4)
				System.out.print("* ");
			else if((j==25||j==29)&&i>1||(i==1||i==4)&&j>25&&j<29)
				System.out.print("* ");
			else if(i==1&&j>30&&j<36||j==33)
				System.out.print("* ");
			else if(j==37||j==41||i==4&&j>37&&j<41)
				System.out.print("* ");
			else if((i==1||i==7)&&j>42&&j<48||j==45)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
