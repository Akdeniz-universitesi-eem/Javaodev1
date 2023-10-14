package org.example;

/*
Math.abs() metodu integer versiyonu ile kullanılırsa ve çıktı ‘System.out.println’
Metodu ile yazdırılırsa -2147483648 sayısı yazıldığında çıktı şu şekilde alınır:

-2147483648

Math.abs() metodunun yaptığı iş girilen sayının mutlak değerini almaktır.
Fakat sonuçta neden ‘2147483648’ değeri vermesi gerekirken ‘-2147483648’
Değerini Verdi? Bunun nedeni ‘-2147483648’ sayısının integer formunda bir
karşılığı olmamasıdır. (integer max olarak ‘2147483647’ sayısını alabilir)

 */
public class odev1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        int x=-2147483648;
        int y=-2147483647;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));

    }
}
