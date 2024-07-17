package ooLanna;

import javax.swing.JOptionPane;

public class Ex {
	public static void main(String[] args) {
		int[] t;
		int y;
		float x;
		float z;
		String strX;
		String strY;
		String strZ;
			  
		strX = JOptionPane.showInputDialog("Informe valor de x");
		x = Float.parseFloat(strX);
		strY = JOptionPane.showInputDialog("Informe valor de y");
		y = Integer.parseInt(strY);
		strZ = JOptionPane.showInputDialog("Informe valor de z");
		z = Float.parseFloat(strZ);		
		
		t = compute(x, y, z);
		//print(t);
		print(t, true);
		
	}
	static int[] compute(float l, int m, float n) {
		int x[] = new int[m];
		
		for (int i=0; i<m; i++) {
			x[i] = (int)l + i*(int)n;
			}
		return x;
	}
	static void print(int[] t, boolean b) {
		String m = "";
		for (int i=0; i<t.length; i++) {
			if (b) {
				if (i%2 == 0) {
					m += t[i] + ',';
			} else {
				m += i + ",";
			}
			}
		}
		JOptionPane.showMessageDialog(null, m);
	}
	
	static void print(int[] t) {
		String m = "";
		for (int i=0; i<t.length; i++) {
			m += t[i] + ",";
		}
		JOptionPane.showMessageDialog(null, m);
	}
}
