package org.example;
//******************************************9UN CEVABi*****************************************************
public class odev9 {
    public static void displayDuration(long s){
        //saat dakika saniye degerlerinin bulunmasi
        long saattenkalan= s%3600;
        long dakikadankalan=saattenkalan%60;
        long hour =(s-saattenkalan)/3600;
        long min =(saattenkalan-dakikadankalan)/60;
        long sec =dakikadankalan;

        //eger saat degeri 0 ise 00:mm:ss benzeri durumlarin onlenmesi icin.        ornekteki cikti --> mm:ss
        if(hour==0)
            if(min==0)
                System.out.print(sec);
            else System.out.print(min+":"+sec);
        else System.out.print(hour+":"+min+":"+sec);

    }

    public static void main(String[] args) {

        displayDuration(0);     //Saniye sayisi istenilen metodla alinabilir

    }
}
