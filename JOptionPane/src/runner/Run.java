package runner;

import controller.Control;
import view.IoManager;

public class Run {
    public static void main(String[] args) {
       Control control = new Control();
       control.init();
    }
}