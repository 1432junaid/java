class MyClass{
	private MyClass(){}
	int x;
	void printer(){
		System.out.println("Hello");
	}
	static MyClass m = null;
	synchronized public static MyClass factory(){		//this is called factory method
		if(m == null){					//and if we use if then it is a singleton pattrn
			m = new MyClass();
		}
		return m;
	}
}


class Factory{
	public static void main(String[] args){
		MyClass m1 = MyClass.factory();
		m1.printer();
		m1.x = 20;
		MyClass m2 = MyClass.factory();
		System.out.println(m1.x);
		System.out.println(m2.x);
	}
}
