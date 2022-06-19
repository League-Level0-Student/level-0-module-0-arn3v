package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		String input = JOptionPane.showInputDialog("Is pizza the best food in the world?");
		if (input.equals("yes")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You are correct!");
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
	}

}

