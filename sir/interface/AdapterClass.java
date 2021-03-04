public interface MyInterface{
	void p1();
	void p2();
	void p3();
}

class MyClass implements MyInterface{
	public void p1(){
		System.out.println("this is p1");
	}
}

class AdapterClass{
	public static void main(String[] args){
		MyClass m1 = new MyClass();
		m1.p1();
	}
}
