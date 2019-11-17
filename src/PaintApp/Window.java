package PaintApp;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

/**
 * 
 * @author Kostek
 * Klasa tworz¹ca g³owne okno i przechowuj¹ca poszególne komponenty
 * 
 */
public class Window extends JFrame{
	
	/** 
	 * 
	 * Konstruktor przyjmuj¹cy jako parametry wysokoœæ, szerokoœæ oraz tytu³ okna 
	 * @param width okreœla szerokoœæ okna
	 * @param height okreœla wysokoœæ okna
	 * @param title nadaje tytu³ okna
	 * */
	public Window(int width, int height,String title) {
		
		/** Utworzenie kontenera przechowuj¹cego poszczególne komponenty */
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
