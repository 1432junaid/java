class Argument{
	void printer(int a, int... x){
		System.out.println(a);
			for(int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
}
class demo extends Argument{
	public static void main(String... args){
		//System.out.println(args.length);
//		for(int i = 0; i<args.length; i++){
//			System.out.println(args[i]);
//		}
		Argument a = new Argument();
		a.printer(10,3,4,5,6);
	}
}
