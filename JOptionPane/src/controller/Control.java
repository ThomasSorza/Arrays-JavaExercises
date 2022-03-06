package controller;

import view.*;
import model.*;

public class Control {
    IoManager io;

    public Control(){
        io = new IoManager();
    }

    public void init() { 
        Model model = new Model();
        int[] vector = {10,8,7,20,35};
        int[][] matriz = {{10,8,7,20}, {310,6,7,60}, {12,8,45,20}, {13,81,76,2}};
        model.setVector(vector);
        model.setMatriz(matriz);
        // io.showGraphicMessage(model.getStringVector());
       // io.showGraphicMessage(model.getDiagonal1());
        io.showGraphicMessage(model.getDiagonal2());
        io.showGraphicMessage(model.getStringMatriz());
    }
}
