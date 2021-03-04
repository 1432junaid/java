import java.util.Scanner;

public class array{
	public static void main(String[] args){
		int[] arr  = new int[5];
		for(int i = 0; i < 5; i++){
			Scanner a = new Scanner(System.in);
			arr[i] = a.nextInt();
		}
		for(int i = 0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
};
