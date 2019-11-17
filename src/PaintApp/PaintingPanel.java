package PaintApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

/** 
 * 
 * @author Kostek
 * Klasa odpowiadaj¹ca za utworzernie panelu umo¿liwiaj¹cego rysowanie 
 *
 */
public class PaintingPanel extends JPanel{
	
	//private ArrayList<> layers
	protected int posX;
	protected int posY;
	public static int size;
	public static Tool_ID id;
	public LeftToolbar toolbar;
	public Brush brush;
	protected Object oldX;
	protected Object oldY;
	public static BufferedImage canvas;
	public static Color color;
	public static int redd = 255;
	public static int greenn = 255;
	public static int bluee = 255;
	public static Color colorRGB;
	public static int semafor = 0;


	/** Konstruktor panelu */
	public PaintingPanel() {
		
		
		/** utworzenie obiektu typu BufferedImage i ustawienie jego pocz¹tkowych parametrów */
		canvas = new BufferedImage(600,400,BufferedImage.TYPE_INT_RGB);
		//dziêki temu dzia³¹ BufferedImage, nie wiem czemu tak to dzia³¹ :/
		JLabel canvasLabel = new JLabel(new ImageIcon(canvas));
		canvasLabel.setBackground(new Color(254, 58, 42));
        add(canvasLabel, null);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		size = 10;
		color = Color.BLACK;
		//colorRGB = new Color(redd, greenn, bluee);
		id = Tool_ID.Pencil;
		// ustawia pocz¹tkowe t³o
		Graphics g = canvas.getGraphics();
	    g.setColor(Color.WHITE);
	    g.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
	    g.setColor(Color.BLACK);
	    g.drawRect(0, 0, canvas.getWidth(), canvas.getHeight());
	    repaint();
		
		 
		/** Obs³uga myszy */
		canvasLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			
				 posX = e.getX();
			     posY = e.getY();
			     paint();
				System.out.println("Mouse pressed on x=" + e.getX() + ", y=" + e.getY());

			}
			public void mouseReleased(MouseEvent e) {
				repaint();
				System.out.println("Mouse released");
			}
			
			public void mouseEntered(MouseEvent e) {
				repaint();
				System.out.println("Mouse entered JPanel at x=" + e.getX() + ", y=" + e.getY());
			}
			public void MouseExited(MouseEvent e) {
				System.out.println("Mouse exited JPanel at x=" + e.getX() + ", y=" + e.getY());
			}
		});
		
		canvasLabel.addMouseMotionListener(new MouseMotionListener() {

			public void mouseDragged(MouseEvent e) {
				System.out.println("Mouse dragged on x=" + e.getX() + " , y=" + e.getY());
				
				 posX = e.getX();
			     posY = e.getY();
			     paint();
			     oldX = posX;
			     oldY = posY;
			     repaint();			       
			}
			
			public void mouseMoved(MouseEvent e) {
				
			}
			
			});
		
	}
	
	

	/** metoda odpowiadaj¹ca za umieszczanie kszta³tów na obiekcie canvas */ 
	public void paint() {
		//super.paintComponent(g);
		Graphics2D g2d = canvas.createGraphics();
			
			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			if(semafor == 0)
			{
			
				g2d.setPaint(color);
			}
			if(semafor == 1)
			{
				g2d.setPaint(new Color(redd, greenn, bluee));
			}
			
			if(id == Tool_ID.Brush)
			{
				g2d.fillRect((posX - ((int)size / 2)), (posY - ((int)size  / 2)), size, size);
			}
			
			if(id == Tool_ID.Pencil)
			{
				g2d.fillOval((posX - ((int)size / 2)), (posY - ((int)size  / 2)), size, size);
			}
			
			if(id == Tool_ID.Rubber)
			{
				g2d.setColor(Color.WHITE);
				g2d.fillRect((posX - ((int)size / 2)), (posY - ((int)size  / 2)), size, size);
			}
			
			//g2d.dispose();

	}
	
	/*public void test()
	{
		Graphics g = canvas.getGraphics();
		repaint();
	}*/
	

}
