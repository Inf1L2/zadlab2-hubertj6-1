/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaddom2;

/**
 *
 * @author wlasciciel
 */
import java.util.Scanner;
public class zad7 { 
 
private static void sort(int tab[]){
int a;
int z = 1;
while(z > 0){
z = 0;
for(int i=0; i<tab.length-1; i++){
if(tab[i]>tab[i+1]){
a = tab[i+1];
tab[i+1] = tab[i];
tab[i] = a;
z++;
}
}
}
for(int i=0; i<tab.length; i++){
System.out.print(tab[i]+" ");
}
}
 
public static void main(String[] args) {
int n;
Scanner in = new Scanner(System.in);
System.out.println("Podaj ilość elementów tablicy");
n = in.nextInt();
 
int[] tab = new int[n];
for(int i=0; i<tab.length; i++){
System.out.println("Podaj element tablicy:");
tab[i] = in.nextInt();
}
sort(tab);

}}
