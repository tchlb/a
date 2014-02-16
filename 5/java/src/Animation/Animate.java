package Animation;

import Zen.*;

public class Animate extends ZenGame {
	
	Circle blob;

	public void setup() {
		blob = new Circle(300, 300, 10, "blue");
	}

	public void loop() {
		Zen.setBackground("black");
		
		int d = blob.getDiameter();
		if (Zen.isKeyPressed("right")) {
			blob.setDiameter(d + 5);
		}
		if (Zen.isKeyPressed("left")) {
			blob.setDiameter(d - 5);
		}
		Zen.draw(blob);
	}
}
