package PaintApp;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPicker extends JFrame{

	public ColorPicker(int width, int height, String title) {
		
		JFrame colorPicker = new JFrame(title);
		JPanel colorPickerPanel = new JPanel();
		
		colorPicker.setPreferredSize(new Dimension(width, height));
		colorPicker.setResizable(false);
		colorPicker.setLocationRelativeTo(null);
		colorPicker.setDefaultCloseOperation(DISPOSE_ON_CLOSE);;
		colorPicker.setMinimumSize(new Dimension(400, 400));
		colorPicker.setVisible(true);
		colorPicker.add(colorPickerPanel);
	}
}
