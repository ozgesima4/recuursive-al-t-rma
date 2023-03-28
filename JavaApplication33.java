
package javaapplication33;

import java.util.Scanner;

public class JavaApplication33 {
 
    static void azaltma(int sayi,int temp){
        if(sayi<=0){
            cogaltma(sayi, temp);
            
        }else{
            System.out.print(sayi+" ");
            azaltma(sayi-5, temp);
        } 
    }
  
    static void cogaltma(int sayi,int temp){
        if(temp >= sayi){
            System.out.print(sayi+" ");
            cogaltma(sayi+5, temp);
       
    }}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("sayi:");
        int sayi=sc.nextInt();
        int temp=sayi;
        azaltma(sayi, temp);
      
    }
    
}
