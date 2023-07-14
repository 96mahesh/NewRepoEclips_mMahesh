package javaprograms;

public class Frist_Non_RepetedNumber {
public static void main(String[] args) {
	
	String name = "swiss";
	char a[] = name.toCharArray();
	
	for(int i = 0; i < a.length; i++) {
		int count = 0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
	 if(count==1) {
		 System.out.println(a[i]);
	 break;
	 }
	}
	
	System.out.println("========================================>");
	Frist_Non_RepetedNumber_String.main();
}
}

class Frist_Non_RepetedNumber_String{
	public static void main() {
		
		String a = "swiss";
		for(int i=0;i<a.length();i++) {
			char ch1 = a.charAt(i);
			int count = 0;
			for(int j=0;j<a.length();j++) {
				char ch2 = a.charAt(j);
					if(ch1==ch2) {
						count ++;
					}
			}
			if(count==1)
				System.out.println(ch1);
			
		}
	}
}