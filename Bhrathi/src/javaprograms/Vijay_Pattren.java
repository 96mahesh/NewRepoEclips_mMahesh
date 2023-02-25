package javaprograms;

public class Vijay_Pattren {
public static void main(String[] args) {
	int k=1,l=13;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=65;j++)
		{
			if(j==k||j==l) 
			System.out.print("*");
			else if((i==1||i==7)&&j<21&&j>15||j==20)
				System.out.print("* ");
			else if(j==28)
				System.out.print("* ");
			else 	
				System.out .print(" ");
			
}
		System.out.println();
		k++;l--;
	
}
}
}