package ooLanna;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula2Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a, b , c;
		a = lerLado('A');
		b = lerLado('B');
		c = lerLado('C');				
			
		boolean eTriangulo = eTriangulo(a,b,c);
		
		imprimirResposta(eTriangulo);
			
		sc.close();
		}
	static float lerLado(char lado) {
		String strLado = JOptionPane.showInputDialog("Informe o valor do lado " + lado);
		float tamanhoLado = Float.parseFloat(strLado);
		return tamanhoLado;
	}
	
	static boolean eTriangulo(float a, float b, float c) {
		boolean resposta = (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b);
		return resposta;	
	}
	static void imprimirResposta(boolean eTriangulo) {
		String resposta = "Os lados informados " + (eTriangulo ? "formam " : "não formam ") + "um Triangulo retângulo.";
		JOptionPane.showMessageDialog(null, resposta);
	}
}

