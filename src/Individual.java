
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Individual extends JPanel implements MouseListener{
	private JTextField gastosMedicos,interesesCreditosHipotecarios,sueldoMensual,aguinaldo, primaVacacional, donativos, funerarios, primaGastosMedicos,aportacionRetiro,transporte,colegiaturas ;
	public Individual(){
		this.setPreferredSize(new Dimension(550,130));
		
		sueldoMensual=new JTextField("Sueldo Mensual",12);
		this.add(this.sueldoMensual);
		sueldoMensual.addMouseListener(this);
		aguinaldo=new JTextField("Aguinaldo",12);
		this.add(this.aguinaldo);
		aguinaldo.addMouseListener(this);
		primaVacacional=new JTextField("Prima Vacacional",12);
		this.add(this.primaVacacional);
		primaVacacional.addMouseListener(this);
		gastosMedicos=new JTextField("Gastos Medicos",12);
		this.add(this.gastosMedicos);
		gastosMedicos.addMouseListener(this);
		funerarios=new JTextField("Gastos Funerarios",12);
		this.add(this.funerarios);
		funerarios.addMouseListener(this);
		primaGastosMedicos=new JTextField("Prima seguro Medico",12);
		this.add(this.primaGastosMedicos);
		primaGastosMedicos.addMouseListener(this);
		interesesCreditosHipotecarios=new JTextField("Intereses Creditos Hipotecarios",12);
		this.add(this.interesesCreditosHipotecarios);
		interesesCreditosHipotecarios.addMouseListener(this);
		donativos=new JTextField("Donativos",12);
		this.add(this.donativos);
		donativos.addMouseListener(this);
		aportacionRetiro=new JTextField("Aportaciones de Retiro",12);
		this.add(this.aportacionRetiro);
		aportacionRetiro.addMouseListener(this);
		transporte=new JTextField("Gastos transporte escolar",12);
		this.add(this.transporte);
		transporte.addMouseListener(this);
		colegiaturas=new JTextField("Colegiaturas",12);
		this.add(this.colegiaturas);
		colegiaturas.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
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
		if(e.getSource()==gastosMedicos && gastosMedicos.getText().equals("Gastos Medicos")){
			gastosMedicos.setText("");
		}
		else if(e.getSource()==interesesCreditosHipotecarios && interesesCreditosHipotecarios.getText().equals("Intereses Creditos Hipotecarios")){
			interesesCreditosHipotecarios.setText("");
		}
		else if(e.getSource()==sueldoMensual && sueldoMensual.getText().equals("Sueldo Mensual")){
			sueldoMensual.setText("");
		}
		else if(e.getSource()==aguinaldo && aguinaldo.getText().equals("Aguinaldo")){
			aguinaldo.setText("");
		}
		else if(e.getSource()==primaVacacional && primaVacacional.getText().equals("Prima Vacacional")){
			primaVacacional.setText("");
		}
		else if(e.getSource()==donativos && donativos.getText().equals("Donativos")){
			donativos.setText("");
		}
		else if(e.getSource()==primaGastosMedicos && primaGastosMedicos.getText().equals("Prima seguro Medico")){
			primaGastosMedicos.setText("");
		}
		else if(e.getSource()==funerarios && funerarios.getText().equals("Gastos Funerarios")){
			funerarios.setText("");
		}
		else if(e.getSource()==aportacionRetiro && aportacionRetiro.getText().equals("Aportaciones de Retiro")){
			aportacionRetiro.setText("");
		}
		else if(e.getSource()==transporte && transporte.getText().equals("Gastos transporte escolar")){
			transporte.setText("");
		}
		else if(e.getSource()==colegiaturas && colegiaturas.getText().equals("Colegiaturas")){
			colegiaturas.setText("");
		}
		else {
			
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==gastosMedicos && gastosMedicos.getText().equals("")){
			gastosMedicos.setText("Gastos Medicos");
		}
		else if(e.getSource()==interesesCreditosHipotecarios && interesesCreditosHipotecarios.getText().equals("") ){
			interesesCreditosHipotecarios.setText("Intereses Creditos Hipotecarios");
		}
		else if(e.getSource()==sueldoMensual && sueldoMensual.getText().equals("")){
			sueldoMensual.setText("Sueldo Mensual");
		}
		else if(e.getSource()==aguinaldo && aguinaldo.getText().equals("")){
			aguinaldo.setText("Aguinaldo");
		}
		else if(e.getSource()==primaVacacional && primaVacacional.getText().equals("")){
			primaVacacional.setText("Prima Vacacional");
		}
		else if(e.getSource()==donativos && donativos.getText().equals("")){
			donativos.setText("Donativos");
		}
		else if(e.getSource()==primaGastosMedicos && primaGastosMedicos.getText().equals("")){
			primaGastosMedicos.setText("Prima seguro Medico");
		}
		else if(e.getSource()==funerarios && funerarios.getText().equals("")){
			funerarios.setText("Gastos Funerarios");
		}
		else if(e.getSource()==aportacionRetiro && aportacionRetiro.getText().equals("")){
			aportacionRetiro.setText("Aportaciones de Retiro");
		}
		else if(e.getSource()==transporte && transporte.getText().equals("")){
			transporte.setText("Gastos transporte escolar");
		}
		else if(e.getSource()==colegiaturas && colegiaturas.getText().equals("")){
			colegiaturas.setText("Colegiaturas");
		}
		else {
			
		}
		
	}
}
