package mpkg;
import java.lang.reflect.*;
import mypkg.AccessDemo;
class AccessDemo2 extends AccessDemo{
	public static void main(String[] args){
		AccessDemo2 a = new AccessDemo2();
		Class ca = a.getClass();
		System.out.println(ca.getName());
		try{
			Class cl = Class.forName("mypkg.AccessDemo2");
			AccessDemo2 a1 = (AccessDemo2)cl.newInstance();
			Class c = AccessDemo2.class;
			Class ic = int.class;
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}
