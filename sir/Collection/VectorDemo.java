import java.util.*;
class VectorDemo{
	public static void main(String[] agrs){
		Vector<Integer> v = new Vector<Integer>(10,2);
		v.add(12);
		v.add(20);
		v.add(13);
		Vector<Integer> v1 = new Vector<Integer>(v);
		v1.add(123);
//		System.out.println(v.capacity());
		Enumeration<Integer> e = v1.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
		}
		for(int i = 0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
	}
}
