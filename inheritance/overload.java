class overload1{
	void fun(){
		System.out.println("this is without argument");
	}
	void fun(int x){
		System.out.println("this is with one  argument");
	}
	void fun(int x,double y){
		System.out.println("this is with two arguments");
	}
	void fun(double x,int y){
		System.out.println("this is with two arguments but order is changed");
	}
}
class overload{
	public static void main(String[] args){
		overload1 b = new overload1();
		b.fun();
		b.fun(12);
		b.fun(12,2.3);
		b.fun(3.4,12);
	}
}
