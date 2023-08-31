package day02variables;

public class Variables02 {
    public static void main(String[] args) {

     String    ogrenciadi = "Onur ADIGÜZEL";
        System.out.println(ogrenciadi);

        //Stinglerde default değer null dır. null hiçlik demektir 0 değildir
        // null içi boş obje demektir
        int age = 13;
        /*
        Primitive ve non-privimitive data type arasındaki farklar nelerdir
        1)primitiveler sadece bizim atadığımız değeri içerir.
        non-primitiveler bizim atadığımız değeri içerir ve methodlar içerir.

        2)primitiveler küçük harle başlar
          non-primitiveler büyük harfle başlar

          3)primitiveleri java üretmiştir ve 8 tanedir
          non-primitiveleri java ve programcılar üretebilir,sınırsız sayıdadır

          4)primitiveler memory de data type larına göre sabit boyutta bellek kullanırlar
          non-primitiveler memory de büyüklüğüne göre değişen boyutlarda bellek kullanabilirler

         */

        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);







    }
}
