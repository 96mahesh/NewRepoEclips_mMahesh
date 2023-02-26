package javaprograms;

public class Tirupathi_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=65;j++)
		{
			if(i==1&&j<6||j==3||(i==1||i==7)&&j<12&&j>6||j==9)
			System.out.print("* ");
			else if(j==13||(i==1||i==4)&&j<17&&j>13||j==17&&i<4&&i>1||j==9+i&&i>4||(j==19||j==23)&&i<7||i==7&&j>19&&j<23)
				System.out.print("* ");
			else if(j==25||(i==1||i==4)&&j>25&&j<29||j==29&&i<4&&i>1)
				System.out.print("* ");
			else if((j==31||j==35)&&i>1||(i==1||i==4)&&j>31&&j<35)
				System.out.print("* ");
			else if(i==1&&j>36&&j<42||j==39||j==43||j==47||i==4&&j>43&&j<47||(i==1||i==7)&&j<54&&j>48||j==51)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
