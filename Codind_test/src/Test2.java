import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
	
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		
//		int arr[] = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		sc.close();
//		
//		for (int i=0; i < N; i++) {
//			if (arr[i] < X) {
//				System.out.println(arr[i] + " ");
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i < N; i++) {
			int val = sc.nextInt();
			
			if (val < X) {
				sb.append(val + " ");
			}
		}
		
		System.out.println(sb);
	}

}
