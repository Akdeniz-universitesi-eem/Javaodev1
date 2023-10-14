package org.example;
//******************************************4UN CEVABi*****************************************************


import javax.swing.*;

public class odev4 {
    public static void main(String[] args) {
        int sayi0=0;
        int sayi1=0;
        int sayi = Integer.parseInt(JOptionPane.showInputDialog("Toplama icin-1\n cikarma icin-2\n bolme icin-3\n carpma icin-4\n Numara giriniz"));
        switch(sayi){
            case 1:
                sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Toplanacak sayi 1 i girin \n "));
                sayi0 = Integer.parseInt(JOptionPane.showInputDialog("Toplanacak sayi 2 yi girip \n Sonuc icin Enterlayin"));
                JOptionPane.showMessageDialog(null,sayi1+sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Eksilen sayiyi girin \n "));
                sayi0 = Integer.parseInt(JOptionPane.showInputDialog("Cıkan sayıyı girip \n Sonuc icin Enterlayin"));
                JOptionPane.showMessageDialog(null,sayi1-sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Bolunecek sayiyi girin \n "));
                sayi0 = Integer.parseInt(JOptionPane.showInputDialog("Bolen sayiyi girip \n Sonuc icin Enterlayin"));
                JOptionPane.showMessageDialog(null,(float)sayi1/sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE); // integer virgülden sonrasini vermeyeceginden float casting yapılır
                break;
            case 4:
                sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Carpan sayi1 girin \n "));
                sayi0 = Integer.parseInt(JOptionPane.showInputDialog("Carpan sayi2 girip \n Sonuc icin Enterlayin"));
                JOptionPane.showMessageDialog(null,sayi1*sayi0, "Cevap",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
