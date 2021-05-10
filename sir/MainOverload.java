class MainOverload{
/*	static int  main(int x){
		if(x == 1) return 1;
		return x + main();
	}
*/
	int sum(int x){
		if(x == 1) return 1;
		return x+sum(x-1);
	}

	void table(int n, int c){
		if(c == 1) {
			System.out.println(n);
			return ;
		}
		table(n,c-1);
		System.out.println( n * c);
	}
	int pow(int n, int c){
		if(c == 1) return n;
		return pow(n*n,c-1);
	}

	int fib(int n){
		if(n == 1 || n == 2) return 1;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args){
		MainOverload m = new MainOverload();
//		m.table(2,10);
		System.out.println(m.pow(2,2));
	}
}
