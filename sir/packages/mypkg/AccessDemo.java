package mypkg;
public class AccessDemo{
	int x = 10;
	public int y = 20;
	protected int z = 20;
	private  int k = 40;
	public static void main(String[] args){
		AccessDemo a = new AccessDemo();
		System.out.println(a.x+" "+ a.y+" "+ a.z+" " + a.k+ " ");
	}
}
