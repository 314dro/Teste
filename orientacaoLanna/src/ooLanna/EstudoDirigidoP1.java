package ooLanna;

import javax.swing.JOptionPane;

public class EstudoDirigidoP1 {

	
	
	/*1 - O que são tipos de dados primitivos? Quais os tipos de dados primitivos de Java?
			int, double, float, long, short, char, byte, boolean.
			 0, 0.0d, 0.0f, 0L, 0, 0, false 

			2 - O que é o type casting? Quais os tipos de type casting?
			 Dê ao menos dois exemplos de instruções para cada tipo de type-casting.
			type casting é uma função em java onde é possível transformar um tipo de dado para outro.
			existem 2 tipos, o down casting, onde um tipo maior é tranformado em um menor e o up casting onde um tipo menor é tranformado em um maior.

			float pi = 3.14f;
			int i = (int) pi;
			byte a = 34;
			short x = (byte) a;


			float x = 3.58f;
			double i = x;
			String a = "casa";
			int x = Integer.parseInt(a);

			public static void main (String[] args) {
			   int a = 13; 
			   int b = 10; 
			   int c = 30; 
			   
			   String resposta1 = ""; 
			   String resposta2 = ""; 
			   
			   resposta1 += a; 
			   resposta1 += b; 
			   resposta1 += c; 
			   
			   resposta2 += a + b + c; 
			   
			   System.out.println (resposta1); 
			   System.out.println (resposta2); 
			}

			a) 131030
			b) 53

			4 - No seguinte trecho de código, apresente as linhas em que ocorrem type-casting. Apresente ainda qual será o resultado da execução das instruções.*/

			public static void main (String[] args) {//Duas formas de fazer, printando com o sysout - foi a que eu fiz - 
				///e prinntando com JOptionPane - que o chat me ajudou
			   /* String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5
			    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5
			    float a = Float.parseFloat(strA);
			    int b = Integer.parseInt(strB); 
			    
			    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b)); 
			    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));
			    
			    
			    /*6 - Crie um algoritmo que seja capaz de converter um número natural na base decimal 
			    em seu equivalente em binário. Considere que a entrada será sempre um número positivo.*/
			    
			   /* int x = lerInteiro("Digite o número que deja transformar em binário: ");
			    String resultado = "";
			    if (x == 0) {
			    	resultado = "0";
			    	String strCerta = girarString(resultado);
					 JOptionPane.showMessageDialog(null, strCerta);
			    } if (x == 1) {
			    	resultado = "1";String strCerta = girarString(resultado);
					 JOptionPane.showMessageDialog(null, strCerta);
			    }
			    else {
			    	while( x > 1) {
					   resultado += (x%2);
					   x = x/2;
			    	}
			    	String strCerta = girarString(resultado);
					 JOptionPane.showMessageDialog(null, "1" + strCerta);
			}*/
			        int[] vetor = new int[] {9, 3, 6, 4, 5, 8, 0, 2, 7, 1};
			        System.out.println(imprimirVetor(vetor));
			        
			        int[] resposta = foo(vetor, 3);
			        System.out.println(imprimirVetor(resposta));
			    }

			    
			    static int[] foo(int[] vetor, int k) {
			        int[] novo = new int[vetor.length];
			        int j = k;
			        for (int i=0; i<vetor.length; i++) {
			        	novo[j] = vetor[i];
			        	System.out.println(j);
			            j++;
			            if (j == vetor.length) {
			            	j = 0;
			            }
			        }
			        return novo;
			    }

			    
			    static String imprimirVetor(int[] vetor) {
			        String resposta = "[ ";
			        for (int i=0; i<vetor.length; i++) {
			            resposta += vetor[i] + (i < vetor.length - 1 ? ", " : " ]"); 
			        }
			        return resposta;
			    }
			  

			 /*char v[] = virarVetor(resultado);
			 for (char i : v) {
				 System.out.println(i);
			 }*/
			

			/*private static char[] virarVetor(String resultado) {
				char[] v = new char[resultado.length()];
				for (int i=0, j = (v.length - 1); i<v.length; i++, j--) {
					v[i] = resultado.charAt(j);
				}
				return v;
			}*/
					
		
			private static int lerInteiro(String mensagem) {
				String str = JOptionPane.showInputDialog(mensagem);
				int y = Integer.parseInt(str);
				return y;
			}
			
			private static String girarString(String str) {
				StringBuilder resul = new StringBuilder();
				for (int i = str.length() - 1; i>=0; i--) {
					resul.append(str.charAt(i));
				}
				return resul.toString();
			}
			/*Mostrará primeiro o valor 18, e no segundo o valor 8.5

			5 - Analise o seguinte algoritmo e imprima seus resultados quando os valores de a, b e c
			assumirem nas linhas x, y e z, respectivamente, os seguintes valores:

			a = 1, b = 2, c = 3
			a = 3, b = 2, c = 4
			a = 5, b = 3, c = 4
			a = 3, b = 5, c = 3
			a = 6, b = 3, c = 3
			a = 5, b = 5, c = 5
			a = 4, b = 2, c = 4*/

			/*float a = lerFloat("Informe A:");
			float b = lerFloat("Informe B:");
			float c = lerFloat("Informe C:");
					
					String resposta = "";
					
					if (ehTriangulo(a, b, c)) {
						resposta += "Os lados informados formam um triangulo.\n";
						if (equilatero(a, b, c)) {
							resposta += "É um triangulo equilatero.\n";
						} else if (isosceles(a, b, c)) {
							resposta += "É um triangulo isosceles.\n";
						} else { 
							resposta += "É um triangulo escaleno.\n"; 
						}
						
						if (ehTrianguloRetangulo(a, b, c)) {
							resposta += "É um triangulo retangulo.";
						}
					} else {
						resposta += "Os valores informados não formam um triangulo.";
					}
					
					JOptionPane.showMessageDialog(null, resposta);
				}


				static boolean ehTrianguloRetangulo(float a, float b, float c) {
					boolean resposta = ( (a * a == b * b + c * c) || 
						                 (b * b == a * a + b * c) ||
						                 (c * c == a * a + b * b));
					return resposta;
				}


				static boolean isosceles(float a, float b, float c) {
					boolean resposta = ((a == b && a != c) || 
							            (a == c && a != b) ||
							            (b == c && b != a)); 
					return resposta;
				}

				static boolean equilatero(float a, float b, float c) {
					boolean resposta = (a == b && a == c);
					return resposta;
				}

				static boolean ehTriangulo(float a, float b, float c) {
					return (( a > Math.abs(b - c) && a < Math.abs(b + c)) && 
							( b > Math.abs(a - c) && b < Math.abs(a + c)) && 
							( c > Math.abs(a - b) && c < Math.abs(a + b)));
				}

				static float lerFloat(String msg) {	

					String str = JOptionPane.showInputDialog(msg);
					float f = Float.parseFloat(str);
					return f;
				}	

			/*a) Os valores informados não formam um triangulo.
			b)Os valores informados não formam um triangulo.
			c)Os lados informados formam um triangulo.
			É um triangulo retangulo. 
			d)Os lados informados formam um triangulo.
			É um triangulo isosceles.
			e)Os valores informados não formam um triangulo.
			f) Os lados informados formam um triangulo
			É um triangulo equilatero.
			g)Os lados informados formam um triangulo.
			É um triangulo isosceles. não chequei se acertei*/
			

				
				
				
}
