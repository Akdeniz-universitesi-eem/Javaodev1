package org.example;

import javax.swing.*;

//******************************************8iN CEVABi*****************************************************
public class odev8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("bir n sayisi giriniz"));
        int bosluk=n-1;   //bosluk sayisi
        int yildiz=1;     //yildiz sayisi

        //üst ücgen22
        for(int i=0; i<n; i++) {
            for(int k=0; k<bosluk ;k++)
                System.out.print(" ");
            for(int l=0; l<yildiz ;l++)
                System.out.print("*");
            System.out.print("\n");
            yildiz=yildiz+2;
            bosluk=bosluk-1;
        }


        bosluk=1;
        yildiz=yildiz-4;

        //Alt ücgen
        for(int i=0 ;i<(n-1) ;i++){
            for(int k=0; k<bosluk ;k++)
                System.out.print(" ");
            for(int l=0; l<yildiz ;l++)
                System.out.print("*");
            System.out.print("\n");
            bosluk=bosluk+1;
            yildiz=yildiz-2;


        }
    }
}
