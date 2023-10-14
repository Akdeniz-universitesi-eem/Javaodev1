package org.example;
//******************************************7Nin CEVABi*****************************************************
public class odev7 {
    public static int signum(int a){   //signum metodu
        byte b = 0;
        if(a<0)
            b=-1;
        if(a>0)
            b=1;
        if(a==0)
            b=0;

        return b;
    }

    public static void main(String[] args) {

        System.out.println(signum(-5));

    }
}
