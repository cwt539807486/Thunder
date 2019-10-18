package com.leidian;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class GameFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GameCanvas canvas = new GameCanvas();

	public GameFrame() {
		canvas.setFocusable(true);
		canvas.requestFocus();
		this.add(canvas, BorderLayout.CENTER);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.setSize(400, 630);
		
		
		frame.setIconImage(Resources.tombPNG);
		frame.setTitle("java雷电游戏");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
