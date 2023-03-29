package javaprograms;

public class LovePattren2 {
public static void main(String[] args) {
 for(int i=1;i<=15;i++)
 {
	 for(int j=1;j<=15;j++)
	 {
	if(i==3&&j>3&&j<11&&j!=7||i==4&&j==3||i==4&&j==7||i==4&&j==11)
		 System.out.print("❤️");
	else if(i==5&&j==3||i==5&&j==11||i==6&&j==3||i==6&&j==11||i==7&&j==4||i==7&&j==10)
		 System.out.print("❤️");
	else if(i==8&&j==5||i==8&&j==9||i==9&&j==6||i==9&&j==8||i==10&&j==7)
		 System.out.print("❤️");
	else
		System.out.print("  ");
	 }
	 System.out.println();
 }
	
}
}
