package sk.maha.swingtext;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.WindowConstants;

public class MyFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MyFrame frame = new MyFrame();
			frame.setSize(800, 600);
			frame.setTitle("MyFrameDemo");
			frame.setVisible(true);
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLocation(100, 100);
			// or
			frame.setLocation(new Point(500, 500));

		});
	}
}
