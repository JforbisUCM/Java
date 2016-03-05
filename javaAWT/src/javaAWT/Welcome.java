package javaAWT;


import java.awt.*;
import java.awt.event.*;

public class Welcome {
	public static void main(String args[]) {
		final Frame f;
		f = new Frame();
		f.setLayout( new GridLayout(3, 1) );

		Label l;
		l = new Label("Welcome to my", Label.CENTER);
		f.add(l);
		l = new Label("Java class!", Label.CENTER);
		f.add(l);

		Button b = new Button("Bye!");
		f.add(b);

		class ByeListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				System.exit(0);
			}
		}
		b.addActionListener( new ByeListener() );
		f.setSize(250, 150);
		f.show();
	}
}
