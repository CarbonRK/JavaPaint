package PaintApp;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

/**
 * 
 * @author Kostek
 * Klasa tworz�ca g�owne okno i przechowuj�ca poszeg�lne komponenty
 * 
 */
public class Window extends JFrame{
	
	/** 
	 * 
	 * Konstruktor przyjmuj�cy jako parametry wysoko��, szeroko�� oraz tytu� okna 
	 * @param width okre�la szeroko�� okna
	 * @param height okre�la wysoko�� okna
	 * @param title nadaje tytu� okna
	 * */
	public Window(int width, int height,String title) {
		
		/** Utworzenie kontenera przechowuj�cego poszczeg�lne komponenty */
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(750, 550));
		//frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		Menu menu = new Menu();
		frame.setJMenuBar(menu.jmb);
		ColorPanel colorPanel = new ColorPanel();
		frame.add(colorPanel.colorJtb ,BorderLayout.SOUTH);
		LeftToolbar leftToolbar = new LeftToolbar();
		frame.add(leftToolbar.jtb, BorderLayout.WEST);
		//frame.pack();
		
		PaintingPanel painting = new PaintingPanel();
		frame.add(painting);
		
		frame.setVisible(true);
		
		
		
		
	}

}
