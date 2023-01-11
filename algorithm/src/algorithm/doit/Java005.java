package algorithm.doit;

import java.util.Scanner;

public class Java005 {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];    // 합 배열 선언
		long[] C = new long[M];	   // 나머지가 같은 인덱스를 카운트하는 배열
		long answer = 0;
		S[0] = sc.nextInt();
		
		for(int i = 1; i < N ; i++) {        // 원본 배열의 합배열을 저장하는 for문
			S[i] = S[i-1] + sc.nextInt();  
			System.out.println(S[i]);
		}
		for (int i = 0 ; i < N ; i++) {        // 합 배열의 모든 값에 %M 연산하기 
			int r = (int)(S[i] % M);
			if(r == 0) answer++;          // 연산결과가 0일때 answer 더하기
			C[r]++;						  
		}
		for(int i = 0 ; i < M ; i++) {
			if(C[i] > 0) {
				answer += (C[i] * (C[i]-1) / 2); // 콤비네이션 구하는 공식
			}
		}
		System.out.println(answer);
		
	}
}
