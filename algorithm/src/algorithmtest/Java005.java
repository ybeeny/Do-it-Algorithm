package algorithmtest;

import java.util.Scanner;

public class Java005 {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];    // �� �迭 ����
		long[] C = new long[M];	   // �������� ���� �ε����� ī��Ʈ�ϴ� �迭
		long answer = 0;
		S[0] = sc.nextInt();
		
		for(int i = 1; i < N ; i++) {        // ���� �迭�� �չ迭�� �����ϴ� for��
			S[i] = S[i-1] + sc.nextInt();  
			System.out.println(S[i]);
		}
		for (int i = 0 ; i < N ; i++) {        // �� �迭�� ��� ���� %M �����ϱ� 
			int r = (int)(S[i] % M);
			if(r == 0) answer++;          // �������� 0�϶� answer ���ϱ�
			C[r]++;						  
		}
		for(int i = 0 ; i < M ; i++) {
			if(C[i] > 0) {
				answer += (C[i] * (C[i]-1) / 2); // �޺���̼� ���ϴ� ����
			}
		}
		System.out.println(answer);
		
	}
}
