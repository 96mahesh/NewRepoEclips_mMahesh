package javaprograms;

public class Pspk_pATTREN {
public static void main(String[] args) {

	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<25;j++)
		{
			if(j==1&&i>1||((i==1||i==4)&&j<5&&j>1)||j==5&&i<4&&i>1)
			System.err.print("* ");
			else if(((i==1||i==5)&&j<11&&j>7)||j==7&&i<5&&i>1||(j==11&&i>5&&i<9)||(i==9&&j>7&&j<11))
				System.err.print("* ");	
			else if(j==13&&i>1||((i==1||i==4)&&j<17&&j>13)||j==17&&i<4&&i>1)
				System.err.print("* ");
			else if(j==19||(j==25-i&&i<6)||j==i+15&&i>4)
				System.err.print("* ");
			else
				System.err.print("  ");
		}
		System.err.println();
	}
}
}
