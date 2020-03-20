package blastClaraV2;


import javax.swing.*;

public class Config2 extends JPanel {
	private JLabel porcentaje;
	private JTextField numPorcentaje;

	public Config2() {

		porcentaje = new JLabel("Porcentaje");
		numPorcentaje = new JTextField(5);

		add(porcentaje);
		add(numPorcentaje);
		// TODO Auto-generated constructor stub
	}

	public float getNumPorcentaje() {
		float r = 0;
		if (!numPorcentaje.getText().equals("")) {
			r = Float.parseFloat(numPorcentaje.getText());
		}
		return r;
	}

}
