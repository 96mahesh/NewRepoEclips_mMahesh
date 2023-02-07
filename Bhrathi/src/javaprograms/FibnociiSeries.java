package javaprograms;

public class FibnociiSeries {

	public static void main(String[] args) {
		
		/*
		 * int max = 10;
		 * 
		 * int a = 0, b = 1,c; System.out.println(a+" "+b+" "); do { c=a+b; if(max<c) {
		 * //System.out.println(c);
		 * 
		 * } a=b; b=c;
		 * 
		 * System.out.println(b); } while(max>c);
		 */
		
		int max = 47;
		int a=0,b=1,c;
		int count =0;
		//System.out.println(a+" "+b+" ");
		for(int i=2;i<max;i++)
		{
			c = a+b;
			
			
			a=b;
			b=c;
			if(c>=200&&c<=500)
			{
				count++;
				System.out.println(c);
			}
			
		}

		//System.out.println(b);
				
				
	}
}
