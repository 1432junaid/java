import java.util.*;
class ArrayDequeDemo{
	public static void main(String[] args){
		ArrayDeque<String> pq = new ArrayDeque<>();
		System.out.println(pq.add("A"));
		pq.offer("D");
		pq.offer("B");
		pq.offer("C");
		pq.remove();
//		System.out.println(pq.remove());
//		Iterator<String> it = pq.iterator();	//itrator in Collection
//		pq.offer("E");
//		Iterator<String> it1 = pq.iterator();
/*		while(it1.hasNext()){
			System.out.println(it1.next());
		}
*/
		pq.remove("E");
		pq.offerLast(")");
		pq.offerFirst("(");
		pq.forEach((V)->{System.out.print(V+" ");});
	}
}
