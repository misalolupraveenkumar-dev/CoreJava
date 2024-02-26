package info.com.general;

public class CalculateScoreExample {

	public static void main(String[] args) {

		displayHighList("Tim", 1500);
		displayHighList("John", 800);
		displayHighList("Marry", 500);
		displayHighList("Lilly", 80);
		displayHighList("Groot", 25);

	}

	public static void displayHighList(String name, int playerScore) {

		int calculateHighScorePosition = calculateHighScorePosition(playerScore);

		System.out.println(name + " : " + calculateHighScorePosition);

	}

	public static int calculateHighScorePosition(int playerScore) {
		
		int position = 4;

		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			position = 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			position = 3;
		}
	
		return position;

	}



}
