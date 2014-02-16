package Zen;

public class Circle extends ZenShape {
	private int diameter;
	
	public Circle(int x, int y, int diameter) {
		this(x, y, diameter, null);
	}
	
	public Circle(int x, int y, int diameter, String color) {
		setX(x);
		setY(y);
		setColor(color);
		this.setDiameter(diameter);
	}

	public void draw() {
		Zen.fillOval(getX() - getDiameter() / 2, getY() - getDiameter() / 2, getDiameter(), getDiameter());
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}
