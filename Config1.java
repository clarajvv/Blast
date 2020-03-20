package blastClaraV2;


import javax.swing.*;

public class Config1 extends JPanel {

	private JLabel tipo;
	private JRadioButton prot;
	private JRadioButton nuc;
	private ButtonGroup agrupar;

	public Config1() {
		tipo = new JLabel("Tipo de datos");
		prot = new JRadioButton("proteína", true);
		nuc = new JRadioButton("nucleótido");
		agrupar = new ButtonGroup();
		agrupar.add(prot);
		agrupar.add(nuc);
		
		add(tipo);
		add(prot);
		add(nuc);

	}

	public char getSelectionGrupo() {
		char t;
		if (prot.isSelected()) {
			t = 'p';
		} else {
			t = 'n';
		}
		return t;
	}

}
