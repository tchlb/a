package Zen;

public class Oval extends ZenShape {
	private int width, height;
	
	public Oval(int x, int y, int width, int height) {
		this(x, y, width, height, null);
	}
	
	public Oval(int x, int y, int width, int height, String color) {
		setX(x);
		setY(y);
		setColor(color);
		this.setWidth(width);
		this.setHeight(height);
	}

	public void draw() {
		Zen.fillOval(getX() - getWidth() / 2, getY() - getHeight() / 2, getWidth(), getHeight());
	}

	public void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
