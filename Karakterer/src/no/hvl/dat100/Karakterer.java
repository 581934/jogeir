package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Karakterer {

    public static void main(String[] args) {
        while (true) {

            String score = showInputDialog("Please enter your score: ");
            if (score.equals("x")) break;
            int numScore = Integer.parseInt(score);


            if (numScore > 100 || numScore < 0) {
                showMessageDialog(null, "Not a valid score, please retry (0-100)");
                continue;
            }

            char grade;

            if (numScore >= 90) {
                grade = 'A';
            } else if (numScore >= 80)
                grade = 'B';
            else if (numScore >= 60)
                grade = 'C';
            else if (numScore >= 50)
                grade = 'D';
            else if (numScore >= 40)
                grade = 'E';
            else
                grade = 'F';

            showMessageDialog(null, "Your grade is: " + grade);
        }


    }


}