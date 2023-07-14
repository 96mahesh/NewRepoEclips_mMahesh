package javaprograms;

public class String_Frist_Letter_UpperCase {
public static void main(String[] args) {
	String name = "dinesh reddy parapati";
	String a[] = name.split(" ");
	String n = " ";
	for (String x : a) {
		String frist = x.substring(0, 1);
		String secound = x.substring(1);
		n+=frist.toUpperCase()+secound+" ";
		
	}
	System.out.println(n);
}
}
