import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue<String> pq = new PriorityQueue<>();
		System.out.println(pq.add("A"));
//		System.out.println(pq.size());
		pq.offer("D");
		pq.offer("B");
		pq.offer("C");
		pq.remove();
//		System.out.println(pq.remove());
//		Iterator<String> it = pq.iterator();	//itrator in Collection
		pq.offer("E");
//		Iterator<String> it1 = pq.iterator();
/*		while(it1.hasNext()){
			System.out.println(it1.next());
		}
*/
		pq.remove("E");
		pq.forEach((V)->{System.out.print(V+" ");});
	}
}
