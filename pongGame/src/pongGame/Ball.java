package pongGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xspeed;
	private int yspeed;

	public Ball() {
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
		xspeed = 10;
		yspeed = 10;
	}

	public Ball(int x, int y, int wid, int ht, int xsp, int ysp) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		xspeed = xsp;
		yspeed = ysp;
	}

	public void moveBall(int x, int y) {
		setxPos(getxPos() + xspeed);
		setyPos(getyPos() + yspeed);
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

	public int getXspeed() {
		return xspeed;
	}

	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}

	public int getYspeed() {
		return yspeed;
	}

	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}

	public void draw(Graphics Window) {
		Graphics2D g2 = (Graphics2D) Window;
		g2.setColor(Color.GRAY);
		g2.fillOval(xPos, yPos, width, height);
	}
}