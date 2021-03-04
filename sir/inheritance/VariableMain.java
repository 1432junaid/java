class Parent{
	int x;
	int y;
	Parent(int a, int b){
		x = a;
		y = b;
	}
}

class Child extends Parent{
	int x;
	int z;
	Child(int a, int b, int c, int d){
		super(a,b);
		x = c;
		z = d;
	}
}

class VariableMain{
	public static void main(String[] agrs){
		Parent c = new Child(10,20,30,40);
//		Child c = new Child(10,20,30,40);		//check out difference clear the the variable hiding concept
		System.out.println(c.x+" "+c.y+" ");
	}
}
