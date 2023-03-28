package javaprograms;

public class Somesh_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=38;j++)
		{
			if((i==1||i==4)&&j>1&&j<5||j==1&&i>1&&i<4||j==5&&i>4&&i<7||i==7&&j<5)
			System.out.print("* ");
			else if((j==7||j==11)&&i>1&&i<7||(i==1||i==7)&&j<11&&j>7)		
				System.out.print("* ");
			else if(j==13||j==19||(j==i+12||j==20-i)&&i<5)
				System.out.print("* ");
			else if(j==21||(i==1||i==4||i==7)&&j>21&&j<26)
				System.out.print("* ");
			else if((i==1||i==4)&&j>27&&j<31||j==27&&i<4&&i>1||j==31&&i>4&&i<7||i==7&&j>26&&j<31)
				System.out.print("* ");
			else if(j==33||j==37||i==4&&j>33&&j<37)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
	System.out.println("\n ");
	
	 for(int i=1;i<=7;i++)
	 {
		 for(int j=1;j<=35;j++)
		 {
			 if(j==7||j==13||(j==i+6||j==14-i)&&i>3)
			 System.out.print("* ");
			 else if(j==15||(i==1||i==4||i==7)&&j>15&&j<20)
				 System.out.print("* ");
			 else if(j==21||(i==1||i==7)&&j>21&&j<25||j==25&&i>1&&i<7)
				 System.out.print("* ");
			 else if(j==27&&i>1&&i<4||(i==1||i==4)&&j>27&&j<31||j==31&&i>4&&i<7||i==7&&j>26&&j<31)
				 System.out.print("* ");
			 else
				 System.out.print("  ");
		 }
		 System.out.println();
	 }
	 
	 
	 System.out.println("\n ");
		
	 for(int i=1;i<=7;i++)
	 {
		 for(int j=1;j<=50;j++)
		 {
			 if((j==1||j==5)&&i>1||(i==1||i==4)&&j<5&&j>1)
		       System.out.print("* ");
			 else if(j==7||j==13||j==i+6)
				 System.out.print("* ");
			 else if((j==15||j==19)&&i<7||i==7&&j>15&&j<19)
				 System.out.print("* ");
			 else if(j==21||(i==1||i==4)&&j>21&&j<25||j==25&&i>1&&i<4)
				 System.out.print("* ");
			 else if((j==27||j==31)&&i>1||(i==1||i==4)&&j>27&&j<31)
				 System.out.print("* ");
			 else if(j==33||j==39||(j==i+32||j==40-i)&&i<5)
				 System.out.print("* ");
			 else if((j==41||j==45)&&i>1||(i==1||i==4)&&j>41&&j<45)
				 System.out.print("* ");
			 else
				 System.out.print("  ");
		 }
		 System.out.println();
	 }
}
}
