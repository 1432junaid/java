class myclass{
	static int age;
	String name;
	myclass(int a, String b){
		age = a;
		name = b;
	}
	public static void main(String[] argc){
		myclass m = new myclass(20, "Mujeeb");
//		System.out.println(m.age);
//		System.out.println(myclass.age);
//		System.out.println(m.name);
//		myclass m2 = new myclass(30,"jd");
//		System.out.println(myclass.age);
//		System.out.println(age);
//		byte b = 20;
//		short s = 20;
//		byte a = s;
		char a = '\u0041';
		System.out.println(a);
	}
}
