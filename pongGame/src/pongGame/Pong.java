package pongGame;

import java.awt.Component;

import javax.swing.JFrame;

public class Pong extends JFrame {
	private static int WIDTH = 800;
	private static int HEIGHT = 620;

	public Pong() {

		super("Pong");

		setSize(WIDTH, HEIGHT);

		PongArea thePong = new PongArea(this);
		((Component) thePong).setFocusable(true);

		getContentPane().add(thePong);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Pong();
	}
}