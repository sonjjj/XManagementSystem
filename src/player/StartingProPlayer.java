package player;

import java.util.Scanner;

public abstract class StartingProPlayer extends Player {

	public StartingProPlayer(PlayerPosition position) {
		super(position);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);
	// 용도가 다르게 쓰이기 때문에 abstract > 클래스도 바꿔줌

	@Override
	public abstract void printInfo();

	public void setPlayerPointwithQ(Scanner input) {
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N')
		{
			System.out.print("? Are you on the starting list ?");
			answer1 = input.next().charAt(0);
			
			if (answer1 == 'y' || answer1 == 'Y') {
				setPlayerPoint(input);
				break;
			}
			
			else if (answer1 == 'n' || answer1 == 'N') {
				this.setPoint(0);
				break;
			}
			
			else {
			}
		}
	}
	
	public void setPlayerTeamwithQ(Scanner input) {
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 != 'N')
		{
			System.out.print("? Do you work for a primere v-league ?");
			answer2 = input.next().charAt(0);
			
			if (answer2 == 'y' || answer2 == 'Y') {
				setPlayerTeam(input);
				break;
			}
			
			else if (answer2 == 'n' || answer2 == 'N') {
				this.setTeam("-businessteam-");
				break;
			}
			
			else {
			}
		}
	}
}
