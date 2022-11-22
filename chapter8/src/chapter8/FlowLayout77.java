package chapter8;
import javax.swing.*;
import java.awt.*;

public class FlowLayout77 extends JFrame {
	public FlowLayout77() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 15));
		for(int i = 1;i<16;i++) {
			contentPane.add(new JButton("버튼"+i));
		}
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayout77();
	}

}
