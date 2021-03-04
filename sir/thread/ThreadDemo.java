/*//import java.lang.Thread;
public class ThreadDemo implements Runnable{
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.println(i);
		}
	}
}
*/
class ThreadMain{
	public static void main(String[] args){
//		Runnable r =  new ThreadDemo();
		Thread t1 =  new Thread(new Runnable()
		{ public void run(){
			for(int i = 0; i<10; i++){
				System.out.println(i);
			}
		}});
		Thread t2 =  new Thread(new Runnable(){
		public void run(){
			for(int i = 0; i<10; i++){
				System.out.println(i);
			}
		}});
		t1.start();
		t2.start();
	}
}
