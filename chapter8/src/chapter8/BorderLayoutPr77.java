package chapter8;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutPr77 extends JFrame {
	public BorderLayoutPr77() {
		setTitle("BorderLayoutPr77 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(50, 5));
		contentPane.add(new JButton("CENTER"),BorderLayout.CENTER);
		contentPane.add(new JButton("North"),BorderLayout.NORTH);
		contentPane.add(new JButton("South"),BorderLayout.SOUTH);
		contentPane.add(new JButton("East"),BorderLayout.EAST);
		contentPane.add(new JButton("West"),BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutPr77();
	}

}
