package ooLanna;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		///insiraONome(sc);
		
		String nome2 = JOptionPane.showInputDialog("Qual seu nome?);");
		JOptionPane.showMessageDialog(null, "Olá, " + nome2 + ", seja bem vindo!");
		sc.close();
	}

	/*private static void insiraONome(Scanner nome5) {
		System.out.println("Digite seu nome:");
		String nome = nome5.nextLine();
		System.out.println("Olá, "+ nome+ " seja bem vindo!");
	}*/

}