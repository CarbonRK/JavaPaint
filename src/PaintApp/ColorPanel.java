package PaintApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/** 
 * 
 * @author Kostek
 * Klasa tworz¹ca dolny pasek z wyborem kolorów rysowania
 *
 */
public class ColorPanel extends JToolBar implements ActionListener{
	
	JToolBar colorJtb;
	/** Konstruktor tego paska */
	ColorPanel(){
	JToolBar colorJtb = new JToolBar("Wybór kolorów", HORIZONTAL);
	
	colorJtb.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	this.colorJtb = colorJtb;
	colorJtb.setFloatable(false);
	
	/** wczytanie obrazków o kolorach odpowiadaj¹cych kolorom mo¿liwych do wyboru z pakietu Java.AWT */
	ImageIcon black = new ImageIcon("colors/black.gif");
	ImageIcon blue = new ImageIcon("colors/blue.gif");
	ImageIcon cyan = new ImageIcon("colors/cyan.gif");
	ImageIcon darkGray = new ImageIcon("colors/dark_gray.gif");
	ImageIcon green = new ImageIcon("colors/green.gif");
	ImageIcon lightGray = new ImageIcon("colors/light_gray.gif");
	ImageIcon magenta = new ImageIcon("colors/magenta.gif");
	ImageIcon orange = new ImageIcon("colors/orange.gif");
	ImageIcon pink = new ImageIcon("colors/pink.gif");
	ImageIcon red = new ImageIcon("colors/red.gif");
	ImageIcon white = new ImageIcon("colors/white.gif");
	ImageIcon yellow = new ImageIcon("colors/yellow.gif");
	
	ImageIcon RGB = new ImageIcon("colors/RGB.png");
	Image img = RGB.getImage();
	Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
	RGB = new ImageIcon(newimg);
	
	/** utworzenie poszczególnych przycisków, nadanie im ikon koloru, oraz obiektów nas³uchuj¹cych */
	JButton jbtnBlack = new JButton(black);
	jbtnBlack.setActionCommand("Black");
	jbtnBlack.addActionListener(this);
	
	JButton jbtnBlue= new JButton(blue);
	jbtnBlue.setActionCommand("Blue");
	jbtnBlue.addActionListener(this);
	
	JButton jbtnCyan = new JButton(cyan);
	jbtnCyan.setActionCommand("Cyan");
	jbtnCyan.addActionListener(this);
	
	JButton jbtnDark_Gray = new JButton(darkGray);
	jbtnDark_Gray.setActionCommand("Dark_Gray");
	jbtnDark_Gray.addActionListener(this);
	
	JButton jbtnGreen = new JButton(green);
	jbtnGreen.setActionCommand("Green");
	jbtnGreen.addActionListener(this);
	
	JButton jbtnLight_Gray = new JButton(lightGray);
	jbtnLight_Gray.setActionCommand("Light_Gray");
	jbtnLight_Gray.addActionListener(this);
	
	JButton jbtnMagenta = new JButton(magenta);
	jbtnMagenta.setActionCommand("Magenta");
	jbtnMagenta.addActionListener(this);
	
	JButton jbtnOrange = new JButton(orange);
	jbtnOrange.setActionCommand("Orange");
	jbtnOrange.addActionListener(this);
	
	JButton jbtnPink = new JButton(pink);
	jbtnPink.setActionCommand("Pink");
	jbtnPink.addActionListener(this);
	
	JButton jbtnRed = new JButton(red);
	jbtnRed.setActionCommand("Red");
	jbtnRed.addActionListener(this);
	
	JButton jbtnWhite = new JButton(white);
	jbtnWhite.setActionCommand("White");
	jbtnWhite.addActionListener(this);
	
	JButton jbtnYellow = new JButton(yellow);
	jbtnYellow.setActionCommand("Yellow");
	jbtnYellow.addActionListener(this);
	
	JButton jbtnRGB = new JButton(RGB);
	jbtnRGB.setActionCommand("RGB");
	jbtnRGB.addActionListener(this);
	
	//dodane w trakcie oddawania
	/*JButton jbtnR = new JButton(new String("R"));
	jbtnR.setActionCommand("redd");
	jbtnR.addActionListener(this);
	
	JButton jbtnG = new JButton(new String("G"));
	jbtnG.setActionCommand("greenn");
	jbtnG.addActionListener(this);
	
	JButton jbtnB = new JButton(new String("B"));
	jbtnB.setActionCommand("bluee");
	jbtnB.addActionListener(this);
*/

	/** Rozmieszczenie i dodanie przycisków na panelu */
	
	c.gridx = 0;
	c.gridy = 0;
	colorJtb.add(jbtnBlack, c);
	
	c.gridx = 0;
	c.gridy = 1;
	colorJtb.add(jbtnWhite, c);
	
	c.gridx = 1;
	c.gridy = 0;
	colorJtb.add(jbtnBlue, c);
	
	c.gridx = 1;
	c.gridy = 1;
	colorJtb.add(jbtnCyan, c);
	
	c.gridx = 2;
	c.gridy = 0;
	colorJtb.add(jbtnDark_Gray, c);
	
	c.gridx = 2;
	c.gridy = 1;
	colorJtb.add(jbtnGreen, c);
	
	c.gridx = 3;
	c.gridy = 0;
	colorJtb.add(jbtnLight_Gray, c);
	
	c.gridx = 3;
	c.gridy = 1;
	colorJtb.add(jbtnMagenta, c);
	
	c.gridx = 4;
	c.gridy = 0;
	colorJtb.add(jbtnOrange, c);

	c.gridx = 4;
	c.gridy = 1;
	colorJtb.add(jbtnPink, c);
	
	c.gridx = 5;
	c.gridy = 0;
	colorJtb.add(jbtnRed, c);
	
	c.gridx = 5;
	c.gridy = 1;
	colorJtb.add(jbtnYellow, c);
	
	c.gridx = 6;
	c.gridy = 0;
	colorJtb.add(jbtnRGB, c);
	
	//dodane w trakcie oddawania
	/*c.gridx = 7;
	c.gridy = 0;
	colorJtb.add(jbtnR, c);
	
	c.gridx = 8;
	c.gridy = 0;
	colorJtb.add(jbtnG, c);
	
	c.gridx = 9;
	c.gridy = 0;
	colorJtb.add(jbtnB, c);
*/
	
			
	}
	/** Obs³uga zdarzeñ zwi¹zanych z wyborem koloru rysowania */
	public void actionPerformed(ActionEvent ae) {
		
		String comStr = ae.getActionCommand();
		if(comStr.equals("Black")) 
			{
				PaintingPanel.color = Color.BLACK;
				System.out.println("Black");
				PaintingPanel.semafor = 0;

			}
		
		if(comStr.equals("Blue")) 
		{
			PaintingPanel.color = Color.BLUE;
			System.out.println("Blue");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Cyan")) 
		{
			PaintingPanel.color = Color.CYAN;
			System.out.println("Cyan");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Dark_Gray")) 
		{
			PaintingPanel.color = Color.DARK_GRAY;
			System.out.println("Dark grey");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Green")) 
		{
			PaintingPanel.color = Color.GREEN;
			System.out.println("Green");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Light_Gray")) 
		{
			PaintingPanel.color = Color.LIGHT_GRAY;
			System.out.println("Light gray");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Magenta")) 
		{
			PaintingPanel.color = Color.MAGENTA;
			System.out.println("Magenta");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Orange")) 
		{
			PaintingPanel.color = Color.ORANGE;
			System.out.println("Orange");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Pink")) 
		{
			PaintingPanel.color = Color.PINK;
			System.out.println("Pink");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Red")) 
		{
			PaintingPanel.color = Color.RED;
			System.out.println("Red");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("Yellow")) 
		{
			PaintingPanel.color = Color.YELLOW;
			System.out.println("Yellow");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("White")) 
		{
			PaintingPanel.color = Color.WHITE;
			System.out.println("White");
			PaintingPanel.semafor = 0;
		}
		
		if(comStr.equals("RGB"))
		{
			new ColorPicker(400, 400, "Color Picker");
			System.out.println("Color Picker");
		}
		/*
		//dodane w trakcie oddawania
		
		if(comStr.equals("redd")) 
		{
			PaintingPanel.redd = PaintingPanel.redd - 10;
			System.out.println("Red=Red-10 " + PaintingPanel.redd);
			PaintingPanel.semafor = 1;
		}
		
		if(comStr.equals("greenn")) 
		{
			PaintingPanel.greenn = PaintingPanel.greenn - 10;
			System.out.println("Green=Green-10 " + PaintingPanel.greenn);
			PaintingPanel.semafor = 1;
		}
		
		if(comStr.equals("bluee")) 
		{
			PaintingPanel.bluee = PaintingPanel.bluee - 10;
			System.out.println("Blue=Blue-10 " + PaintingPanel.bluee);
			PaintingPanel.semafor = 1;
		}
		*/
		
	}
}
