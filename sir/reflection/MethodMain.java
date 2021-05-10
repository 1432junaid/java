import java.util.*;
import java.lang.reflect.*;
class MyClass{
	public int add(int x, int y){
		return x+y;
	}
}


class MethodMain{
	public static void main(String[] args){
		try{
			Class cl = MyClass.class;
			Method  m = cl.getMethod("add", int.class, int.class);
			int x =  10, y = 20;
//			int i = (int)m.invoke(x,y);
			Integer i = (Integer)m.invoke(x,y);
			System.out.println(i);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
