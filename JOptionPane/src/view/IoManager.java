package view;

import java.util.*;

import javax.swing.JOptionPane;

public class IoManager {
    private Scanner input;
    //Método constructor(se llama igual que la clase):
    public IoManager() {
        input = new Scanner(System.in);
    }
    //String
    public String readString(String message) {
        this.showMessage(message);
        return input.next();
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
    public void showGraphicMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public String readGraphicMessage(String message){
        JOptionPane.showMessageDialog(null, message);
        return (JOptionPane.showInputDialog(message));
    }
    //Short
    public short readShort(String message) {
        this.showMessage(message);
        return input.nextShort();
    }
    public short readGraphicShort(String message){
        JOptionPane.showInputDialog(message);
        return Short.parseShort(JOptionPane.showInputDialog(message));
    }
    //int
    public int readInt(String message) {
        this.showMessage(message);
        return input.nextInt();
    }
    public int readGraphicInt(String message){
        JOptionPane.showMessageDialog(null, Integer.parseInt(message));
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    //double 
    public double readDouble(String message) {
        this.showMessage(message);
        return input.nextDouble();
    }
    public double readGraphicDouble(String message){
        JOptionPane.showInputDialog(message);
        return Double.parseDouble(message);
    }
}
