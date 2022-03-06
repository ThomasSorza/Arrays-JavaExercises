import java.util.*;

public class MatrixEx{
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sn = new Scanner(System.in); 
        
        //i = filas //j = columnas
        /* 1----------- 3x3 ----------
        int matriz[][] = new int [3][3]; 
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] =(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }*/


        /* 2------------------5x(x)-.-------------------
        System.out.println("Escriba un numero de columnas:");
        int columnas = sn.nextInt();
        int matriz[][] = new int [5][columnas];
        for(int i= 0; i<matriz.length; i++){
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j] = r.nextInt(0 - 11);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("");
        }*/

        /* 3 ------------Suma matrices----------------------
        int matriz1[][] = new int [3][3];
        int matriz2[][] = new int [3][3]; 
        int res[][] = new int[3][3];
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[0].length; j++){
                matriz1[i][j] =(i*matriz1.length)+(j+1);
                matriz2[i][j] =(i*matriz1.length)+(j+3);
                res[i][j] = (matriz1[i][j] + matriz2[i][j]);
                System.out.print(res[i][j] + " ");
            }
            System.out.println(" ");
        }
        */


        /* 4------------- matriz magica----------
        int matriz[][] = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };
        int f[] = new int[3];
        int c[] = new int[3];
        int d = 0;
        int d2 = 0;

        for(int i =0; i<matriz.length; i++){
            for(int j =0; j<matriz.length; j++){
                f[i]+=matriz[i][j];
                c[i]+=matriz[j][i];
                if(i==j){
                    d+=matriz[i][j];
                }
                if(i+j == matriz.length-1){
                    d2 += matriz[i][j];
                }
            }
        }
        System.out.println(d2);
        System.out.println(d);
        int i =0;
        boolean perfect = true;
        while(perfect && i<matriz.length){
            if(f[i]!=c[i]){
                perfect = false;
            }
            i++;
            if(d != c[0]){
                perfect=false;
            }
            if(d2 != c[0]){
                perfect=false;
            }
        }
        if(perfect){
            System.out.println("verdadero");
        }
        if(!perfect){
            System.out.println("false");
        }
        */

        /*5------------- diag secundaria ---------
        int matriz[][] = {
            {1,1,8},
            {1,5,1}, //15 diag secundaria
            {2,1,1}
        };
        int d = 0;
        for(int i =0; i<matriz.length; i++){
            for(int j =0; j<matriz.length; j++){
               if(i+j == matriz.length-1)
                    d+= matriz[i][j];
            }
        }
        System.out.println(d);*/


        //Rotar 90°
        int matriz[][] = {
            {2,8,6}, //   3   4   2
            {4,5,4}, //   8   5   8
            {3,8,0}  //   0   4   6
        };
        int rotated[][] = new int[3][3];
        int z = matriz.length-1;
        for(int i = 0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                rotated[i][j] = matriz[j][z];
                System.out.print(rotated[i][j] + " ");
            }
            z--;
            System.out.println(" ");
        }













        int matriz1[][] = {
            {2,8,6}, 
            {4,5,4}, 
            {3,8,0}  
        };
        int matriz2[][] = {
            {2,8,6}, 
            {4,5,4}, 
            {3,8,0}  
        };
        int multi[][] = new int[3][3];
    }
}