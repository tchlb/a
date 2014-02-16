package Zen;

public abstract class ZenGame {
	
	private int width = 500, height = 500, fps = 30;
	
	public ZenGame() {
		this.run();
	}
	
	private boolean running = false;
	
	public abstract void setup();
	public abstract void loop();
	
	public void setFPS(int fps) {
		this.fps = fps;
	}
	
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void run() {
		if (! running) {
			Zen.create(this.width, this.height);
			running = true;
			setup();
			while (true) {
				loop();
				Zen.buffer(1000 / this.fps);
			}
		}
	}
}
