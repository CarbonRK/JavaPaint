package PaintApp;

import javax.swing.SwingUtilities;


/**
 * @author Kostek
 * @version 0.0
 */

/** G��wna klasa programu */
public class Main {

	/** Metoda statyczna wywo�uj�ca okno programu za pomoc� metody Runnable */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Window(1024, 1024, "Paint");
			
			}
		});
		
	}

}


