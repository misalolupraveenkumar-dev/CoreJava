package info.com.general;

public class KeyWordsAndExpression {

	public static void main(String[] args) {

		int calculateScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score: " + calculateScore);

	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		int finalScore = score;

		if (gameOver) {
			
			finalScore += (levelCompleted * bonus);
		}

		return finalScore;
	}
	
	

	
	
}
