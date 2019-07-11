package NovoCurso;

import java.util.Scanner;

public class ExFor6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int total1 = i * i;
			int total2 = i * i * i;
			System.out.println(i + " " + total1 + " " + total2);

		}

		sc.close();
	}

}
