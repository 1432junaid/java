interface A{
	void a();
}

interface B extends A{
	void b();
}

class demo{
	void printer(){
		System.out.println("this is demo");
	}
}
class MyClass implements A,B extends demo{
	public void a(){
		System.out.println("MyClass a");
	}

	public void b(){
		System.out.println("MyClass b");
	}
}

class Implements{
	public static void main(String[] args){
		MyClass obj = new MyClass();
		obj.a();
		obj.b();
		obj.printer();
	}
}
