package Zen;

public class Rectangle extends ZenShape {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this(x, y, width, height, null);
	}
	
	public Rectangle(int x, int y, int width, int height, String color) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setColor(color);
	}

	public void draw() {
		Zen.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
