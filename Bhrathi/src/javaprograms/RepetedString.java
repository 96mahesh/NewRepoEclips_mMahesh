package javaprograms;

import java.util.Scanner;

public class RepetedString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size");
		String name = scan.nextLine();
		
		char a[] = name.toCharArray();
		
		char unique[] = new char[a.length],u=0;
		int counter[] = new int[a.length],c=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
			}
			//System.out.println(a[i]+" "+count);
			
			if(u==0)
			{
				unique[u++] = a[i];
				counter[c++] = count;
			}
			else
			{
				int find =0;
				for(int k=0;k<u;k++)
					if(unique[k]==a[i])
						find++;
				if(find==0)
				{
					unique[u++] = a[i];
					counter[c++] = count;
				}
			}
		}
		
		
		System.out.println("After Remoive Duplicates");
		for(int i=0;i<u;i++)
		{
			if(counter[i]>1)
			System.out.println(unique[i]+" "+counter[i]);
		}
			
		
		scan.close();
	}
	
}
