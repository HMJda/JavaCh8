package chapter8;
import javax.swing.*;
import java.awt.*;

public class GridLayoutPr77 extends JFrame{
	
	public GridLayoutPr77() {
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++) {
			JButton button = new JButton(Integer.toString(i));	
			button.setOpaque(true);;
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutPr77();
	}

}
