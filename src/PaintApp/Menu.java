package PaintApp;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import PaintApp.Window;

/**
 * 
 * @author Kostek
 * Klasa tworz�ca g�rny pasek menu
 *
 */
public class Menu extends JMenuBar implements ActionListener {
	
	JLabel menuStrip;
	JMenuBar jmb;
	
	Menu(/*int width, int height,String title*/){
		//super(width, height, title);
		
		//this.menuStrip = menuStrip;
		//this.frame = frame;
		//JFrame menu = new JFrame();
		//setLayout(new FlowLayout());
		
		menuStrip = new JLabel();
		
		JMenuBar jmb = new JMenuBar();
		//this.menuStrip = menuStrip;
		this.jmb = jmb;
		
		/** Utworzenie menu Plik */
		JMenu jmFile = new JMenu("Plik");
		
		jmFile.setMnemonic(KeyEvent.VK_P);
		
		JMenuItem jmiNew = new JMenuItem("Nowy");
		JMenuItem jmiOpen = new JMenuItem("Otw�rz", KeyEvent.VK_O);
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiClose = new JMenuItem("Zamknij", KeyEvent.VK_M);
		jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiSave = new JMenuItem("Zapisz", KeyEvent.VK_S);
		jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiExit = new JMenuItem("Zako�cz", KeyEvent.VK_K);
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiClose);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		/** Dodaje ca�e menu Plik do paska menu */
		jmb.add(jmFile);
		
		
		/** Utworzenie menu Opcje */
		JMenu jmOptions = new JMenu("Opcje");
		
		JMenuItem jmiClear = new JMenuItem("Wyczy��");
		JMenu jmColors = new JMenu("Kolory");
		JMenuItem jmiRed = new JMenuItem("Czerwony");
		jmColors.add(jmiRed);
		
		jmOptions.add(jmiClear);
		jmOptions.add(jmColors);
		/** Dodaje ca�e menu Opcje do paska menu */
		jmb.add(jmOptions);
		
		/** Tworzy menu pomoc */
		JMenu jmHelp = new JMenu("Pomoc");
		JMenuItem jmiAbout = new JMenuItem("O programie", KeyEvent.VK_F1);
		jmiAbout.setAccelerator(KeyStroke.getKeyStroke("F1"));
		
		jmHelp.add(jmiAbout);
	
		/** Dodaje ca�e menu pomoc do paska menu */
		jmb.add(jmHelp);
		
		/** Dodaje wszystkie obiekty nas�uchuj�ce */
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiClose.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiClear.addActionListener(this);
		jmiRed.addActionListener(this);
		jmiAbout.addActionListener(this);
		

	}

	/** Obs�uga zdarze� w menu dzi�ki ActionListener */
	public void actionPerformed(ActionEvent ae) {
		//pobranie �a�cucha polecenia
		String comStr = ae.getActionCommand();
		if(comStr.equals("Zako�cz")) System.exit(0);
		if(comStr.equals("Wyczy��"))
		{
			 //PaintingPanel.g.setColor(Color.WHITE);
			 //PaintingPanel.g.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
			 Graphics g = PaintingPanel.canvas.getGraphics();
		     g.setColor(Color.WHITE);
		     g.fillRect(0,0,PaintingPanel.canvas.getWidth(),PaintingPanel.canvas.getHeight());
		     g.setColor(Color.BLACK);
			 g.drawRect(0, 0, PaintingPanel.canvas.getWidth()-1, PaintingPanel.canvas.getHeight()-1);
			 repaint();			 
		     System.out.println("Wyczyszczono pole edycji");
		}
		if(comStr.equals("O programie")) 
		{
			
			try {
				new AboutSubFrame(400, 400, "O programie");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		menuStrip.setText("Wybrano " + comStr);

		
	}
	
	/*public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Menu();
			}
		});
	}
	
	public JLabel getMenuStrip()
	{
		return menuStrip;
	}
	
	public JMenuBar getMenuBar()
	{
		return jmb;
	}
*/
	

}
