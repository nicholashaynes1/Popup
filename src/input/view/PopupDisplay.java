package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output
 * @author nhay7834
 *
 */
public class PopupDisplay 
{
	/**
	 * Provides a popup box for asking a question and allows the user to enter an answer
	 * Returns the user response as strings.
	 * @param input The supplied question in the popup.
	 * @return The user typed response to the question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
/**
 * This puts the users answer into a string
 * @param input This is the users answer.
 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}

}

