import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		HashMap<Integer, String> info = new HashMap<>();
		info.put(2,"B two");
		info.put(3,"C three");
		info.put(1,"A One");
//		System.out.println(info.get(1));
//		System.out.println(info.get(2));
		System.out.println("\nforEach() --[functional programming : lambda expression]");
		info.forEach((K,V)->{System.out.println(K+"\t"+V ); });

		System.out.println("\nentry()");
		Set<Map.Entry<Integer,String>> s = info.entrySet();
		for(Map.Entry<Integer, String> i : s){
			System.out.println(i.getKey() +"\t"+i.getValue());
		}
		Collection<String> k1 = info.values();
		System.out.println("\nvalues()");
		for(String i : k1){
			System.out.println(i);
		}
		Set<Integer> k = info.keySet();
//		System.out.println("\nkeySet()");
		System.out.println("iterator");
		Iterator<Integer> it = k.iterator();
		while(it.hasNext()){
			System.out.println(info.get(it.next()) );
		}
		for(Integer i : k){
			System.out.println(info.get(i));
		}
	}
}
