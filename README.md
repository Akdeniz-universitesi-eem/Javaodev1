# Javaodev1
Akdeniz Universitesi İleri Programlama Dersi 1.Odevi

java uzantili programlar example dosyasindadir.Odevdeki sozel kisimlar word dosyasi olarak eklenmistir.



Sözel sorularin cevaplari

1
Math.abs() metodu integer versiyonu ile kullanılırsa ve çıktı ‘System.out.println’
Metodu ile yazdırılırsa -2147483648 sayısı yazıldığında çıktı şu şekilde alınır:

-2147483648

Math.abs() metodunun yaptığı iş girilen sayının mutlak değerini almaktır.
Fakat sonuçta neden ‘2147483648’ değeri vermesi gerekirken ‘-2147483648’
Değerini Verdi? Bunun nedeni ‘-2147483648’ sayısının integer formunda bir
karşılığı olmamasıdır. (integer max olarak ‘2147483647’ sayısını alabilir)


2
API
İngilizcesi ‘Application programming interface’(Uygulama programlama arayüzü) olan bir prosedürler ve fonksiyonlar bütünüdür. Kullanıcı bu prosedür ve fonksiyonları kullanarak uygulamalar oluşturabilirken halihazırda çalışan bu sistemin bazı özelliklerine datasına ve servislerine erişebilir. Örnek olarak:
Twitter API
Discord API
Kullanıcı bu API leri kullanarak uygulamayla etkileşime girebilen uygulamalar üretebilir.




Kütüphane
Programlama Kütüphanesi esasında önceden farklı kullanıcılar tarafından yazılmış metotların koleksiyonudur. Yazılımcıların zaman içerisinde oluşturarak Programlama topluluğuna kazandırdığı genel görevler gerçekleştirebilen metot koleksiyonu da denilebilir. Kütüphaneler genellikle spesifik konular üzerine oluşturulur. Örnek olarak C programlama dilindeki math.h kütüphanesi genel olarak matematiksel işlemler için kullanılır. Kullanıcı bu kütüphane içeriklerini kullanarak oluşturacağı programı daha optimize bir şekilde kısa sürede yazabilir.

MAVEN
Maven javada çoğunlukla kullanılan derleme otomasyon aracıdır. Başlangıçta Jakarta Projesinin yapım sürecini kolaylaştırmak için geliştirilmiştir. Maven in asıl görevi developerın geliştirme sürecinin tamamını kısa sürede kavramasını sağlamasıdır. Maven ın bazı özellikleri:
Yapım sürecini kolaylaştırır: kullanıcıları fazla detaydan korur
Düzenli bir yapı sistemi sağlar: Birden fazla proje yönetiminde zaman kaybını önler
Maven için genel olarak program yazılımını ve birden çok programın bulunduğu projelerin sınıflandırılması, kolayca yönetilmesi gibi özellikleri sağlayan pluginler bütünlüğü olduğunu söyleyebiliriz.

3
Debug bir programcının en güçlü toollarından biridir. javada debug yapılırken kod satırının başındaki numaralara tıklanır debug modda program çalıştığında program o satırlara kadar çalışır işaretlenen satırda durur devam ettirildiğinde diğer satıra geçer böylelikle her basamakta ne olduğunu gözlemleyebiliriz.10 kere merhaba yazma örneğinde 
public class Main {
    public static void main(String[] args) {

        for (int i=0;i<10;i++)
        System.out.print("Hello and welcome!");
    }
}
for ve altındaki satır seçilip debug modda program çalıştırılırsa program bu satırlara her geldiğinde durup kullanıcıdan devam edip etmemesini bekler bu sayede her merhaba yazıldığında i değerinin nasıl değiştiğini gözlemleyebiliriz.

