package blastClaraV2;


import javax.management.Query;
import javax.swing.*;

import blast.BlastController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GUIBlast {
	private static final String dataBaseFile = new String("yeast.aa");
	private static final String dataBaseIndexes = new String("yeast.aa.indexs");

	private static Runnable buscar = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			JFrame frame = new JFrame("búsqueda BLAST");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			Config1 t = new Config1();
			Config2 p = new Config2();
			JSplitPane configs = new JSplitPane(JSplitPane.VERTICAL_SPLIT, t, p);
			configs.setDividerSize(3);

			Busqueda busqueda = new Busqueda();

			Resultados resultado = new Resultados();

			ListenerBusc l = new ListenerBusc(t, p, busqueda, resultado);

			frame.add(configs, BorderLayout.WEST);
			frame.add(busqueda, BorderLayout.CENTER);
			frame.add(resultado, BorderLayout.SOUTH);

			busqueda.getBusc().addActionListener(l);

			frame.pack();
			frame.setVisible(true);
			
			/*
			 * JPanel config1 = new JPanel(); JPanel config2 = new JPanel(); JPanel busqueda
			 * = new JPanel(); JPanel resultado = new JPanel();
			 * 
			 * // elementos JLabel tipo = new JLabel("Tipo de datos"); JLabel porcentaje =
			 * new JLabel("Porcentaje"); JRadioButton prot = new JRadioButton("proteína",
			 * true); JRadioButton nuc = new JRadioButton("nucleótido"); ButtonGroup agrupar
			 * = new ButtonGroup(); agrupar.add(prot); agrupar.add(nuc); JTextField
			 * numPorcenjate = new JTextField(5);
			 * 
			 * JButton busc = new JButton("Buscar"); Vector<String> historial = new
			 * Vector<String>(); JComboBox secuencia = new JComboBox(historial);
			 * 
			 * secuencia.setEditable(true);
			 * 
			 * JTextArea text = new JTextArea(20, 50); JScrollPane devuelve = new
			 * JScrollPane(text); JLabel tResultados = new JLabel("Resultados:");
			 * 
			 * // para el actionListener
			 * 
			 * char t; if (prot.isSelected()) { t = 'p'; } else { t = 'n'; }
			 * 
			 * String b = (String) secuencia.getSelectedItem(); busc.addActionListener(new
			 * ActionListener() {
			 * 
			 * public void actionPerformed(ActionEvent e) { // TODO Auto-generated method
			 * stub
			 * 
			 * try { BlastController bCnt = new BlastController();
			 * historial.add(secuencia.getSelectedItem().toString());
			 * text.setText(bCnt.blastQuery(t, dataBaseFile, dataBaseIndexes,
			 * Float.parseFloat(numPorcenjate.getText()),
			 * secuencia.getSelectedItem().toString()));
			 * 
			 * } catch (Exception excepcion) { // TODO: handle exception
			 * System.out.println("Error: " + excepcion.toString()); }
			 * 
			 * }
			 * 
			 * });
			 */
			// busc.addActionListener(new ListenerBusc(t,
			// Float.parseFloat(numPorcenjate.getText()), b, frame));

			// elegir tipo
			/*
			 * config1.add(tipo); config1.add(prot); config1.add(nuc);
			 * 
			 * // elegir porcentaje config2.add(porcentaje); config2.add(numPorcenjate);
			 * 
			 * // juntar configuraciones
			 * 
			 * JSplitPane configs = new JSplitPane(JSplitPane.VERTICAL_SPLIT, config1,
			 * config2); configs.setDividerSize(0);
			 * 
			 * // busqueda busqueda.add(secuencia); busqueda.add(busc);
			 * 
			 * resultado.add(tResultados); resultado.add(devuelve);
			 */

		}
	};

	public static void main(String[] args) {
		SwingUtilities.invokeLater(buscar);

	}

}
