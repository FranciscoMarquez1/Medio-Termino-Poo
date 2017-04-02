
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grupal extends JPanel{
	private JButton btArchivo;
	private JTextField tfArchivo;
	private JFileChooser fc;
	public Grupal(Register re){
		super();
		this.setPreferredSize(new Dimension(550,130));
		this.tfArchivo=new JTextField(24);
		this.btArchivo=new JButton("Selecciona un archivo");
		this.btArchivo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int res=fc.showOpenDialog(re);
				if(res==JFileChooser.APPROVE_OPTION){
					String archivo=fc.getSelectedFile().toString();
					System.out.println(archivo);
					tfArchivo.setText(archivo);
					BufferedReader bf;
					try {
						bf = new BufferedReader(new FileReader(archivo));
						String line=bf.readLine();
						
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		this.add(this.tfArchivo);
		this.add(this.btArchivo);
		
		this.fc=new JFileChooser("/Users/sergioalvarado/Desktop/poo");
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
}
