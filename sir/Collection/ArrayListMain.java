import java.util.*;

class ArrayListMain{
	public static void main(String[] args){
		ArrayList<String>  c = new ArrayList<String>();
		Collection<String>  c1= new LinkedList<>();
		LinkedList<String> c2= new LinkedList<>();
		c2.add("RAM");
		c2.add("JD");
		c2.add("RAJA");
		if(c2.contains("RAM")) System.out.println("True = RAM");
		Iterator<String> it = c.iterator();
/*		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		for(String s : c){
			System.out.println(s);
		}
*/
	//	if(c instanceof RandomAccess){
			System.out.println("true");
			for(int i = 0 ; i<c2.size(); i++) System.out.println(c2.get(i));
	//	}else {
	//		System.out.println("False");
	//	}
	}
}
