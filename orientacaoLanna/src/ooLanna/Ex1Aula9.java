package ooLanna;

import javax.swing.JOptionPane;

public class Ex1Aula9 {
	public static void main (String [] args) {
		String entrada1 = imprimirMenu();
		//switch ()
	}

public static String imprimirMenu() {
	String entrada = JOptionPane.showInputDialog("Escolha uma das opções a seguir:\n 1 - Quadrado\n 2 - Retangulo\n 3 - Triângulo\n 4 - Circulo\n 5 - Trapézio");
	return entrada;
}

public static int lerInteiro(String entrada1) {
	String op = JOptionPane.showInputDialog(imprimirMenu());
	int num = Integer.parseInt(op);
	return num;
	
}

}
