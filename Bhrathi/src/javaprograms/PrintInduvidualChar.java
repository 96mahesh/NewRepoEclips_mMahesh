package javaprograms;

public class PrintInduvidualChar {
public static void main(String[] args) {
	
	String name = "mahesh@#$%123";
	char a[] = name.toCharArray();
	
	char unique[] = new char[a.length], u=0;
	char num [] = new char[a.length], n=0;
	char splchar[] =new char[a.length],s=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>='a'&& a[i]<='z')
		{
			unique[u++] = a[i];
		}else if(a[i]>='0' && a[i]<='9') {
			num[n++] = a[i];
		}else {
			splchar[s++] = a[i];
		}
	}
	
	for(int i=0;i<u;i++)
	{
		System.out.print(unique[i]);
	}
	System.out.println("\n");
	for(int i=0;i<n;i++)
	{
		System.out.print(num[i]);
	}
	System.out.println("\n");
	for(int i=0;i<s;i++)
	{
		System.out.print(splchar[i]);
	}
	
}
}
