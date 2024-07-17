package ooLanna;

import javax.swing.JOptionPane;

public class PrintarJOption {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Convert array to string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        String arrayAsString = sb.toString();

        // Show array using JOptionPane
        JOptionPane.showMessageDialog(null, "Array elements: " + arrayAsString);
        String a = "125";
		int x = Integer.parseInt(a);
    }

}
