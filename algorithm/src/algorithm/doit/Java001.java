package algorithm.doit;

import java.util.Scanner;

public class Java001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for(int i = 0 ; i < cNum.length ; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}

}
