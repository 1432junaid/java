class staticMain{
	public static void main(String[] args){
		System.out.println("main method");
		StaticDemo sd = new StaticDemo();
	}
}

class StaticDemo{
	static{
		System.out.println("Static Block");
	}
}
