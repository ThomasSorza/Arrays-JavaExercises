public class Soup {
    public static void main(String[] args) {
       char [][]soup={{'O','C','E','C','E','N','T','R','Q'},
                      {'S','O','S','A','O','X','R','E','T'},
                      {'E','M','A','S','A','D','O','C','E'},
                      {'Y','A','L','A','C','E','N','A','N'},
                      {'U','P','E','L','A','R','D','N','G'},
                      {'N','E','R','L','L','N','O','T','A'},
                      {'L','L','T','I','A','W','R','E','S'},
                      {'E','O','S','S','I','L','L','W','O'},
                      {'R','S','E','S','U','D','O','S','E'}
                      };
        String wds[] = {"ASADO", "SILLA", "ALACENA", "CASA", "ALTO"}; 
        String w ="";
        for(int i=0; i<wds.length; i++){
            w = wds[i];
        }
        //Horizontal 
        int izq = 0;
        for(int i = 0; i<soup.length; i++){
            for(int j=0; j<soup[0].length-w.length(); j++){
                String fullW = "";
                for(int k=0; k<w.length(); k++){
                    fullW+= soup[j][j+k];
                }
                if(fullW.equals(w)){
                    izq ++;
                }
            }
        }
        System.out.println(izq);

    }
}
