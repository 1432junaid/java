class super1{
	int x=20;
	void m1(){
		System.out.println("this is super class");
		System.out.println("value of x = "+x);
	}
}
class sub extends super1{
	int x = 30;
	void m1(){
		System.out.println("this is sub class");
		System.out.println("value of x = "+super.x);
		super.m1();
	}
//	super.m1();
}
class overriding{
	public static void main(String args[]){
//		super1 obj = new sub();			//This is called Upcasting
		sub obj = new sub();
		obj.m1();
	}
}
