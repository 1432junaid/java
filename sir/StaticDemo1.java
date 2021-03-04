class StaticDemo1{
	public static void main(String[] args){
		System.out.println("main method");
		StaticDemo sd = StaticDemo.factory();
		sd.printer();
	}
}

class StaticDemo{
	private StaticDemo(){}
	private static StaticDemo sd;
	static{
		sd = new StaticDemo();
//		System.out.println("Static Block");
	}
	static StaticDemo factory(){
		return sd;
	}
	void printer(){
		System.out.println("Printer");
	}
}
