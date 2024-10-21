package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modelo.Cronometrar;
import Modelo.Cronometro;
import Modelo.Observable;
import Vista.CronometroVista;

public class CronometroController implements Cronometrar, ActionListener{
	
	private CronometroVista vista;
	private Observable observable;
	private Observable subObservable;
	private Cronometro tiempo;
	private Cronometro subtiempo;
	private Boolean secundario = false;
	private Integer fila;
	
	public CronometroController() {
		this.vista = new CronometroVista(this);
		this.vista.setVisible(true);
		this.fila = 0;
		
		this.vista.getBtn_parar().addActionListener(e->{
			String[] column = { "N°", "Tiempo", "Parcial" };
			this.vista.getDefTableModel().setDataVector(null, column);
			this.vista.getBtn_iniciar().setText("Iniciar");
			this.vista.getBtn_parar().setEnabled(false);
			if (secundario) {
				this.vista.getCronoPrincipal().setText("00:00:00");
				this.vista.getSubCrono().setText(null);
				this.subtiempo.stop();
				this.tiempo.stop();
				this.subtiempo.removeObserver(this);
				this.tiempo.removeObserver(this);
			} else {
				this.vista.getCronoPrincipal().setText("00:00:00");
				this.tiempo.stop();
				this.tiempo.removeObserver(this);
			}
		});
	}
	
	public void update() {
		if (this.tiempo.getHiloDeEjecucion().getName().equals("principal")) {
			this.vista.getCronoPrincipal().setText(this.observable.toString());
		}

		if (secundario == true) {
			this.vista.getSubCrono().setText(this.subObservable.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton boton = (JButton) e.getSource();
		System.out.println(boton.getText());
		if(boton.getText().equals("Iniciar")) {
			this.vista.getBtn_iniciar().setText("Parcial");
			this.vista.getBtn_parar().setEnabled(true);
			this.vista.getSubCrono().setText(null);
			this.tiempo = new Cronometro(0, 0, 0);
			this.observable = tiempo;
			this.observable.addObserver(this);
			tiempo.start();
			tiempo.getHiloDeEjecucion().setName("principal");
		}else {
			this.secundario = true;
			this.subtiempo = new Cronometro(0, 0, 0);
			this.subObservable = subtiempo;
			this.subObservable.addObserver(this);
			subtiempo.start();
			this.subtiempo.getHiloDeEjecucion().setName("secundario");
			if (fila >= 1) {
				Object[] rowData = { fila++, this.observable.toString(), this.vista.getSubCrono().getText() };
				this.vista.getDefTableModel().addRow(rowData);
			}
			
			fila++;
		}
	}

}
