/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaddom2;

import java.util.Scanner;

/**
 *
 * @author wlasciciel
 */
public class zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] tablica = new double[10];
        double c;
        int b,f,h;
        int l=9;
        System.out.println("Podaj dziesięć liczb: ");
            for(int i =0; i < 10; i++){
                h=i+1;
                Scanner odc = new Scanner(System.in);
                System.out.println("Podaj "+h+ " liczbe: ");
                c = odc.nextDouble();
                 tablica[i] = c;}
                            Scanner odcz = new Scanner(System.in);

                 
           
       
        do {
             System.out.println("wybierz jaka czynność ma zostać wykonana:\n 1 by Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n 2 by Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n 3 by Wyświetlanie elementów o nieparzystych indeksach.\n 4 by Wyświetlanie elementów o parzystych indeksach.\n 5 by zakończyć działąnie ");
             b = odcz.nextInt();
            if(b==1){
                for(int g=0; g<10;g++)
             {System.out.println(tablica[g]+" ");}
            }
            else if (b==2){
                for(int g=0; g<10;g++)
             {
                 l=l-g;
                 System.out.println(tablica[l]+" ");}}
                else if (b==3){
                for(int g=0; g<10;g++)
                    {
                        if (g%2 != 0)
                   {System.out.println(tablica[g]+" ");}
                    }}
            else if (b==4) 
            {for(int g=0; g<10;g++)
                    {
                        if (g%2 == 0)
                   {System.out.println(tablica[g]+" ");}}}
  
} while ( b==5 );
      
    }
    
}

