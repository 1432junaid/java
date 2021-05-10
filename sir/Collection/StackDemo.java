import java.util.*;
class StackDemo{
	public static void main(String[] agrs){
		Stack<Integer> s = new Stack<Integer>();
		s.push(19);
		s.push(12);
		s.push(213);
//		while(!s.empty()) System.out.println(s.pop());
		System.out.println(s.search(new Integer(19)));
		System.out.println(s.search(213));
	}
}
