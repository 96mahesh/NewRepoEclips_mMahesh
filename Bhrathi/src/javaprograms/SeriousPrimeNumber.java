package javaprograms;

public class SeriousPrimeNumber {

	public static void main(String[] args) {
		
	    int lw =100;
	    int up = 200;
	    int count = 0;
	    for(int i=lw;i<=up;i++)
	    {
	    	int fact = 0;
	    	for(int j=1;j<=i;j++)
	    	{
	    		
	    		if(i%j==0)
	    		{
	    			fact ++;
	    		}
	    		
	    	}
	    	if(fact == 2)
	    	{
	    		count ++;
	    		System.out.println(i);
	    	}
	    	
	    }
	    System.out.println(count);
	    
	}
	
	
		
}
