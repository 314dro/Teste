package ooLanna;

import java.util.Scanner;

public class Aula3Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		do { 
			escolha = menu(sc);
			switch(escolha) {
		case 1:
			System.out.println("Digite o raio:");
			float x = sc.nextFloat();
			circulo(x);
		break;
		case 2:
			System.out.println("Digite um lado: ");
			float a = sc.nextFloat();
			System.out.println("Digite o outro lado: ");
			float b = sc.nextFloat();
			quadrado(a, b);
		break;
		case 3:
			System.out.println("Digite um lado: ");
			float c = sc.nextFloat();
			System.out.println("Digite o outro lado: ");
			float d = sc.nextFloat();
			quadrado(c, d);
		break;
		case 4:
			System.out.println("Digite o lado menor: ");
			float menor = sc.nextFloat();
			System.out.println("Digite o lado maior: ");	
			float maior = sc.nextFloat();
			System.out.println("Digite a altura: ");
			float altura = sc.nextFloat();
			trapezio(maior, menor, altura);
		break;
		case 0:
			System.out.println("Tchau!");
			break;
			default:
		break;}}
		while (escolha != 0);
				
		sc.close();
		
	}

	private static int menu(Scanner sc) {
		int resp;
		do {
			System.out.println("1 - Círculo \n2 - Quadrado \n3 - Retângulo \n4 - Trapézio \n0 - Sair");
			
			resp = sc.nextInt();
			return resp;
		} while (resp != 0);
	}
	
	static void circulo(float raio) {
		double perimetro = 2*Math.PI*raio;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo desejado é: "+ area);
		System.out.println("O perímetro do círculo desejado é: "+ perimetro);
	}
	
	/*static void triangulo(float a, float b, float c) {
		if (abs(a-b) < a b+c & abs(a-c) < b < a+c & abs(a-b) < c < a+b) {
			System.out.println("É poosível formar um truiângulo");
		}*/
	static void quadrado(float a, float b) {
		float area = a*b;
		float perimetro = (2*a) + (2*b);
		System.out.println("A área do quadrado desejado é: "+ area);
		System.out.println("O perímetro do quadrado desejado é: "+ perimetro);
		
		
	}

	static void trapezio(float maior, float menor, float altura) {
		float area = (maior+menor)*altura / 2;
		float perimetro = (2*maior) + (2*menor);
		System.out.println("A área do trapézio desejado é: "+ area);
		System.out.println("O perímetro do trapézio desejado é: "+ perimetro);
	}
	
	/*static void painel(String resp) {
		JOptionPane.showMessageDialog(null, resp);	
	}*/

}
