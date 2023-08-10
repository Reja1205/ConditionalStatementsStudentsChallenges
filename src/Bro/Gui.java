package Bro;

import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name");// Joptionpane always take string value
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"I am "+age+" Years old");
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"Your are "+height+" CM tall");



    }
}
