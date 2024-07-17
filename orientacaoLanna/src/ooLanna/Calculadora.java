package ooLanna;

public class Calculadora {
	/** 
	 * atributos da classe Calculadora
	 */
	int op1, op2, resultado;
	
	public Calculadora(int o1, int o2) {
		op1 = o1;
		op2 = o2;
	}
	int somar() {
		resultado = op1 + op2;
		return resultado;
	}
	
	int subtracao() {
		resultado = op1 - op2;
		return resultado;
	}
}
