import java.util.Random;

public class IvertTriangular {
    public static void main(String[] args) {
        Random r = new Random();
        int m[][] = new int [5][5];
        int sumT = 0;
        int sumL = 0;
        int[] top = new int[10];
        int[] low = new int[10];

        System.out.println("Matrix: ");
        for(int i = 0; i<m.length; i++){//compleated the array with randoms 1-10
            for(int j = 0; j<m[0].length; j++){
                m[i][j] = r.nextInt(10 - 0);
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" "); //printed
        }
        /*The sum of the index (i+j) must be 
        less than the length of the matrix to
        get the top triangular*/
        int k= 0;
        int z = 0;
        int n = m.length-1;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if((i+j) < n){
                    sumT+=m[i][j];
                    top[k] = m[i][j];
                    k++; 
                }
                else if((i+j) > n){ //Lower triangular: 
                    sumL += m[i][j];
                    low[z] = m[i][j];
                    z++;
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
            for(int i=0; i<low.length; i++){
                System.out.print(low[i] + " ");
            }
        }else{
            System.out.println("Top triangular: ");
            for(int i=0; i<top.length; i++){
                System.out.print(top[i] + " ");
            }
            System.out.println("Lower triangular: ");
            for(int i=0; i<low.length; i++){
                System.out.print(low[i] + " ");
            }
        }     
    }
}
