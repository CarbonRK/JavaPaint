package PaintApp;


/**
 * 
 * @author Kostek
 * @version 0.0
 * Wzorzec dla ka�dego narz�dzia. Nie bierze udzia�u w dzia�aniu programu, ze wzgl�du na problemy w implementacji.
 * Z braku czasu ich nie rozwi�za�em i musia�em rozwi�za� to dodaj�c metody rysuj�ce do klasy PaintingPanel
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
