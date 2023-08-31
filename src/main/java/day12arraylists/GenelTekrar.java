package day12arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenelTekrar {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);

        for ( Integer w :list  ) {
            if (w %2 != 0){

                list.set(list.indexOf(w),11);

            }

        }
    }
}
