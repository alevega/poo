import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import controlador.LoginControlador;

public class main {

	public static void main(String[] args) {
		
		try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacDarkLaf");
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
		
		SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
            	new LoginControlador();
            }
        });
	}

}
