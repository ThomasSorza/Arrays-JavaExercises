package search;

public class Busqueda{
    public int busquedaBinaria(int [] arr, int sNum){

        int start = 0;
        int end = arr.length-1;
        int center = (start+end) / 2;
        boolean ind = false;

        while(start <= end && !ind){
            center = (start+end)/2;

            if(arr[center] == sNum)
                ind = true;
            else{
                if(arr[center] < sNum)
                    start = center +1;
                else
                    end = center - 1;
            }
        }
        if(ind)
            return 0;
        return -1;
    }
}
