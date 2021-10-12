import javax.swing.JOptionPane;

public class GUIinput {
 
    public static void main(String[] args) {
        //input
    
        String input = JOptionPane.showInputDialog("Enter Your Name: ");
        String string = JOptionPane.showInputDialog(null, "Enter your name: ", "Welcome", JOptionPane.QUESTION_MESSAGE);
                
        //output
        System.out.println("Welcome ");
        
    }
}
