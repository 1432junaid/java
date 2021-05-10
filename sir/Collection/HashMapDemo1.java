import java.util.*;
class HashMapDemo1{
	public static void main(String[] args){

		ArrayList<String> info = new ArrayList<>();
		info.add("one");
		info.add("one");
		info.add("two");
		info.add("three");
		info.add("three");
/*		HashMap<String, Integer> hm = new HashMap<>();
		Iterator<String> it = info.iterator();
		try{
			while(it.hasNext()){
				if(hm.put(it.next(),1) == null){
					hm.put(it.next(),1);
				}else{
					Integer a = hm.get(it.next());
					a++;
					hm.put(it.next(),a);
				}
			}
			hm.forEach((K,V)-> {System.out.println(K+"\t"+V);});
		}catch(Exception e){
			e.printStackTrace();
		}
*/
		HashMap<String , Integer> hm =  new HashMap<>();
		for(int i = 0; i<info.size(); i++){
			if(hm.get(info.get(i)) != null){
				hm.put(info.get(i), hm.get(info.get(i))+1);
			}else{
				hm.put(info.get(i),1);
			}
		}
		hm.forEach((K,V)->{System.out.println(K+"\t"+V);});
	}
}
