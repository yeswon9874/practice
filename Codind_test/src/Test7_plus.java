import java.util.Scanner;

public class Test7_plus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 30��  �л��߿���
		int[] arr = new int[31];
		
		// 28���� �л����� for�� ������
		for(int i=1; i < 29; i++) {
			arr[sc.nextInt()]++;
		}
		sc.close();
		
		for(int i=1; i <30; i++) {
			// ��ü���� �л��� ������
			if(arr[i] == 0) {
				// ���
				System.out.println(i);
			}
		}
	}

}
