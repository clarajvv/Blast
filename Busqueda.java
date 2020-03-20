package blastClaraV2;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Busqueda extends JPanel {

	private JButton busc;
	private JComboBox<String> secuencia;
	private Vector<String> historial;

	public Busqueda() {
		busc = new JButton("Buscar");
		historial = new Vector<String>();
		secuencia = new JComboBox<String>(historial);
		secuencia.setEditable(true);
		add(secuencia);
		add(busc);
	}

	public JButton getBusc() {
		return busc;
	}

	public void setBusc(JButton busc) {
		this.busc = busc;
	}

	public String getSecuencia() {
		return secuencia.getSelectedItem().toString();
	}

	public void setSecuencia(JComboBox<String> secuencia) {
		this.secuencia = secuencia;
	}

	public void actComboBox(String nuevaSec) {
		Boolean b = false;
		int cnt = 0;
		while (b == false && cnt < historial.size()) {
			if (historial.elementAt(cnt).toUpperCase().equals(nuevaSec)) {
				b = true;
			}
			cnt++;
		}
		if (!b) {
			historial.add(nuevaSec);
		}
	}
}
