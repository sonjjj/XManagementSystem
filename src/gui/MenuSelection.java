package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame= frame; // 나의 프레임에 넘어온 프레임 넣어줌
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton b1 = new JButton("Add player");
		JButton b2 = new JButton("View Player");
		JButton b3 = new JButton("Edit Player");
		JButton b4 = new JButton("Delete Player");
		JButton b5 = new JButton("Exit Program");
		
		b1.addActionListener(new ButtonAddListener(frame)); // Add
		b2.addActionListener(new ButtonViewListener(frame)); // View
		
		panel1.add(label);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}