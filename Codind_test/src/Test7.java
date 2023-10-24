

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 학생수 최대 30명
		int[] student = new int[31];
		
		// 학생수를 28명만 for문 돌려서
		for(int i=1; i< 29; i++) {
			// 성공 값을 저장시킴
			int success = sc.nextInt();
			student[success] = 1;
		}
		
		// 성공한 학생 중에서
		for(int i=1; i<student.length; i++) {
			// 성공 못한 학생이 있으면 출력하기
			if(student[i] != 1) {
				System.out.println(i);
			}
		}
				
	}

}
