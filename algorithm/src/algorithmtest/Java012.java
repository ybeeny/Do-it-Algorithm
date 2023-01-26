package algorithmtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Java012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] A = new int[n];
		int[] ans = new int[n];
		String[] str = bf.readLine().split(" ");
		for(int i = 0 ; i < n ; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);
		for(int i = 1 ; i < n ; i++) {
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) { // 스택이 비어있지 않고, 스택에 최근 추가된(TOP) 데이터가 수열보다 클때까지
				ans[myStack.pop()] = A[i];			
			}
			myStack.push(i);        // 신규 데이터 push
		}
		while(!myStack.empty()) {
			ans[myStack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   // 데이터 출력 코드
		for(int i = 0 ; i < n ; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}
}