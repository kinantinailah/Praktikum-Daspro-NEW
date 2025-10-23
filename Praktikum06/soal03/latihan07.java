package soal03;

import java.util.Scanner;

public class latihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int publikasi = 300000;
        int dekorasi = 500000;
        int konsumsi = 500000;
        int operasional = 500000;
        int hadiah = 4000000;
        int konsumsipeserta = 25000;
        int honorium = 75000;
        int pendaftaran = 50000;
        double jumlahbantuan = 0;
        int biayaanggaran = 0;
        int danaSponsorship = 0;

        System.out.print("Masukan Jumlah Tim: ");
        int jumlahtim = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Apakah polinema bersedia memberi bantuan dana? (ya/tidak): ");
        String bantuan = sc.nextLine();
        
        int biayaKonsumsi = konsumsipeserta*(jumlahtim*3);
        int biayahonurium = honorium*jumlahtim;
        int biayapendaftaran = pendaftaran*jumlahtim;

        biayaanggaran = publikasi+dekorasi+konsumsi+operasional+hadiah+biayaKonsumsi+biayahonurium;

        if (bantuan.equalsIgnoreCase("ya")) {
            System.out.print("Masukan Jumlah Bantuan Dana: ");
            jumlahbantuan = sc.nextDouble();
        }else if (bantuan.equalsIgnoreCase("tidak")) {
            System.out.println("tidak ada bantuan dana dari polinema");   
        } if (jumlahbantuan < 0.6) {
            danaSponsorship = biayaanggaran - biayapendaftaran - (int)(0.6 * biayaanggaran);
            System.out.println("jumlah dana sponsorship yang dibutuhkan: " + danaSponsorship);
        } else if (jumlahbantuan >= 0.6) {
            danaSponsorship = 0;
            System.out.println("tidak perlu sponsorship dana sudah terpenuhi");
        } {
            
        }sc.close();
    }
    
}
