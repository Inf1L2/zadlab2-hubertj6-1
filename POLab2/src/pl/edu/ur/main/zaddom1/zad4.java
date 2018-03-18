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
public class zad4 {
     public static void main(String[] args) {
        double[] tab = new double[10];
        double c,wynik=0,wyniki=1,mmx;
        int b,f,h;
        int l=9;
        System.out.println("Podaj dziesięć liczb: ");
            for(int i =0; i < 10; i++){
                h=i+1;
                Scanner odczy = new Scanner(System.in);
                System.out.println("Podaj "+h+ " liczbe: ");
                c = odczy.nextDouble();
                 tab[i] = c;}
             Scanner odczyt = new Scanner(System.in);
    
do {
             System.out.println("wybierz jaka czynność ma zostać wykonana:\n 1 by oblicz sumę elementów tablicy.\n 2 by oblicz iloczyn elementów tablicy.\n 3 wyznacz wartość średnią.\n 4 by wyznacz wartość minimalną.\n 5 by wyznacz wartość maksymalną. \n 6 by zakończyć działąnie ");
             b = odczyt.nextInt();
            if(b==1){
                for(int g=0; g<10;g++)
             { wynik =(tab[g]+wynik);}
                 System.out.println(wynik);
            }
            else if (b==2){
                for(int g=0; g<10;g++)
             {
                 wyniki=wyniki*tab [g];}
                 System.out.println(wyniki);}
                else if (b==3){
                for(int g=0; g<10;g++)
                    {
                      wynik =(tab[g]+wynik);}
                   System.out.println(wynik/10);}    
            else if (b==4) 
            {   int g=0;
                mmx=tab[g];
                for( g=0; g<10;g++)
                    {
                        if (mmx<tab[g]) mmx=tab[g];}
                   {System.out.println(mmx);}}
            else if (b==5) 
            {   int g=0;
                mmx=tab[g];
                for( g=0; g<10;g++)
                    {
                        if (mmx>tab[g])mmx=tab[g];}
                   {System.out.println(mmx);}}
  
} while ( b==6 );
      
    }
    
}