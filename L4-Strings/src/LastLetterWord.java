import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */
/*
The Plan:
1.Get input - three words
2.Isolate the last three letters of ANY word
3.Combine the last three of three words
4.Output
 */


    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter word 3: ");

    JOptionPane.showMessageDialog(null, getLastThree(word1) + getLastThree(word2) + getLastThree(word3));

    System.exit(0);
    }

    public static String getLastThree(String word){
       return word.substring(word.length()-3);
    }


}
