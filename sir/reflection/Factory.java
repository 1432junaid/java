import java.util.*;
class Demo{
	public void printer(){
		System.out.println("am Demo printer");
	}
}

class Factory1{
	static HashMap<String,Object> hm  = new HashMap<>();
	synchronized public static Object getInstance(String s) throws Exception{
		Object obj = hm.get(s);
		if(obj != null) return obj;
		else{
			Class cl = Class.forName(s);
			obj  = cl.newInstance();
			hm.put(s,obj);
		}
		return obj;
	}
}

class FactoryMain{
	public static void main(String[] args){
		try{
			String s = (String)Factory1.getInstance("java.lang.String");
			Demo d = (Demo)Factory1.getInstance("Demo");
			d.printer();
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("hello");
		}
	}
}

