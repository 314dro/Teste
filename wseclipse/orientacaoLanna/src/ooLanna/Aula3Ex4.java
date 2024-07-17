package ooLanna;

import javax.swing.JOptionPane;

public class Aula3Ex4 {

	public static void main(String[] args) {
		int m = lerLinhas("Digite o valor de linhas, da primeira matriz, desejado: ");
		int n = lerColunas("Digite o valor de colunas, da primeira matriz, desejado: ");
		int[][] M1 = new int[m][n];
		
		int o = lerLinhas("Digite o valor de linhas, da segunda matriz, desejado: ");
		int p = lerColunas("Digite o valor de colunas, da segunda matriz, desejado: ");
		int[][] M2 = new int[o][p];
		
		if (multiplica(M1, M2)) {
			definaMatrizA(M1);
			definaMatrizB(M2);
			int[][] M3 = calcularM3(M1, M2);
			exibirMatriz(M3);
		} else {
		}
		
	}

	public static int lerLinhas(String mensagem1) {
		String M = JOptionPane.showInputDialog(mensagem1);
		int m = Integer.parseInt(M);
		return m;
	}

	public static int lerColunas(String mensagem2) {
		String N = JOptionPane.showInputDialog(mensagem2);
		int n = Integer.parseInt(N);
		return n;
	}
	
	public static boolean multiplica(int[][] M1, int[][] M2) {
		if (M1[0].length != M2.length) { //.length em uma matriz chama o número de linhas da mesma. Uma função em java.
			//[0].length em uma matriz chama o número de colunas dela. Uma função em java.
			JOptionPane.showMessageDialog(null, "As matrizes não podem ser multiplicadas");
			return false;
		}
		JOptionPane.showMessageDialog(null, "As matrizes podem ser multiplicadas");
		return true;
	}
	
	public static void definaMatrizA(int[][] m) {
		int lin = m.length;
		int col = m[0].length;
		
		for (int i=0; i<lin; i++) {
			for (int p=0; p<col; p++) {
				String A = JOptionPane.showInputDialog("Digite o A (" + (i + 1) + " " + (p + 1) + ")");
				int a = Integer.parseInt(A);
				m[i][p] = a;
			}
		}
	}
	
	public static void definaMatrizB(int[][] m) {
		int lin = m.length;
		int col = m[0].length;
		
		for (int i=0; i<lin; i++) {
			for (int p=0; p<col; p++) {
				String A = JOptionPane.showInputDialog("Digite o B (" + (i + 1) + " " + (p + 1) + ")");
				int a = Integer.parseInt(A);
				m[i][p] = a;
			}
		}
	}
	
	public static int[][] calcularM3(int[][] M1, int[][] M2) {
		int linM1 = M1.length;
		int colM1 = M1[0].length;
		int colM2 = M2[0].length;
		int[][] M3 = new int[linM1][colM2];
		
		for(int i=0; i<linM1; i++) {
			for(int j=0; j<colM2; j++) {
				 for (int k = 0; k < colM1 && k < M2.length; k++) {
		                M3[i][j] += M1[i][k] * M2[k][j];
		            }
				}
			}
		return M3;
	}
	/*    int linM1 = M1.length; - Esta linha obtém o número de linhas da matriz M1.
    int colM1 = M1[0].length; - Esta linha obtém o número de colunas da matriz M1. Assumimos que todas as linhas têm o mesmo comprimento, por isso usamos M1[0].length para obter o comprimento da primeira linha.
    int colM2 = M2[0].length; - Esta linha obtém o número de colunas da matriz M2. Novamente, assumimos que todas as linhas têm o mesmo comprimento.
    int[][] M3 = new int[linM1][colM2]; - Esta linha cria a matriz M3 que conterá o resultado da multiplicação das matrizes M1 e M2. A matriz terá o mesmo número de linhas que M1 e o mesmo número de colunas que M2.
    O loop for externo percorre as linhas da matriz M1.
    O loop for interno percorre as colunas da matriz M2.
    Dentro do segundo loop for, um terceiro loop for é usado para iterar através das colunas de M1 e das linhas de M2. Isso é necessário porque, para multiplicar duas matrizes, a multiplicação é feita somando os produtos dos elementos correspondentes das linhas de M1 e das colunas de M2.
    M3[i][j] += M1[i][k] * M2[k][j]; - Nesta linha, cada elemento da matriz M3 é calculado somando os produtos dos elementos correspondentes das linhas de M1 e das colunas de M2.
    Finalmente, a matriz M3 resultante é retornada.*/
	

	
    public static void exibirMatriz(int[][] matriz) { //copiei do chat, n me pergunte sobre
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Matriz:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mensagem.append(matriz[i][j]).append("   ");
            }
            mensagem.append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
 
   
}