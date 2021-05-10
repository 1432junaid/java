import java.util.*;
class FibDemo{
	int[] buffer;
	FibDemo(int size){
		buffer = new int[size];
		buffer[0] = 0;
		buffer[1] = 1;
		buffer[2] = 1;
	}
	FibDemo1(int size, int n){
		buffer.add(1);
		buffer.add(1);
		for(int i = 2; i<= n; i++){
			buffer.add()
		}
	}
	int fib(int n){
//		if(n-1 == 0 || n-2 == 0) return ;
		if(buffer[n] == 0 ){//|| n >= 2){
//			if(buffer[n])
				buffer[n] == fib(n-1) + fib(n-2);
		}
		return buffer[n];
	}

	public static void main(String[] args){
		FibDemo f = new FibDemo(6);
		System.out.println(f.fib(2));
	}
}
