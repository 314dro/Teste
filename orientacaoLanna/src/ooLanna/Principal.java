package ooLanna;

public class Principal {

	public static void main(String[] args) {
		Calculadora c1, c2, c3, c4;
		
		c1 = new Calculadora(2, 3);
		c2 = new Calculadora(4, 3);
		c3 = new Calculadora(3, 7);
		c4 = new Calculadora(5, -5);
		
		System.out.println("C1: " + c1 + ": " + c1.somar());
		System.out.println("C2: " + c2 + ": " + c2.subtracao());
		System.out.println("C3: "  + c3 + ": " + c3.subtracao());
		System.out.println("C4: " + c4 + ": " + c4.somar());

	} 
}
