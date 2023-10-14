package org.example;

import javax.swing.*;

//******************************************10UN CEVABi*****************************************************
public class odev10 {
    public static void main(String[] args) {
        int n=0; //asal carpan dizisinin indexini ayarlamak icin
        int a = Integer.parseInt(JOptionPane.showInputDialog("bir a sayisi giriniz"));
        int[] asalcarpan= new int[a];    //asal carpanlari depolamak icin array
        for(int i=2;i<=a;i++){
            while(a%i==0) {       //asal carpan bulma dongusu
                asalcarpan[n] =i;
                a=a/i;
                n++;
            }
        }
        for(int i=0;i<n;i++) {    //cikti almak icin
            System.out.print(asalcarpan[i]+" ");

        }

    }
}
