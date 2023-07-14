package javaprograms;

public class PositionOfindex {
public static void main(String[] args) {
	String a = "i am in ammerpet institue";
	String b = "in";
	
	int frist = a.indexOf(b);
	int secound = a.indexOf(b,frist+1);
	
	System.out.println(frist+" "+secound);
	System.out.println("==================================>");
	positionOfSecoundIndex.main();
	
	System.out.println("=====================================>");
	PositionOfString.main1();
	
	System.out.println("======================================>");
	PositionOfSecoundStringToFristString.PrintIndexValue();
}
}
class positionOfSecoundIndex{
public static void main() {
	String a = "i am in Ameerpet Institue";
	String b = "in";
	
	for(int i=0;i<a.length()-b.length();i++) {
		String x = a.substring(i, i+b.length());
		if(x.equalsIgnoreCase(b)) {
			System.out.println(i);
		}
	}
}	
}

class PositionOfString{
	public static void main1() {
		
		String a = "my name is mahesh babu";
		String b = "m";
		
		for(int i=0;i<a.length()-b.length();i++) {
			if(a.substring(i, i+b.length()).equalsIgnoreCase(b)) {
				System.out.println(i);
			}
		}
	}
}

class PositionOfSecoundStringToFristString{
	public static void printIndex(String a , String b) {
		
		boolean status = false;
		
		for(int i=0;i<a.length()-b.length()+1;i++) {
			if(a.substring(i, i+b.length()).equals(b)) {
				System.out.println(i+" ");
			}
		}
		
		if(status == false)
		System.out.println("None");
		
		
	}
	
	public static void PrintIndexValue() {
		String a = "i am in Ammerpet institue";
		String b = "i";
		printIndex(a,b);
	}
}
