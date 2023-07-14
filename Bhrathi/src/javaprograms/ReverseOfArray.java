package javaprograms;

public class ReverseOfArray {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50};
	
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	System.out.println("\n=======================>");
	ResvrseOfArrayList.main();
	System.out.println("\n=========================>");
	ReverseOfMiddleOfArray.main1();
	System.out.println("\n==========================>");
	ReverseOfMiddleOfArray2ndWAy.main2();
	System.out.println("\n==========================>");
	ReverseOfMiddleOfArray1.main3();
}
}
class ResvrseOfArrayList{
	public static void main() {
		int a[] = {10,20,30,40,50};
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
class ReverseOfMiddleOfArray{
	public static void main1() {
		int a[] = {10,20,30,40,50};
		
		for(int i=a.length/2,j=a.length-1;i<j;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

class ReverseOfMiddleOfArray2ndWAy{
	public static void main2() {
		int a[] = {10,20,30,40,50};
		
		for(int i=0,j=a.length-3;i<a.length/2;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

class ReverseOfMiddleOfArray1{
	public static void main3() {
		int a[] = {10,20,30,40,50};
		
		for(int i=0,j=a.length/2-1;i<j;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}


