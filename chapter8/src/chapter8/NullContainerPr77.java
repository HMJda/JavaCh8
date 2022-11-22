package chapter8;

import javax.swing.*;
import java.awt.*;

public class NullContainerPr77 extends JFrame {
	public NullContainerPr77() {
		setTitle("NullContainerPr77 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		for(int i = 0;i<20;i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*220)+30;
			int y = (int)(Math.random()*220)+30;
			label.setLocation(x, y);
			label.setSize(20,20);
			label.setForeground(Color.magenta);
			contentPane.add(label);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerPr77();
	}

}
