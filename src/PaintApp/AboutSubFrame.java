package PaintApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/** 
 * 
 * @author Kostek
 * Klasa odpowiedzialna za utworzenie wyskakuj¹cego okna "O programie"
 *
 */
public class AboutSubFrame extends JFrame {
	
	public AboutSubFrame(int width, int height, String title) throws IOException {
		
		JFrame about = new JFrame(title);
		JPanel helpPanel = new JPanel();
		JLabel helpLabel = new JLabel();
		JLabel helpText = new JLabel();
		helpPanel.setBackground(Color.GRAY);
		
		InputStream is = new FileInputStream("pomoc.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		
		while(line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}
		
		String fileAsString = sb.toString();
		System.out.println(fileAsString);
		/*BufferedReader br = new BufferedReader(new FileReader("pomoc.txt"));
		String line = br.readLine();
		ArrayList<String> listOfStrings = new ArrayList<>();
		listOf*/
		
		
		about.setPreferredSize(new Dimension(width, height));
		about.setResizable(false);
		about.setLocationRelativeTo(null);
		about.setDefaultCloseOperation(DISPOSE_ON_CLOSE);;
		about.setMinimumSize(new Dimension(400, 400));
		about.setVisible(true);
		about.add(helpPanel);
		
		helpLabel.setFont(new Font("Arial", 1, 30));
		helpLabel.setText("Pomocna pomoc");
		
		helpText.setFont(new Font("Arial", 1, 10));
		helpText.setText(fileAsString);
		helpPanel.add(helpLabel);
		helpPanel.add(helpText);
		repaint();
		

		
	}
	

}
