class OverloadingDemo{
	int x ,y, z;
	OverloadingDemo(){}
	OverloadingDemo(int x){
		this.x = x;
	}
	OverloadingDemo(int x, int y){
//		this.x = x;
		this(x);		//it can be used for constructor calling
		this.y = y;
	}
	OverloadingDemo(int x, int y, int z){
//		this.x = x;
//		this.y = y;
		this(x,y);
		this.z = z;
	}
}

class OverloadingMain{
	public static void main(String[] args){
//		OverloadingDemo a;
		OverloadingDemo od = new OverloadingDemo(5,4,3);
		System.out.println(od.x+" "+ od.y +" "+od.z);
		System.out.printf("junaid \n ansari \t %d",od.x);
//		System.out.println(a.x +" "+ "this is a");	//error: variable a.x is not initialized
	}
}
