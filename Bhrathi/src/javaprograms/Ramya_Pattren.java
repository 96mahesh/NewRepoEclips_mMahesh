package javaprograms;

public class Ramya_Pattren {
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=60;j++) {
			if(j==1||(i==1||i==4)&&j<5||j==5&&i>1&&i<4||j==i-3)
			System.out.print("* ");
			else if((i==1||i==4)&&j>7&&j<11||(j==7||j==11)&&i>1)
				System.out.print("* ");	
			else if(j==13||j==19||(j==i+12||j==20-i)&&i<5)
				System.out.print("* ");	
			else if((j==i+20||j==28-i)&&i<5||j==24&&i>4)
				System.out.print("* ");	
			else if((i==1||i==4)&&j>29&&j<33||(j==29||j==33)&&i>1)
				System.out.print("* ");	
			
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
