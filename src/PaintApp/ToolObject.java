package PaintApp;


/**
 * 
 * @author Kostek
 * @version 0.0
 * Wzorzec dla ka¿dego narzêdzia. Nie bierze udzia³u w dzia³aniu programu, ze wzglêdu na problemy w implementacji.
 * Z braku czasu ich nie rozwi¹za³em i musia³em rozwi¹zaæ to dodaj¹c metody rysuj¹ce do klasy PaintingPanel
 * 
 */
public abstract class ToolObject {
	
	protected int posX, posY;
	protected Tool_ID id;
	protected int size;
	
	ToolObject(int posX, int posY, int size, Tool_ID id){
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		this.id = id;
	}
	
	//public abstract void paint(Graphics g);

	public void paint() {
		
		
	}

}
