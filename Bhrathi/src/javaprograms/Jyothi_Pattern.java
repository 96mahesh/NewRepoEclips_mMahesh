package javaprograms;

public class Jyothi_Pattern {
public static void main(String[] args) {
	
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=65;j++) {
			if(j==1&&i<7&&i>4||i==7&&j>1&&j<5||j==5&&i<7||i==1&&j<8&&j>2)
			System.out.print("* ");
			else if((j==8+i||j==16-i)&&i<5||j==12&&i>3)
				System.out.print("* ");
			else if((j==17||j==22)&&i>1&&i<7||(i==1||i==7)&&j>17&&j<22)
				System.out.print("* ");
			else if(i==1&&j>23&&j<29||j==26)
				System.out.print("* ");
			else if(j==30||j==34||i==4&&j>30&&j<34)
				System.out.print("* ");
			else if((i==1||i==7)&&j>35&&j<41||j==38)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
