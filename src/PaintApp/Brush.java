package PaintApp;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 
 * @author Kostek
 * @version 0.0
 * zamys³ by³ taki aby ka¿de narzêdzie by³o osobn¹ klas¹, ale napotka³em problemy przy implementacji, a z braku czasu ich nie rozwi¹za³em i musia³em rozwi¹zaæ to dodaj¹c metody rysuj¹ce do klasy PaintingPanel.
 * 
 */
public class Brush extends ToolObject {
	
   public BufferedImage canvas;
   public PaintingPanel panel;
   protected int size = 20;
   protected int posX;
   protected int posY;

	Brush(int posX, int posY, int size, Tool_ID id ){
		
		super(posX, posY, size, id);
		//this.canvas = canvas;
	}


	@Override
	public void paint() {
		Graphics2D g2d = canvas.createGraphics();
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setPaint(Color.RED);
		g2d.fillRect(posX, posY, size, size);
		g2d.dispose();
		 
	}
}
