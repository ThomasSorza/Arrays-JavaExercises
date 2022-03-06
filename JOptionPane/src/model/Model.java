package model;

public class Model {
    private int matriz[][];
    private int vector [];

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public int[] getVector() {
        return vector;
    }
    public String getStringVector() {
        String Svector = "";
        for(int i=0; i < vector.length; i++){
            Svector += vector[i]+ " ";
        }
        return Svector;
    }
    public String getStringMatriz(){
        String exit = "";
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[1].length; j++){
                exit += matriz[i][j] + " ";
            }
            exit += '\n';
        }
        return exit;
    }

    public String getDiagonal1(){
        String diag = "";
        for(int i=0; i < matriz.length; i++){
             diag += matriz[i][i] + " ";
        }
        return diag;
    }

    public String getDiagonal2(){
        String diag = "";
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[0].length; j++){
                if((i +j) == matriz.length+1)
                diag += matriz[i][j] + " ";
            }
        }
        return diag;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
}
