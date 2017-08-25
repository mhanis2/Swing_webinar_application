package sk.mapa.hello;

import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	private static final long serialVersionUID = 6027799752916481422L;

	public HelloFrame() {
		add(new HelloWorldComponent());
		pack();
	}

}
