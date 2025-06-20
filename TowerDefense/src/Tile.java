
public class Tile {
	
	//instance variables
	private boolean containsPiece;
	private int width;
	private int x, y;
	private int bg;
	
	//CONSTRUCTORS
	public Tile () {
		this.containsPiece = false;
	}
	
	public Tile(int x, int y, int width) {
		this.width = width;
		this.x = x;
		this.y = y;
	}
	
	public Tile(int x, int y, int width, boolean containsPiece) {
		this.width = width;
		this.x = x;
		this.y = y;
		this.containsPiece = containsPiece;
	}
	
	public Tile(int x, int y, int width, boolean containsPiece, int bg) {
		this.width = width;
		this.x = x;
		this.y = y;
		this.containsPiece = containsPiece;
		this.bg = bg;
	}

}
