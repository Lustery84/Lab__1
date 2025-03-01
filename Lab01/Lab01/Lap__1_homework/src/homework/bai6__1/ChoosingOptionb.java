package homework.bai6__1;

import javax.swing.JOptionPane;

public class ChoosingOptionb {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don’t"};
        int option = JOptionPane.showOptionDialog(null, 
                "Do you want to change to the first class ticket?", 
                "Custom Options", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]);
        String message = (option == JOptionPane.YES_OPTION) ? "I do" : "I don’t";
        JOptionPane.showMessageDialog(null, "You've chosen: " + message);

        System.exit(0);
    }
}