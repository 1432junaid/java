public class final_key{
	public static void main(String[] args){
		static int x = 10;
		final int y = 20;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		x = y;
		System.out.println("x = "+x);
//		y = 30;
//		System.out.println("y = "+y);
	}
};
