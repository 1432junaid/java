class NonStaticDemo{
	NonStaticDemo(){
		System.out.println("constructor call");
	}
	{
		System.out.println("non static Demo");
	}
	static {
		System.out.println("Static block");
	}
}

class NonStaticMain{
	public static void main(String[] args){
		NonStaticDemo nd1 = new NonStaticDemo();
		NonStaticDemo nd2 = new NonStaticDemo();
	}
}

