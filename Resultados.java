package blastClaraV2;

import javax.swing.*;

public class Resultados extends JPanel {
	private JTextArea text;
	private JScrollPane devuelve;
	private JLabel tResultados;

	public Resultados() {
		text = new JTextArea(20, 50);
		devuelve = new JScrollPane(text);
		tResultados = new JLabel("Resultados:");

		add(tResultados);
		add(devuelve);
	}

	public void setDevuelve(String devuelve) {
		text.setText(devuelve);
	}

}
