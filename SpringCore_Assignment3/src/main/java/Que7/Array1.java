package Que7;

public class Array1 {
	int arr1[]=new int[7];
	Array2 obj2;
	public Array1(int[] a, Array2 obj2) {
		super();
		this.arr1 = a;
		this.obj2 = obj2;
	}
	public void merge() {
		int c[]= new int[arr1.length+obj2.arr2.length];
		int index=0;
		for(int i=0;i<c.length;i++) {
			if(i<arr1.length)
				c[index++]=arr1[i];
			if(i<obj2.arr2.length)
				c[index++]=obj2.arr2[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<c.length;i++) {
			if(max<c[i])
				max=c[i];	
		}
		for(int i : c) {
			System.out.print(" "+ i);
		}
			System.out.println("\nmaximum = "+max);
	}
}
