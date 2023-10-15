package org.example;
//******************************************4UN CEVABi*****************************************************


import javax.swing.*;

public class odev4 {
    public static void main(String[] args) {
        int sayi0=0;
        int sayi1=0;
        int sayi = Integer.parseInt(JOptionPane.showInputDialog("Toplama icin-1\n cikarma icin-2\n bolme icin-3\n carpma icin-4\n Numara giriniz"));
        sayi1 = Integer.parseInt(JOptionPane.showInputDialog("ilk sayiyi giriniz \n "));
        sayi0 = Integer.parseInt(JOptionPane.showInputDialog("ikinci sayiyi giriniz \n Sonuc icin Enterlayin"));
        switch(sayi){
            case 1:
                JOptionPane.showMessageDialog(null,sayi1+sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,sayi1-sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,(float)sayi1/sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE); // integer virgülden sonrasini vermeyeceginden float casting yapılır
                break;
            case 4:
                JOptionPane.showMessageDialog(null,sayi1*sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
