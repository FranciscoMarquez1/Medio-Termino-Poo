import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class Register extends JPanel implements MouseListener{
	private Image fondo0, fondo1,logo;
	static private JLabel i = new JLabel("Registro de datos Individual"), g=new JLabel("Registro de datos Grupal");
	
	
	public Register(){
		super();
		GridBagConstraints c = new GridBagConstraints();
		this.setPreferredSize(new Dimension(1200,750));
		this.setLayout(new GridBagLayout());
		this.fondo0=new ImageIcon("impuesto.png").getImage();
		this.fondo1=new ImageIcon("cerdito1.png").getImage();
		this.logo=new ImageIcon("LogoPOO.png").getImage();
		this.addMouseListener(this);
		this.setBackground(new Color(187,212,225));
		i.setFont(new Font("Courier", Font.BOLD, 35));
		
		i.setForeground(new Color(255, 255, 255));
		c.fill = GridBagConstraints.CENTER;
		c.gridx =1;
		c.gridy =0;
		this.add(i,c);
		c.gridx = 1;
		c.gridy = 1;
		this.add(new Individual(),c);

		c.gridx =1;
		c.gridy =3;
		g.setFont(new Font("Courier", Font.BOLD, 35));
		g.setForeground(new Color(255, 255, 255));
		this.add(g,c);
		c.gridx = 1;
		c.gridy = 4;
		this.add(new Grupal(this),c);
		
		
	
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(fondo0, 900,450,247,261, this);
		g.drawImage(fondo1, 250, this.getY()/2-50, 750, 750, this);
		g.drawImage(logo, 0, 0, 150, 150, this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(getMousePosition().getX()<150 && getMousePosition().getY()<150){
			System.out.println("HOLA");
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
