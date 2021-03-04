class Outer{
	static int x;
	Outer(int a){
		x = a;
	}
//	class Inner{
	static class Inner{
		static void printer(){
//			Outer o = new Outer(10);
			System.out.println(x);
		}
	}
}

class NestedMain{
	public static void main(String[] args){
//		Outer.Inner oi = new Outer(5).new Inner();
		//Outer.Inner oi = new Outer.Inner();
		Outer.Inner.printer();
//		oi.printer();
	}
}
