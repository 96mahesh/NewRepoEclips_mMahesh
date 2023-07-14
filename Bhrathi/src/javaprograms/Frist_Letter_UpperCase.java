package javaprograms;

public class Frist_Letter_UpperCase {
public static void main(String[] args) {
	
	String name = "mahesh babu";
	char a[] = name.toCharArray();
	char uni[] = new char[a.length],u=0;
	
	for(int i=0;i<a.length;i++) {
		if(u==0) {
			char x = a[i];
			String y = String.valueOf(x).toUpperCase();
			x=y.charAt(0);
			uni[u++]=x;
		}
		
		else {
			uni[u++] = a[i];
			if(a[i]==' ') {
				uni[u++] = a[i];
				break;
			}
		}
	}
	for(int i=0;i<u;i++) {
		System.out.println(uni[i]);
	}
}
}
