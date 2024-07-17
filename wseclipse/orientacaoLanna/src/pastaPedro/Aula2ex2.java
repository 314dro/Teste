package ooLanna;

import java.util.Scanner;

public class Aula2ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		float a = sc.nextFloat();
		System.out.println("Digite um número");
		float b = sc.nextFloat();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(Math.pow(a,b));
		sc.close();
	}

}