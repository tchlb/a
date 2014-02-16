package FlappyBird;

import Zen.*;

/**
 * 
 * @author techlab
 *
 */
public class FlappyBird extends ZenGame {
	
	// Variables in the game.
	int score = 0;
	boolean dead = false;
	
	// Objects in the game.
	Bird flappy;
	Pipe one;
	Pipe two;
	Pipe three;
	
	// Shapes in the game.
	Text scoreboard;
	
	/**
	 * Window setup goes here.
	 */
	public FlappyBird() {
		// Set the size of the window to 400 pixels by 600 pixels.
		setSize(400, 600);
		// Set to 30 FPS (frames per second).
		setFPS(30);
	}
	
	/**
	 * Set up the game logic.
	 */
	public void setup() {
		scoreboard = new Text("Score: 0");
		scoreboard.setPosition(100, 100);
	}

	/**
	 * The game logic that gets repeated every time step.
	 */
	public void loop() {
		Zen.setBackground("light blue");
		Zen.draw(scoreboard);
	}
	
}
