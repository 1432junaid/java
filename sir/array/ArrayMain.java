class ArrayDemo{
	void arrayPrinter(int[] a){
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
}

class ArrayMain{
	public static void main(String[] args){
		ArrayDemo ad = new ArrayDemo();
		int[] arr = {2,3,4,5,6};
		ad.arrayPrinter(arr);
	}
}
