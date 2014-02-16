package Zen;

public class Shape extends ZenShape {
	private ZenShape[] components;
	
	public Shape(ZenShape... components) {
		this.components = components;
		if (components.length > 0) {
			this.setX(components[0].getX());
			this.setY(components[0].getY());
		}
	}
	
	@Override
	public void draw() {
		for (ZenShape component : components)
			component.colorAndDraw();
	}
}
