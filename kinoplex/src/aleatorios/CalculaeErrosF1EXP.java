package aleatorios;

import java.util.Scanner;

public class CalculaeErrosF1EXP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		/*while (x < 8) {
			  double t1 = sc.nextDouble(); 
			  double t2 = sc.nextDouble(); 
			  double t3 = sc.nextDouble(); 
			  double t4 = sc.nextDouble(); 
			  double t5 = sc.nextDouble();
			  
			  double tempoInstMedio = (t1 + t2 + t3 + t4 + t5) / 5;
			  x = x + 1;
			  System.out.print("Exp" + x);
			  System.out.printf("   A média é: %.4f%n", tempoInstMedio);
			  
		}*/

		  /*System.out.println("Digite a media");
		  double m = sc.nextDouble();
		  
		  System.out.println("Digite os tempos");
		  double a1 = sc.nextDouble(); 
		  double a2 = sc.nextDouble(); 
		  double a3 = sc.nextDouble(); 
		  double a4 = sc.nextDouble(); 
		  double a5 = sc.nextDouble();
		  
		  double b1 = a1 - m; 
		  double b2 = a2 - m; 
		  double b3 = a3 - m; 
		  double b4 = a4 - m; 
		  double b5 = a5 - m;
		  
		  double v1 = Math.pow(b1, 2); 
		  double v2 = Math.pow(b2, 2); 
		  double v3 =
		  Math.pow(b3, 2); 
		  double v4 = Math.pow(b4, 2); 
		  double v5 = Math.pow(b5, 2);
		  
		  double variancia = (v1 + v2 + v3 + v4 + v5) / 4; 
		  double desvioPadrao = Math.sqrt(variancia); 
		  System.out.printf("%.8f%n",desvioPadrao);*/
		 
		/*while (x < 8) {
			double dvp = sc.nextDouble();
			double erroAleatorio = dvp / Math.sqrt(5);
			x = x + 1;
			System.out.print("erro estatistico exp" + x);
			System.out.printf("    %.6f%n", erroAleatorio);
		}*/
		
		/*while (x < 8) {
			double erroAleatorio = sc.nextDouble();
			double erroTotal = Math.sqrt((Math.pow(erroAleatorio, 2) + Math.pow(0.001, 2)));
			x = x + 1;
			
			System.out.println("exp " + x);
			System.out.printf("Erro total: %.5f%n", erroTotal);
		}*/
		
		/*System.out.println("Calcular a velocidade instantânea média.");
		
		while (x < 8) {
			x = x + 1;
			double deltaS = 0.006;
			double erroDS = 0.0005;
			
			System.out.println("Digite o delta t:");
			double deltaT = sc.nextDouble();
			System.out.println("Digite o erro de Dt:");
			double erroDT = sc.nextDouble();
			
			double erroT = (deltaS / deltaT) * ((erroDS / deltaS) + (erroDT / deltaT));
			double deltaV = deltaS / deltaT;
			System.out.println("exp" + x);
			System.out.printf("Velocidade instântanea: %.4f%n", deltaV);
			System.out.printf("+- %.4f%n", erroT);
		}*/
		
		System.out.println("Calcular o delta K");
		while (x < 8) {
			System.out.println(" ");
			x = x + 1;
			double m = 236.1;
			System.out.println("Informe a  velocidade final: ");
			double vf = sc.nextDouble();
			double vfPow = vf * vf;
			double x1 = (m * vfPow);
			double deltaK = x1 / 2;
			System.out.println("exp"+ x);
			System.out.printf("O deltaK é: %.4f%n", deltaK);
		}
		sc.close();

		
	}

}
