class Outer{
	void p1(){
		class Inner{
			void p2(){
				System.out.println("p2  method");
			}
		}
		Inner i = new Inner();
		i.p2();
	}
}
class NestedMain{
	public static void main(String[] args){
//		Outer.Inner oi = new Outer(5).new Inner();
		//Outer.Inner oi = new Outer.Inner();
//		Outer.Inner.printer();
//		oi.printer();
		Outer o = new Outer();
		o.p1();
	}
}
