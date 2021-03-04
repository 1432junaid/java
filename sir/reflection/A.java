package mypkg;
import java.lang.reflect.*;
class demo{
	public int var1 = 0;
	public int val2 = 2;
	public demo(int x){
		var1 = x;
		System.out.println("am Demo constructor parameter int");
	}
	public demo(){
		System.out.println("am Demo constructor");
	}
	public void printer(String s){
		System.out.println("am Demo printer");
	}
	public static void printer1(int x){
		System.out.println("am Demo printer1");
	}
	public int sum(int x, int y) throws Exception{
                System.out.println("Enter two numbers separated by space");
		return 0;
        }
}

class A {
	public static void main(String[] args){
		demo a  = new demo();
//1
		Class cl = a.getClass();

//2
//		Class cl = demo.class;

//3
//		Class cl = Class.forName("java.lan.String");

		Constructor[] cu = cl.getConstructors();
		Field[] fi = cl.getFields();
		Method[] ma = cl.getDeclaredMethods();
		String[] de;
/*		for(int i = 0 ; i < fi.length; i++){
			System.out.println(fi[i].getName());
		}
		for(int i = 0 ; i < cu.length; i++){
			System.out.println(cu[i].getName());
		}

*/		System.out.println(cl.getName()+"{ ");
		for(int i = 0 ; i < ma.length; i++){
			int mod = ma[i].getModifiers();
//			System.out.println(mod);
//check it		System.out.println(ma[i].toString());
			System.out.print ("\t"+Modifier.toString(mod)+" ");
			System.out.print (ma[i].getReturnType()+" ");
			System.out.print (ma[i].getName());
			Class[] rTypes = ma[i].getParameterTypes();
			System.out.print("(");
			for(int k = 0; k<rTypes.length; k++){
				System.out.print(rTypes[k]+" ");
			}
			System.out.print(")");
			Class[] ex = ma[i].getExceptionTypes();
			for(int m = 0; m < ex.length; m++){
				System.out.println(ex[m]);
			}
			System.out.println();
		}
		System.out.println("}");
	}
}
