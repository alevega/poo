package modelo;
import javax.swing.JOptionPane;

public class Dialogo {
	
	/*
	 * Una ventana de diálogo es una subventana independiente destinada a transmitir un aviso temporal 
	 * aparte de la ventana principal de la aplicación Swing. La mayoría de los diálogos presentan un 
	 * mensaje de error o una advertencia al usuario, pero pueden presentar imágenes, árboles de directorios 
	 * o prácticamente cualquier cosa compatible con la aplicación Swing principal que los administra.
	 * */
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
	
	public Dialogo() {
		//Esto es un ejemplo, no necesariamente tienen que crear una clase dialogo.
	}
	
	public void dialogPredeterminado() {
		JOptionPane.showMessageDialog(null, "Los huevos no deben ser verdes");
	}
	
	public void dialogPersonalizado() {
		JOptionPane.showMessageDialog(null, "Los huevos no deben ser verdes","titulo personalizado", JOptionPane.ERROR_MESSAGE);
		/*
		 * JOptionPane.WARNING_MESSAGE Icono de advertencia
		 * JOptionPane.ERROR_MESSAGE Icono de error
		 * JOptionPane.PLAIN_MESSAGE Sin icono
		 * */
	}

	public void dialogoConOpciones() {
		Object[] options = {"Si, por favor", "No, gracias", "tercera opcion"};
		int n = JOptionPane.showOptionDialog(null, "Que eres ir a comer?", "Una pregunta", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
	}
	
	public void dailogoConInput() {
		JOptionPane.showInputDialog(
                null,
                "ejemplo",
                "sin titulo", 
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null);
	}
	
	
}
