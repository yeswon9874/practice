import java.util.Scanner;

public class Test7_plus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		
		for(int i=1; i < 29; i++) {
			arr[sc.nextInt()]++;
		}
		sc.close();
		
		for(int i=1; i <30; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
