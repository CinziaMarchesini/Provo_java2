
/**
 * Write a description of class Matrici here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class Matrici
{
    public static void main(String [] args){
        //dichiarazione
        int r, c, nr, nc;
        int m[][];
        //input
        do{
        nr=Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di righe >=2"));
        }while(nr<2);
        do{
        nc=Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di colonne >=2"));
        }while(nc<2);
        //allocare la matrice
        m = new int [nr][nc];
        //lettura della matrice
        for(r=0; r<nr; r++){
            for(c=0; c<nc; c++){
                m[r][c]=Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore intero nella matrice"));
            }
        }
        //output della matrice
         for(r=0; r<nr; r++){
            for(c=0; c<nc; c++){
                System.out.print("\t"+m[r][c]);
            }
            System.out.println();
            // Commento da parte di Luca Galli
            System.out.println("bau");
        }
                    
       
        
    }    
    
}
