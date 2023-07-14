package javaprograms;

public class String_Frist_And_Last_Letter_Uppercase {
public static void main(String[] args) {
	
	String name = "mahesh babu rampatruni";
	String a[] = name.split(" ");
	String n = " ";
	for (String x : a) {
		String frist = x.substring(0, 1);
		String secound = x.substring(1, x.length()-1);
		String last = x.substring(x.length()-1);
		
		n+= frist.toUpperCase()+secound+last.toUpperCase()+" ";
	}
	System.out.println(n);
}
}
