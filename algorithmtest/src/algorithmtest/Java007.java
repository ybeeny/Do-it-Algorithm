package algorithmtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java007 {

		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // Scanner보다 빠름
			int N = Integer.parseInt(bf.readLine());
			int M = Integer.parseInt(bf.readLine());
			int[] A = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i = 0 ; i < N ; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);
			int count = 0;
			int i = 0;           // 첫번째 인덱스 값
			int j = N-1;         // 마지막 인덱스 값
			while(i < j) {
				if(A[i] +A[j] < M)i++;
				else if(A[i] + A[j] > M)j--;
				else {
					count++;
					i++;
					j--;
				}
			}
			System.out.println(count);
			bf.close();
		}
	}


