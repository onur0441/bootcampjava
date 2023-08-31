package day02variables;

public class VariablesTekrar {
    public static void main(String[] args) {
      //tam sayılar içindir ve 4 byte yer kaplar
        int sayi1  = 15 ;
        int sayi2  = 35 ;
        int toplam =sayi1+sayi2;
        System.out.println(toplam);

        char isimBasharf ='M';
        //char data type 2 byte yer kaplar
        System.out.println(isimBasharf);

        boolean varMiYokMi =true;
        //sadece true ve false değerini alır ve 1 byte yer kaplar
        System.out.println(varMiYokMi);

        // byte tam sayılar içindir ve 1 byte yer kaplar
        byte yas = 85;
        System.out.println(yas);

        short beyazEsyafiyat=25655;
        // short tam sayılar içindir ve 2 byte yer kaplar
        System.out.println(beyazEsyafiyat);

        long abdNufus =330000000L;
        // tam sayılar içindir ve 8 byte yer kaplar
        System.out.println(abdNufus);

        float donerFiyat = 67.5F;
        //ondalıklı sayılar içindir ve 4 byte yer kaplar ayrıca değerin sonuna F yada f konulmalı çünkü java değeri double olarak alır
        System.out.println(donerFiyat);

        double weighcell=0.00000000000005;
        // ondalıklı sayılar içindir ve 8 byte yer kaplar
        System.out.println(weighcell);

        String isim = "Galatasaray";
        System.out.println(isim);
        System.out.println("  A  ");
        System.out.println(" A A ");
        System.out.println("A A A");

        char ch1='A';
        char ch2='b';
        System.out.println(ch1<ch2);

        System.out.println(ch1+0);

        String isim1 =" ";
        System.out.println(isim1);




    }

}
