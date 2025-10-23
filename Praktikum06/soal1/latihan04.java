package soal1;
import java.util.Scanner;

public class latihan04 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int biayasewamobil = 300000;
          int biayasewa = 200000;
          int Pertalite = 1000;
          int Pertamax = 1300;
          int totalsewa = 0;
          int totalbahanbakar = 0;
          double totalBiaya;
          double diskon = 0.05;

          System.out.println("Lama sewa hanya maksimal 30 hari!");
          System.out.print("Masukan Lama Sewa anda : ");
          int lamasewa = sc.nextInt();
          System.out.print("Masukan Jarak Tempuh per-Km: ");
          int jaraktempuh = sc.nextInt();
          sc.nextLine();
          System.out.print("Bahan bakar yang ingin anda gunakan (Pertalite/Pertamax): ");
          String jenisBahanBakar = sc.nextLine();

          if (jenisBahanBakar.equalsIgnoreCase("Pertalite")) {
               totalbahanbakar = Pertalite * jaraktempuh;
               System.out.println("Total bahan bakar: " + totalbahanbakar);
          } else if (jenisBahanBakar.equalsIgnoreCase("Pertamax")) {
               totalbahanbakar = Pertamax * jaraktempuh;
               System.out.println("Total bahan bakar: " + totalbahanbakar);
          } else {
               System.out.println("tidak menerima selain pertalite/pertamax");
               return;
          }

          if (lamasewa <= 30) {
               totalsewa = (biayasewa * lamasewa) + biayasewamobil;
               System.out.println("Total sewa: " + totalsewa);
          } else {
               System.out.println("Maaf lama sewa anda melebihi maksimum");
               return;
          }

          totalBiaya = totalsewa + totalbahanbakar;

          if (totalBiaya > 2000000) {
               totalBiaya = totalBiaya * diskon;
               System.out.println("Selamat anda mendapatkan diskon 5%");
               System.out.println("Total biaya anda " + totalBiaya);
          } else {

               System.out.println("Total biaya anda: " + totalBiaya);

          }
     }
}
