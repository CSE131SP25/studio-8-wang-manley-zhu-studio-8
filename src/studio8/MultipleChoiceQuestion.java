package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	private String[] choices;
			
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		
		super(prompt,answer,points);
		this.choices = choices;
		
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		super.displayPrompt();
		//System.out.println(getPrompt() + "(" + getPoints() + " points)");
		int j = 1;
		for(int i = 0; i<choices.length; i++) {
		System.out.println(j+ ". " + choices[i]);
			j++;
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
	//	MultipleChoiceQuestion one = new MultipleChoiceQuestion("What is 5+5","10",10, choices[]);
	}

}
