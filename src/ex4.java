import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio_num = JOptionPane.showInputDialog("Introduce el radio para calcular el àrea del circulo: ");
		double radio = Double.parseDouble(radio_num);
		double radio_quadrado = Math.pow(radio,2);
		
		JOptionPane.showMessageDialog(null,"El àrea del circulo és "+ (radio_quadrado*Math.PI));

	}

}
