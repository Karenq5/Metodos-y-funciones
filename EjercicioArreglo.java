package uspg;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArreglo {
    
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
   public void menú(){
       while (true) {
           Scanner op  = new Scanner(System.in);
           System.out.println("Menú Principal");
           System.out.println("1. Llenar aleatoriamente");
           System.out.println("2. Ordenar ascendentemente");
           System.out.println("3. Ordenar Descendentemente");
           System.out.println("4. Mostrar");
           int opciones = op.nextInt();
           
           switch(opciones) {

                case 1: 
                    System.out.println("Los números aleatorios son:");
                    llenarArreglo();
                   
                    break;   

                case 2: 
                   System.out.println("Orden Ascendente");
                   ordenarAsc();
                    
                    break;  
                    
                case 3: 
                    System.out.println("Orden Descendente");
                    ordenarDesc();
                   
                    break;  
                    
                case 4: 
                    System.out.println("Mostrar");
                    imprimirArreglo();
                    break ;            
                       
                case 5:
                    System.out.println("Ingrese una opción");
                    break;
                default: 
                    System.out.println("----------------Please select the correct option----------------");
                break;        
            } 
          }
           
       }
   

    public void llenarArreglo()
    {
        int [] Aleatorio = new int [100];
        
        for (int num = 0; num < 100; num++) {
        Aleatorio [num] = (int)(Math.random()* 101); 
            System.out.println(Aleatorio [num]);
        }
    }
    
    public void ordenarAsc ()
    {
        
            int numeros = 0;
        
            while(numeros <= 100){
                
                al.add(numeros++);
                
            }
            
            System.out.print(al);
            
        }
        
                
    
    
    public void ordenarDesc () 
    {
       
            int numeros = 100;
        
            while(numeros >= 0){
                
                al2.add(numeros--);        
            }         
            System.out.print(al2);
            
        }
     
    
    public void imprimirArreglo ()
    {
        System.out.println("imprimri");   
    }

    public static void main(String[] args) {
        EjercicioArreglo EA = new EjercicioArreglo();
        EA.menú();
    }
    
}
