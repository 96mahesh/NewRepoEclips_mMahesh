package javaprograms;

public class RepetedCharectores {

	public static void main(String[] args) {

		String name = "ramarao";

		char a[] = name.toCharArray();
		char uniqe[] = new char[a.length], u=0;
		int counter[] = new int[a.length], c=0;
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			//System.out.println(a[i]+" "+count);
			
			if(u==0) {
				uniqe[u++] = a[i];
			    counter[c++]= count;
			}else {
				int find =0;
				for(int k=0;k<u;k++)
					if(uniqe[k]==a[i])
						find++;
				
				if(find==0)
				{
					uniqe[u++] = a[i];
				    counter[c++]= count;
				}
			}
		
		}
		
		for (int i = 0; i<u; i++) {
			if(counter[i]>1)
			System.out.println(uniqe[i]+" "+counter[i]);
		}
		
		

	}
}
