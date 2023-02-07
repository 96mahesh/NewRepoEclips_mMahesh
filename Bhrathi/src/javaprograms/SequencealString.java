package javaprograms;

public class SequencealString {
	public static void main(String[] args) {
		String name = "aabbccabcd";
		char a[] = name.toCharArray();
		int count;
		
		for(int i=0;i<a.length;i=i+count)
		{
			count =1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(a[i]+" "+count);
		}

		/*
		 * for(int i=0;i<name.length();i=i+count) { count =1; for(int
		 * j=i+1;j<name.length();j++) { if(name.charAt(i)==name.charAt(j)) { count++; }
		 * else { break; } } System.out.println(name.charAt(i)+" "+count); }
		 */

	}

}
