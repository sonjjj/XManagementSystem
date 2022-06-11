package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exceptions.IDException;
import manager.PlayerManager;
import player.PlayerInput;
import player.PlayerPosition;
import player.WingspikerPlayer;

public class PlayerAddListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldPoint;
	JTextField fieldTeam;

	PlayerManager playerManager;
	
	public PlayerAddListener(JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldPoint, 
			JTextField fieldTeam, PlayerManager playerManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldPoint = fieldPoint;
		this.fieldTeam = fieldTeam;
		this.playerManager = playerManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		PlayerInput player = new WingspikerPlayer(PlayerPosition.Wingspiker);
		try { // ID에 예외처리한 부분
			
			player.setId(Integer.parseInt(fieldID.getText()));
			player.setName(fieldName.getText());
			player.setPoint(Integer.parseInt(fieldPoint.getText()));
			player.setTeam(fieldTeam.getText());
			playerManager.addPlayer(player);
			putObject(playerManager, "playermanager.ser");
			player.printInfo();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IDException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void putObject(PlayerManager playerManager, String filename) {
		// 저장할 객체 가져옴
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(playerManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}