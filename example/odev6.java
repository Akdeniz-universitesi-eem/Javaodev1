package org.example;
//******************************************6nin CEVABi*****************************************************
public class odev6 {
    public static int mid(int a, int b, int c){      //mid fonksiyonu

        int[] array={a,b,c};
        for(int i=0;i<3;i++) {
            for (int y = 0; y < 3; y++) {
                if (array[y] <= array[i]) {
                    int temp = array[i];
                    array[i] = array[y];
                    array[y] = temp;
                }
            }
        }
        return array[1];

    }
    public static void main(String[] args) {

        System.out.println(mid(18,97,87)); // buradaki a b c degerleri istenilen metodla alinabilir

    }

}
