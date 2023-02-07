package javaprograms;

public class ReverseOfString {
public static void main(String[] args) {
	
	String name = "Automation";
	
	char a[] = name.toCharArray();
	
	for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
	{
		char temp = a[i];
		     a[i] = a[j];
		     a[j] = temp;
		     
		     
		    
	}
	
	
	
	  for (char c : a) {
		  System.out.println(c); 
		  }
	 
}
}
