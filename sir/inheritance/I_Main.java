class Parent{
//	int a;
//	Parent(int x){			//error use super
	Parent(){
//		a = x;
		System.out.println("no- argument construtor of Parent");
	}
}
class Child extends Parent{
	Child(){
//		super(5);
		System.out.println("c-child");
//		super(6);
	}
}
class Child1 extends Child{
	Child1(){
		System.out.println("c1 - constructor");
	}
}

class I_Main{
	public static void main(String[] args){
		Child1 c = new Child1();
	}
}
