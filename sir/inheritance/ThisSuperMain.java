class Parent{
	void printer(){
		System.out.println("parnet");
	}
/*	void caller(){
		this.printer();
	}
*/
}
class Child extends Parent{
	void print(){
		System.out.println("Printe of Child");
		super.printer();
	}
}


class thisMain{
	public static void main(String[] args){
		Child c = new Child();
		c.printer();
	}
}
