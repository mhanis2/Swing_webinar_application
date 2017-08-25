package sk.mapa.hello;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HelloFrameDemo {

	public static void main(String[] args) {


		JFrame frame = new HelloFrame();
		frame.setTitle("Hello World in Swing");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
