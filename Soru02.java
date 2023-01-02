package list_Ing;

import java.util.*;

public class Soru07_ListedenBelirlenen_IndekstekiElemaniSilme {

    public static void main(String[] args) {

        /*

            Bir diziden belirli bir öğeyi kaldırmak için bir Java programı yazın ve kalan öğeleri
            yeni bir diziye koyun ve yeni diziyi yazdırır.

            Input :[1,2,3,4,5,7]

            element:6

            Output : [1,2,3,4,5]

         */

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1,2,3,4,5,7));
        List<Integer> yenisayilar = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println(sayilar);
        System.out.println("Silmek istediginiz indeksi giriniz");
        Integer secilenSayi = input.nextInt();

        sayilar.remove(secilenSayi-1);

        Iterator<Integer> itr = sayilar.listIterator();

        while (itr.hasNext()){

            int sayi = itr.next();
            yenisayilar.add(sayi);
        }

        System.out.println("yenisayilar = " + yenisayilar);


    }

}
