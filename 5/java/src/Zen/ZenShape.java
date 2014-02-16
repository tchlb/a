package Zen;

public abstract class ZenShape {
	private int x, y;
	private String color;
	
	public abstract void draw();
	
	public void colorAndDraw() {
		if (color != null)
			Zen.setColor(color);
		this.draw();
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void changePosition(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void changeX(int amount) {
		this.x += amount;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void changeY(int amount) {
		this.y += amount;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
