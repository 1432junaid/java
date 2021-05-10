import java.util.*;
class HashtableDemo{
		Hashtable<String, String> info = new Hashtable<>();
		Hashtable<String, String> info1 = new Hashtable<>();
		info.put("MCA","Junaid");
		info1.put("MCA", "Junaid");
		System.out.println(info.hashCode());
		System.out.println(info1.hashCode());
}

class HashMain{
	public static void main(String[] args){
		HashtableDemo h1 = new HashtableDemo();
	}
}
