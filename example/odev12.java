package org.example;
//******************************************12nin CEVABi*****************************************************
import javax.swing.*;

public class odev12 {
    public static void main(String[] args) {
        int n =0;
        int a = Integer.parseInt(JOptionPane.showInputDialog("bir a sayisi giriniz"));
        int[] asalsayilar = new int[a];       //asal sayilari depolamak icin array
        int say=0;
        for(int i=2;i<a;i++){    //a sayisina kadarki asal sayilarin tespitini yapip asalsayilar arrayine depolama yapar
            for(int j=2;j<=i;j++){
                if(i%j==0)
                    say++;
                if(say>1)
                    break;  }
            if(say==1){
                asalsayilar[n]=i;
                n++;
            }
            say=0;
        }
        for(int i=0;i<a;i++)     //toplamların a ya eşit olup olmadıgının tespit edildigi loop
            for(int j=1;j<a;j++){
                if(asalsayilar[i]+asalsayilar[j]==a){
                    if(asalsayilar[i]<asalsayilar[j])
                        System.out.print(asalsayilar[i]+"+"+asalsayilar[j]+" ");
                }
            }
    }
}
