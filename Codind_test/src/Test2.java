import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
	
		// ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
