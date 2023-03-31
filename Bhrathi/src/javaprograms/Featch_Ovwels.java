package javaprograms;

public class Featch_Ovwels {
public static void main(String[] args) {
	
	String name = "A common quations that I've seen people asking";
	String str = new String(name);
    str = str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				
		{
			System.out.println("Giving Array "+str.charAt(i)+" at in said index count"+i);
		}
	}
}
}
