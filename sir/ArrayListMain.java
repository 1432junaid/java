import java.util.ArrayList;
class ArrayListMain{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("Lucknow");
		al.add(3.14f);
		for(int i = 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

//		int x = al.get(0);		//error : incompatiable types
		int x = ((Integer)al.get(0)).intValue();
		System.out.println(x);
	}
}
