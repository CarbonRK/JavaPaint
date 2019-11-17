package PaintApp;

import javax.swing.SwingUtilities;


/**
 * @author Kostek
 * @version 0.0
 */

/** G³ówna klasa programu */
public class Main {

	/** Metoda statyczna wywo³uj¹ca okno programu za pomoc¹ metody Runnable */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Window(1024, 1024, "Paint");
			
			}
		});
		
	}

}


