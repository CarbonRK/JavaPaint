package PaintApp;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/** 
 * 
 * @author Kostek
 * Klasa tworz¹ca lewy pasek z narzêdziami
 *
 */
public class LeftToolbar extends JToolBar implements ActionListener, ChangeListener{
	
	 JToolBar jtb;
	 /** utworzenie zmiennych statycznych dla Slidera odpowiadaj¹cego za zmianê rozmiaru narzêdzia */
	 static final int min_size = 1;
	 static final int max_size = 50;
	 static final int size_init = 10;

	/** Konstruktor lewego paska */
	LeftToolbar(){
		
		/** Tworzy pasek narzêdzi */
		JToolBar jtb = new JToolBar("Narzêdzia", VERTICAL);
		
		
		jtb.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.jtb = jtb;
		jtb.setFloatable(false);
		//jtb.setPreferredSize(new Dimension(50,50));
		/** Wczytuje obrazki dla przycisków */
		
		ImageIcon brush = new ImageIcon("brush.gif");
		ImageIcon pencil = new ImageIcon("pencil.gif");
		ImageIcon rubber = new ImageIcon("rubber.gif");
		ImageIcon select = new ImageIcon("select.gif");
		
		/** Tworzy przyciski paska narzêdzi */
		JButton jbtnBrush = new JButton(brush);
		jbtnBrush.setActionCommand("Pedzel");
		jbtnBrush.setToolTipText("Pêdzel maluje");
		
		jbtnBrush.addActionListener(this);

		
		JButton jbtnPencil = new JButton(pencil);
		jbtnPencil.setActionCommand("Olowek");
		jbtnPencil.setToolTipText("O³owek rysuje");
		jbtnPencil.addActionListener(this);

		
		JButton jbtnRubber = new JButton(rubber);
		jbtnRubber.setActionCommand("Gumka");
		jbtnRubber.setToolTipText("Gumka zmazuje");
		jbtnRubber.addActionListener(this);

		
		JButton jbtnSelect = new JButton(select);
		jbtnSelect.setActionCommand("Zaznacz");
		jbtnSelect.setToolTipText("Zaznacz zaznacza");
		
		/**dodaje przyciski do paska narzêdzi i ustawia ich rozmieszczenie w GridBagLayout 
		 * Slider powoduje problemy z rozmiarem tego paska z narzêdziami, jeszcze tego nie rozwi¹za³em*/
		
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		jtb.add(jbtnBrush, c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.FIRST_LINE_START;

		jtb.add(jbtnPencil, c);
	
		c.gridx = 0;
		c.gridy = 1;
		//c.anchor = GridBagConstraints.FIRST_LINE_START;
		jtb.add(jbtnRubber, c);
		
		
		c.weighty = 0.1;
		c.gridx = 1;
		c.gridy = 1;
		jtb.add(jbtnSelect, c);
		
		/** Tworzenie suwaka zmianiaj¹cego wielkoœæ narzêdzia */
		JSlider sizer = new JSlider(JSlider.HORIZONTAL, min_size, max_size, size_init);
		sizer.addChangeListener((ChangeListener) this);
		
		sizer.setMinorTickSpacing(1);
		sizer.setMajorTickSpacing(10);
		sizer.setPaintTicks(true);
		sizer.setPaintLabels(true);
		//sizer.setPreferredSize(new Dimension(110, 10));
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.NORTHWEST;
		c.gridwidth = 40;
		c.gridx = 0;
		c.gridy = 2;
		jtb.add(sizer, c);
		
		/** JPanel na którym widaæ na ¿ywo rodzaj narzêdzia i jego rozmiar
		 * jeszcze nie dzia³a
		 */
		JPanel toolView = new JPanel();
		toolView.setPreferredSize(new Dimension(100, 100));
		toolView.setBackground(Color.WHITE);
		
		
		c.fill = GridBagConstraints.CENTER;
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.CENTER;
		c.gridy = 3;
		c.weighty = 1.0;
		jtb.add(toolView, c);
		
		
		
		
	}
	/** Obs³uga zdarzeñ przy klikniêciu w dany przycisk */
	public void actionPerformed(ActionEvent ae) {
		//pobranie ³añcucha polecenia
		String comStr = ae.getActionCommand();
		if(comStr.equals("Pedzel")) 
			{
				PaintingPanel.id = Tool_ID.Brush;
				System.out.println("Pedzel");
			}
		if(comStr.equals("Olowek")) 
			{
				PaintingPanel.id = Tool_ID.Pencil;
				System.out.println("O³ówek");
			}
		if(comStr.equals("Gumka")) 
			{
				PaintingPanel.id = Tool_ID.Rubber;
				System.out.println("Gumka");
			}
		
		//jtb.setText("Wybrano " + comStr);
	}
	
	/** Obs³uga zdarzeñ dla suwaka */
	public void stateChanged(ChangeEvent ce) {
		
		JSlider source = (JSlider)ce.getSource();
		if(!source.getValueIsAdjusting())
		{
			PaintingPanel.size = (int)source.getValue();
			System.out.println("Size: " + PaintingPanel.size);
		}
		
	}
}
