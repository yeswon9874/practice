

import java.util.Scanner;

public class Test6 {


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bag = new int[N + 1];
		
		for(int i =1; i <=N; i++) {
			bag[i] = i;
		}
		
		for(int i=0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp = bag[a];
			bag[a] = bag[b];
			bag[b] = temp;
		}
		
		for(int i =1; i<=N; i++) {
			System.out.print(bag[i] + " ");
		}
	}

}
