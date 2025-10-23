package soal1;

import java.util.Scanner;

public class latihan01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            int biayasewamobil = 300000;
            int biayasewa = 200000;
            int Pertalite = 1000;
            int Pertamax = 1300;
            int totalbahanbakar = 0;
            
          System.out.print("Masukan Lama Sewa: ");
          int lamasewa = sc.nextInt();
          System.out.print("Masukan Jarak Tempuh per-Km: ");
          int jaraktempuh = sc.nextInt();
          sc.nextLine();
          System.out.print("Bahan bakar yang ingin anda gunakan (Pertalite/Pertamax): ");
          String jenisBahanBakar = sc.nextLine();

          if (jenisBahanBakar.equalsIgnoreCase("Pertalite")) {
               totalbahanbakar = Pertalite * jaraktempuh;
               System.out.println("Total bahan bakar: " + totalbahanbakar);
                int totalsewa = (biayasewa*lamasewa)+biayasewamobil ;
                int totalbiaya = totalbahanbakar+totalsewa;
                System.out.println("Total Sewa:"+totalsewa);
                System.out.println("Total Biaya:"+totalbiaya);
          } else if (jenisBahanBakar.equalsIgnoreCase("Pertamax")) {
               totalbahanbakar = Pertamax * jaraktempuh;
               System.out.println("Total bahan bakar: " + totalbahanbakar);
               int totalsewa = (biayasewa*lamasewa)+biayasewamobil ;
               int totalbiaya = totalbahanbakar+totalsewa;
               System.out.println("Total Sewa:"+totalsewa);
               System.out.println("Total Biaya:"+totalbiaya);
          } else {
               System.out.println("tidak menerima selain pertalite/pertamax");
               return;
          }

     }
    
}
       