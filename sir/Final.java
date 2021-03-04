final class Parent{
	public final void p(){
		System.out.println("P - method");
	}
}

class Child extends Parent{
	public void p1(){
		System.out.println("P- child");
	}
}

class Final{
	public static void main(String[] args){
		Child c = new Child();
		c.p();
	}
}
