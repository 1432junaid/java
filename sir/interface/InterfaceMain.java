interface MyInterface{
//	public static final int x  = 10;
	int x = 10;		//in interface this line is : public static final int x = 10
	abstract void printer();
}

class InterfaceDemo implements MyInterface{
//	void printer(){		//error : package id default and interface id public so we can't
				//reduce scope in java
	public void printer(){	//this prove the upper method is public
		System.out.println("Printer Method");
	}
}

class InterfaceMain{
	public static void main(String[] args){
		System.out.println(MyInterface.x);	//this is static so we can call by the name of class as well as interface
		System.out.println(InterfaceDemo.x);
		InterfaceDemo id = new InterfaceDemo();
//		id.printer();
	}
}
