package soal1;

import java.util.Scanner;

public class latihan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayasewamobil = 300000;
        int biayasewa = 200000;

        System.out.print("Masukan Lama Sewa: ");
        int lamasewa = sc.nextInt();

        int bahanbakar = 1000;

        System.out.print("Masukan Jarak Tempuh: ");
        int jaraktempuh = sc.nextInt();


        int totalsewa = (biayasewa*lamasewa)+biayasewamobil ;
        int totalbahanbakar = bahanbakar*jaraktempuh;
        int totalbiaya = totalbahanbakar+totalsewa;
        
        if (lamasewa <= 30) {
               totalsewa = (biayasewa * lamasewa) + biayasewamobil;
               System.out.println("Total sewa: " + totalsewa);
               System.out.println("Total Bahan Bakar:"+totalbahanbakar);
               System.out.println("Total Biaya:"+totalbiaya);
          } else {
               System.out.println("Maaf lama sewa anda melebihi maksimum");
               return;
          }


}
}