package main;
import search.Busqueda;

public class Main {
   public static void main(String[] args) {
      Busqueda busqueda = new Busqueda();
      int [] arr = {1,2,3,4,5,8,9};
      int pos = busqueda.busquedaBinaria(arr, 1);
      if(pos >= -1){
         System.out.println("Encontrado en la posición: " + pos);
      }else{
         System.out.println("No encontrado:");
      }
   } 
}
