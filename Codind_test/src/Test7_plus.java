import java.util.Scanner;

public class Test7_plus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 30명  학생중에서
		int[] arr = new int[31];
		
		// 28명의 학생수를 for문 돌려서
		for(int i=1; i < 29; i++) {
			arr[sc.nextInt()]++;
		}
		sc.close();
		
		for(int i=1; i <30; i++) {
			// 미체줄한 학생이 있으면
			if(arr[i] == 0) {
				// 출력
				System.out.println(i);
			}
		}
	}

}
