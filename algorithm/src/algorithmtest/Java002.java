package algorithmtest;

import java.util.Scanner;

public class Java002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
	
		long sum = 0;
		long max = 0;
		for(int i = 0 ; i < N ; i++) {
			if(arr[i] > max) max = arr[i];
			sum += arr[i];
		}
		System.out.println(sum * 100 / max / N);
	}
}
