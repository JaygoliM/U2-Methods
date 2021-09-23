import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    The Plan:
    1.Get the input - a word with a p
    2.Isolate or find the FIRST p
    3.Isolate three letters after p
    4.Output
     */
public static void main(String[] args) {

String word = JOptionPane.showInputDialog("Enter a word with a P");

JOptionPane.showMessageDialog(null, getPs(word));


}

public static String getPs(String word){
int pIndex = word.indexOf('p');

return word.substring(pIndex, pIndex + 4);

}

}
