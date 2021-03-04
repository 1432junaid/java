class Parent{
	private void p1(){
		System.out.println("p1");
	}
	public void p2(){
		System.out.println("p2");
	}
}

class Child extends Parent{
//	public void p3(){
	public void p2(){
		System.out.println("p3 - child");
	}
}

class IMain{
	public static void main(String[] args){
		Parent p = new Parent();
		p.p2();
//		Child c = new Child();
		Parent c = new Child();
		c.p2();
//		c.p3();
	}
}
