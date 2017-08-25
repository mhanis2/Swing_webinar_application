package sk.mapa.hello;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {

	private static final long serialVersionUID = -873696277685097125L;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public HelloWorldComponent() {

	}

	@Override
	public void paintComponent(Graphics g) {
		int windowX = this.getWidth();
		int windowY = this.getHeight();
		FontMetrics fm = g.getFontMetrics();
		int stringWidth = fm.stringWidth("Hello world");
		int heightPosition = fm.getMaxAscent() + (windowY - (fm.getAscent() + fm.getMaxDescent())) / 2;

		g.drawString("Hello world", (windowX - stringWidth) / 2, heightPosition);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

}
