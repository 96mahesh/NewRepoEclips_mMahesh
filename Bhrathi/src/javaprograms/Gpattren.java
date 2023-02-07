package javaprograms;

public class Gpattren {
	public static void main(String[] args) {
		
		for(int r=1;r<=9;r++)
		{
			for(int c=1;c<=9;c++)
			{
				if((r==1&&c<=6&&c>1)||(c==1&&r>1&&r<9)||(c==9)&&r>6&&r<=9||(r==6&&c>5&&c<9)||(r==9&&c<=5&&c>1)||c==6&&r>4&&r<9)
				System.out.print("* ");
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(  );
		}
	}

}
