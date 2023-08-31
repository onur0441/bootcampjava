import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bakkal {
    public static void main(String[] args) {
      LocalDate aliDogDate = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
      LocalDate veliDogDate= LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(10);


        System.out.println(veliDogDate);
        System.out.println(veliDogDate);
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/M/d");
        System.out.println("dtf.format(aliDogDate) = " + dtf.format(aliDogDate));

        if (aliDogDate.equals(veliDogDate)){
            System.out.println("Ali ile Velinin doğum tarihleri aynıdır");
        }else System.out.println("Ali ile Veli farkli tarihlerde doğmuştur");

    }


}

