

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �л��� �ִ� 30��
		int[] student = new int[31];
		
		// �л����� 28�� for�� ������
		for(int i=1; i< 29; i++) {
			// ���� ���� �����Ŵ
			int success = sc.nextInt();
			student[success] = 1;
		}
		
		// ������ �л� �߿���
		for(int i=1; i<student.length; i++) {
			// ���� ���� �л��� ������ ����ϱ�
			if(student[i] != 1) {
				System.out.println(i);
			}
		}
				
	}

}
