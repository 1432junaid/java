abstract class AbstractDemoTest{
	void printer(){
		System.out.println("this is Abstract Printer");
	}
}

class AbstractMainTest{
	public static void main(String[] args){
		AbstractDemoTest a = new AbstractDemoTest();
		a.printer();
	}
}
