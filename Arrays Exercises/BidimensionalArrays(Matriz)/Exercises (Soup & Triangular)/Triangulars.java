import java.util.*;

public class Triangulars{
    public static void main(String[] args) {
        Random r = new Random();

        //square array 5x5
        int m[][] = new int [5][5];
        int sumT = 0;
        int sumL = 0;
        int[] top = new int[10];
        int[] lower = new int[10];

        System.out.println("Matrix: ");
        for(int i = 0; i<m.length; i++){//compleated the array with randoms 1-10
            for(int j = 0; j<m[0].length; j++){
                m[i][j] = r.nextInt(10 - 0);
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" "); //printed
        }
        //sum the triangulars
        int z = 0;
        int k = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0 ; j < m[0].length; j++){
                if(j>i){ // Top triangular(principal diag)
                    sumT += m[i][j];
                    top[z] = m[i][j];
                    z++;
                }
                if(i>j){ // Lower triangular
                    sumL += m[i][j];
                    lower[k] = m[i][j];
                    k++;
                }
            }
        }
        System.out.println(" ");//print sums
        System.out.println("Sum Top triangular : " + sumT);
        System.out.println("Sum Lower triangular : " + sumL);

        //eveluate greater than
        if(sumT > sumL){
            System.out.println("Top triangular: ");
            for(int i=0; i<top.length; i++){
                System.out.print(top[i] + " ");
            }
        }else if(sumL > sumT){
            System.out.println("Lower triangular: ");
            for(int i=0; i<lower.length; i++){
                System.out.print(lower[i] + " ");
            }
        }else{
            System.out.println("Top triangular: ");
            for(int i=0; i<top.length; i++){
                System.out.print(top[i] + " ");
            }
            System.out.println("Lower triangular: ");
            for(int i=0; i<lower.length; i++){
                System.out.print(lower[i] + " ");
            }
        }     
    }
}