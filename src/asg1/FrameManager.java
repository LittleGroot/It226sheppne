package asg1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FrameManager extends JFrame {

	public static void main(String[] args) {
		
		//Frame
		JFrame Frame1 = new JFrame("Hello World");
		Frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension max = new Dimension(1000,1000);
		Frame1.setSize(max);
		Frame1.setLayout(new GridLayout(8,8));
		int[][] in = new int[8][8];
		JPanel[][] PanelManager = new JPanel[8][8];
		
		boolean isBlack = true;
	
		for(int i = 0;i<8;i++)
		{
			for(int j = 0;j<8;j++)
			{
				PanelManager[i][j] = new JPanel();
				if(isBlack)
				{
				PanelManager[i][j].setBackground(Color.BLACK);
				}
				Frame1.add(PanelManager[i][j]);
				isBlack = !isBlack;
			}
			isBlack = !isBlack;
		}
		
		Frame1.setVisible(true);
		
		
	}

}
