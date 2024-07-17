package ooLanna;

import javax.swing.JOptionPane;

public class Aula3Ex3 {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite uma palavra e o sistema verificará se é um palíndromo: ");
		
		char[] stringFormatada = formatarString(entrada);
		
		JOptionPane.showMessageDialog(null, palindromo(stringFormatada));

	}

	public static String palindromo(char[] strFormat) {
        int i = 0;
        int j = strFormat.length - 1;

        while (i < j) {
            if (strFormat[i] != strFormat[j]) {
                return "A palavra escrita não é um palíndromo";
            }
            i++;
            j--;
        }
        return "A palavra escrita é um palíndromo!";
    }

	public static char[] formatarString(String entrada) {
		entrada = entrada.replaceAll(" ", "");
		entrada = entrada.toLowerCase();
		char[] resposta = entrada.toCharArray();	
		return resposta;
	}
	
	

}
