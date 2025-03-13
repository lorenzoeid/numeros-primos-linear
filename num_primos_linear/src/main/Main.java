package main;

import java.util.Scanner;

public class Main {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o número: ");
			int n = sc.nextInt();
			sc.close();
			
			if (n <= 1) {
				System.out.println("Insira um número maior que 1");
			} else if (n == 2) {
				System.out.println("Números primos: 2");
			}else {
				for (int x = 2; x < n; x++) {
					if ((x % 2 != 0) && (x % 3 != 0) && (x % 5 != 0) && (x % 7 != 0) && (x % 9 != 0) || (x == 2) | (x == 3) | (x == 5) | (x == 7)){
							System.out.println(x + " ");
						}
			}
		}
	}
}
