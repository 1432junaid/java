
import java.util.Scanner;
class ExceptionMain{
	public static void main(String[] args){
		int x = 0;
		int y = 0;
		System.out.println("Enter two numbers separated by space");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ip = input.split(" ");
		x = Integer.parseInt(ip[0]);
		y = Integer.parseInt(ip[1]);
		int z = 0;
		try{
			z = x/y;
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Second value could not zero");
			y = sc.nextInt();
			z = x/y;
		}
		//int z = x/y;
		System.out.println(z);
	}
}
