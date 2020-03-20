package blastClaraV2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import blast.BlastController;

public class ListenerBusc implements ActionListener {

	private Config1 tiposBLAST;
	private Config2 porcBLAST;
	private Busqueda busquedaBLAST;
	private Resultados resultadosBLAST;
	private static String dataBaseFile = "yeast.aa";
	private static String dataBaseIndexes = "yeast.aa.indexs";

	public ListenerBusc(Config1 t, Config2 p, Busqueda bsc, Resultados res) {
		tiposBLAST = t;
		porcBLAST = p;
		busquedaBLAST = bsc;
		resultadosBLAST = res;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		try {
			blast.BlastController bCnt = new BlastController();

			resultadosBLAST.setDevuelve(bCnt.blastQuery(tiposBLAST.getSelectionGrupo(), dataBaseFile, dataBaseIndexes,
					porcBLAST.getNumPorcentaje(), busquedaBLAST.getSecuencia()));
			busquedaBLAST.actComboBox(busquedaBLAST.getSecuencia());

			// System.out.println(bCnt.blastQuery(tipo, "yeast.aa", "yeast.aa.indexs",
			// porcentaje, buscado));
		} catch (Exception excepcion) {
			// TODO: handle exception
			System.out.println("Error: " + excepcion.toString());
		}

	}

}
