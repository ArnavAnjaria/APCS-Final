package pongGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Paddle {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;

	public Paddle() {
		xPos = 10;
		yPos = 10;
		width = 20;
		height = 100;
	}

	public Paddle(int x, int y, int wid, int ht, int sp) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		speed = sp;
	}

	public void draw(Graphics Window) {
		Graphics2D g2 = (Graphics2D) Window;
		g2.setColor(Color.RED);
		Rectangle r = new Rectangle(xPos, yPos, width, height);
		g2.fill(r);
	}

	public void move(String dir) {

		if (dir.equals("UP")) {
			setyPos(getyPos() - speed);
		}
		if (dir.equals("DOWN")) {
			setyPos(getyPos() + speed);
		}
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

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}