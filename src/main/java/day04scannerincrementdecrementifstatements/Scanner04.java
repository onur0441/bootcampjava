package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Beş basamaklı bir sayı giriniz...");
        int num = input.nextInt();

        //bir tamsayıyı 1000 e bölersek son üç basamağı silmiş oluruz
        int firstTwo = num/1000;
        int lastTwo = num%100;
        //% ==   modulus operator solunda bulunan sayının sağında bulunan
        // sayiyaa blümünden kalanı verir
        //dolayısı ile %10 her zaman bize birler basamağında bulunan sayıyı verir

        System.out.println(firstTwo + lastTwo);
        System.out.println("ilk iki hane ve son iki hane toplamı: " + (firstTwo+lastTwo));


    }
}