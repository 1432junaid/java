abstract class AbstractDemoTest{
	public final int NUM = 10;
	AbstractDemoTest(){
		System.out.println("Abstract constructor");
	}
	void printer(){
		System.out.println("this is Abstract Printer");
	}
}

class test extends AbstractDemoTest{
	test(){
		System.out.println("test constructor");
	}
	void printer(){
		System.out.println("this is test Printer");
	}
	System.out.println(super.NUM);
	int x = super.NUM;
//	super();
}

class AbstractMainTest{
	AbstractMainTest(){
		System.out.println("AbstractMainTest constuctor");
	}
	public static void main(String[] args){
//		AbstractDemoTest a = new AbstractDemoTest();		//exp1
//		AbstractDemoTest a = new test();			//exp2
		test a = new test();					//exp3
		a.printer();
	}
}
