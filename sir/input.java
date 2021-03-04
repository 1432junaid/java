import java.util.Scanner;
class input{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		//int x = Integer.parseInt(input);
		String[] arr = input.split(" ");
		for(int i = 0; i<arr.length; i++){
			int temp = Integer.parseInt(arr[i]);
			System.out.println(temp);
		}
//		System.out.println(x);
	}
}
