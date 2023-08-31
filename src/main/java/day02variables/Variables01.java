package day02variables;

public class Variables01 {

    public static void main(String[] args) {

        // variable nasıl oluşturulur
        //data type + variable name +assigment operatör(atama operatörü) + variable değeeri +noktalı virgül;
       int age = 29;
        System.out.println(age);
   // CHAR DATA TYPINDA DEĞERLER TEK TIRNAK İÇİNE ALINMALI
         char isminIlkHarfi = 'O';// sıfır olan rakamın içine nokta(.) sembolü konur
        System.out.println(isminIlkHarfi);

        boolean emeklimisin=false ;
        System.out.println(emeklimisin);

        byte ogrenciYasi =13;
        System.out.println(ogrenciYasi);

        short siteNufusu=1600;
        System.out.println(siteNufusu);
        int ulkeNufusu = 85000000;
        System.out.println(ulkeNufusu);

         long cellNumberHumanBody=85458226L;
        System.out.println(cellNumberHumanBody);

        // float oluşturduğunuzda sonuna F yada f koymalıyız çünkü java ondalıklı sayıları otomatik olarak double olarak kabul ediyor

        float gomlekFiyati = 299.99F;
        double weighcell =0.00000000000015;
        System.out.println(weighcell);
        // sonuc E yani exponent(üs demek)



    }


}
