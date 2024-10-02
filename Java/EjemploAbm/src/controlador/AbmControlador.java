package controlador;

import java.util.ArrayList;

import modelo.UsuarioModel;
import vistas.AbmView;

public class AbmControlador {
	
	private AbmView vista;
	private UsuarioModel modelo;
	
	public AbmControlador() {
		this.vista = new AbmView();
		this.modelo = new UsuarioModel();
		this.iniciarTabla();
		this.vista.setVisible(true);
	}
	
	private void iniciarTabla() {
		ArrayList<Object []> array  = this.modelo.allUsuarios();
		for(Object [] row : array) {
			this.vista.getModeloTabla().addRow(row);
		}
	}

}
