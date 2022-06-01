package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PlayerManager;

public class WindowFrame extends JFrame {
	
	PlayerManager playerManager;
	
	MenuSelection menuselection;
	PlayerAdder playeradder;
	PlayerViewer playerviewer;
	
	public WindowFrame(PlayerManager playerManager2) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.playerManager = playerManager2;
		menuselection = new MenuSelection(this);
		playeradder = new PlayerAdder(this);
		playerviewer = new PlayerViewer(this, this.playerManager);
		
		
		this.add(menuselection); // 여기서 추가하는 객체 실행
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PlayerAdder getPlayeradder() {
		return playeradder;
	}

	public void setPlayeradder(PlayerAdder playeradder) {
		this.playeradder = playeradder;
	}

	public PlayerViewer getPlayerviewer() {
		return playerviewer;
	}

	public void setPlayerviewer(PlayerViewer playerviewer) {
		this.playerviewer = playerviewer;
	}

}
