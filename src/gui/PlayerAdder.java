package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PlayerAdder extends JFrame {

	public PlayerAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//  ID
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		//  NAME
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		//  POINT
		JLabel labelPoint = new JLabel("Point: ", JLabel.TRAILING);
		JTextField fieldPoint = new JTextField(10);
		labelPoint.setLabelFor(fieldPoint);
		panel.add(labelPoint);
		panel.add(fieldPoint);
		
		//  TEAM
		JLabel labelTeam = new JLabel("Team: ", JLabel.TRAILING);
		JTextField fieldTeam = new JTextField(10);
		labelTeam.setLabelFor(fieldTeam);
		panel.add(labelTeam);
		panel.add(fieldTeam);
		
		//  버튼들
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6); // 첫번째숫자 - 2열 표시
		
		this.setSize(300, 300);
		this.setContentPane(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
