package org.example;
//******************************************5in CEVABi*****************************************************


import javax.swing.*;

public class odev5 {
    public static void main(String[] args) {

        //input

        int sayi1 = Integer.parseInt(JOptionPane.showInputDialog("1.Sayiyi giriniz"));
        int sayi2 = Integer.parseInt(JOptionPane.showInputDialog("2.Sayiyi giriniz"));
        int sayi3 = Integer.parseInt(JOptionPane.showInputDialog("3.Sayiyi giriniz"));

        int[] sayilar = {sayi1,sayi2,sayi3};
        //burada tüm degerler birbiriyle kiyaslanir
        for(int i=0;i<3;i++) {
            for (int y = 0; y < 3; y++) {
                if (sayilar[y] <= sayilar[i]) {
                    int a=sayilar[i];
                    sayilar[i]=sayilar[y];
                    sayilar[y] = a;
                }
            }
        }

        //burada sonuclar yazdirilir

        if(sayilar[2]!= sayilar[1] && sayilar[1]!= sayilar[0] )
            System.out.println(sayilar[2]+"<"+sayilar[1]+"<"+sayilar[0]);
        if(sayilar[2]== sayilar[1] && sayilar[1]== sayilar[0] )
            System.out.println(sayilar[2]+"="+sayilar[1]+"="+sayilar[0]);
        if(sayilar[2]== sayilar[1] && sayilar[1]!= sayilar[0] )
            System.out.println(sayilar[2]+"="+sayilar[1]+"<"+sayilar[0]);
        if(sayilar[2]!= sayilar[1] && sayilar[1]== sayilar[0] )
            System.out.println(sayilar[2]+"<"+sayilar[1]+"="+sayilar[0]);

    }
}
