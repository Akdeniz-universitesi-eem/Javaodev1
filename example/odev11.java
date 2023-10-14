package org.example;
//******************************************11iN CEVABi*****************************************************



import javax.swing.*;

public class odev11 {
    public static void main(String[] args) {
        int h = Integer.parseInt(JOptionPane.showInputDialog("bir h yuksekligi giriniz"));
        int w = Integer.parseInt(JOptionPane.showInputDialog("bir w genisligi giriniz"));
        int n =0;  //yildizdan onceki bosluk icin
        int m =w-1;  //yildizdan sonraki bosluk icin
        int a =0; //yildiz saga dogru kayiyorsa 0 sola kayiyorsa 1
        for(int i=1;i<=h;i++) {
            System.out.print("I");
            if(a==0){ //saga kayma
                for (int k = 0; k < n; k++)
                    System.out.print(" ");
                System.out.print("*");

                for (int k = 0; k < m; k++)
                    System.out.print(" ");
                n++;
                m--;
                if(n==w)
                    a=1;
            }else {   //sola kayma
                for (int k = 0; k < n-1; k++)
                    System.out.print(" ");
                System.out.print("*");

                for (int k = 0; k < m+1; k++)
                    System.out.print(" ");
                n--;
                m++;
                if(n==0)
                    a=0;
            }

            System.out.print("I");
            System.out.print("\n");

        }

    }
}
