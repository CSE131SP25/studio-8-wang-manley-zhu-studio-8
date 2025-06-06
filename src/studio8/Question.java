package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Question {
	
	//Scanner in = new Scanner(System.in);
	
	private String prompt;
	private String answer;
	private int points;
	
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 */
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;	
		this.answer= answer;
		this.points = points;
		}
	
	/**
	 * Getter method for the prompts possible
	 * @return String prompts
	 */
	public String getPrompt() {
		return prompt;
	}
	
	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Question one = new Question("What is 2+2","4", 10);
		Question two = new Question("What is 2+3","5", 10);
	
		two.displayPrompt();	
	}
}



/*public void checkAnswer(String givenAnswer) {
	if(answer.equals(givenAnswer)) { //String comparison
		 System.out.println(this.points);
	} else {
		System.out.println("0");
	}
}

public static void main(String[] args) {
	Question one = new Question("What is 2+2","4", 10);
	Question two = new Question("What is 2+3","5", 10);

	two.displayPrompt();	
	two.checkAnswer("5");
}*/