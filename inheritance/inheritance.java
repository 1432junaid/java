class parent{
	void display1(){
		System.out.println("this is parent class");
	}
}
class child1 extends parent{
	void display2(){
		System.out.println("this is child 1 class");
	}
}
class child2 extends parent{
	void display3(){
		System.out.println("this is child 2 class");
	}
}
class grand_child extends child2{
	void display4(){
		System.out.println("this is grand child class");
	}
}
class inheritance{
	public static void main(String args[]){
		grand_child obj = new grand_child();
		obj.display1();
	}
}
