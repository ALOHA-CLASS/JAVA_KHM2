package Day02;

import java.util.Iterator;
import java.util.Scanner;

public class Ex21_Star2 {
	
	public static void main(String[] args) {
		// 입력 : 5
		// *****
		// ****
		// ***
		// **
		// *
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N ; i++) {
			// i : 1, j : 5 4 3 2 1
			// i : 2, j : 5 4 3 2
			// i : 3, j : 5 4 3 
			// i : 4, j : 5 4
			// i : 5, j : 5
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}







