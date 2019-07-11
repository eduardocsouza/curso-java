package NovoCurso;

import java.util.Scanner;

public class ExFor2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = 0;
		int s2 = 0;
		
		for(int i=0; i <n; i++) {
			int x = sc.nextInt();
			if (x > 0 && x <= 20) {
				s = s + 1;
				
			}else {
				s2 = s2 + 1;
				
			}
		}
		
		System.out.println("in: " + s);
		System.out.println("out: " + s2);
		sc.close();
	}

}
