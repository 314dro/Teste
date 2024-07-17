package ooLanna;

import javax.swing.JOptionPane;

public class Aula3Ex2 {

	public static void main(String[] args) {
		int qtdValores = lerInteiro("Digite quantos valores deseja colocar no vetor: ");
		
		int[] v = preencherVetor(qtdValores);
		calcularMedia(v);
		qtdPositivos(v);
		qtdNegativos(v);
		qtdZeros(v);
		qtdImpar(v);
		qtdPar(v);
		
	}
		
	public static int[] preencherVetor(int qtdValores) {
		int v[] = new int[qtdValores];
		for (int i = 0; i < qtdValores; i++) {
			v[i] = lerInteiro("Digite um valor: ");
		}
		return v;
	}

	public static int lerInteiro(String mensagem) {
		String strNumero = JOptionPane.showInputDialog(mensagem);
		int numero = Integer.parseInt(strNumero);
		return numero;
	}
	
	public static float calcularMedia(int[] v) {
		int length = v.length;
		int soma = 0;
		for (int i=0; i < length; i++) {
			soma = soma + v[i];
		}
		float media = soma / length;
		JOptionPane.showMessageDialog(null, "A média dos valores do vetor é " + media);
		return media;
	}
	
	public static int qtdPositivos(int v[]) {
		int length = v.length;
		int p = 0;
		for (int i=0; i < length; i++) {
			if (v[i] > 0) {
				p += 1;
			}else {
				p += 0;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números positivos do vetor é " + p);
		return p;
	}
	
	public static int qtdNegativos(int v[]) {
		int length = v.length;
		int n = 0;
		for (int i=0; i < length; i++) {
			if (v[i] < 0) {
				n += 1;
			}else {
				n += 0;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números negativos do vetor é " + n);
		return n;
	}
	
	public static int qtdZeros(int v[]) {
		int length = v.length;
		int z = 0;
		for (int i=0; i < length; i++) {
			if (v[i] == 0) {
				z += 1;
			}else {
				z += 0;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de zeros no vetor é " + z);
		return z;
	}
	
	public static int qtdImpar(int v[]) {
		int length = v.length;
		int imp = 0;
		for (int i=0; i < length; i++) {
			if (v[i] % 2 != 0) {
				imp += 1;
			}else {
				imp += 0;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números impares no vetor é " + imp);
		return imp;
	}
	
	public static int qtdPar(int v[]) {
		int length = v.length;
		int par = 0;
		for (int i=0; i < length; i++) {
			if (v[i] % 2 == 0) {
				par += 1;
			}else {
				par += 0;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números pares no vetor é " + par);
		return par;
	}
}
