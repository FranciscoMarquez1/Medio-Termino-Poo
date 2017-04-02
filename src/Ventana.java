import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana(){
		super("Calculo de Impuestos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Register(),BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ventana ventana = new Ventana();


	}

}
