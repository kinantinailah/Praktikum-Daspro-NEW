package soal1;

import java.util.Scanner;

public class latihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayasewamobil = 300000;
        int biayasewa = 200000;
        double diskon = 0.05;
        double totalbiayadiskon;
        

        System.out.print("Masukan Lama Sewa: ");
        int lamasewa = sc.nextInt();

        int bahanbakar = 1000;

        System.out.print("Masukan Jarak Tempuh: ");
        int jaraktempuh = sc.nextInt();
        
        int totalsewa = (biayasewa*lamasewa)+biayasewamobil ;
        int totalbahanbakar = bahanbakar*jaraktempuh;
        int totalbiaya = totalbahanbakar+totalsewa;

       if (totalbiaya > 2000000) {
            totalbiayadiskon = totalbiaya*diskon;
            System.out.println("Selamat anda mendapatkan diskon sebesar 5%");
            System.out.println("Total Biaya anda: " + totalbiayadiskon);
        
       } else {
            System.out.println("Total biaya anda: " + totalbiaya);
        
       }

}
}
     
