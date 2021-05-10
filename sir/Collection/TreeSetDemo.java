import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		Set<String> pq = new TreeSet<>();
		System.out.println(pq.add("B"));
		System.out.println(pq.add("A"));
		System.out.println(pq.add("A"));
//		System.out.println(pq.remove());
//		Iterator<String> it = pq.iterator();	//itrator in Collection
//		pq.offer("E");
//		Iterator<String> it1 = pq.iterator();
		pq.forEach((V)->{System.out.print(V+" ");});
	}
}
