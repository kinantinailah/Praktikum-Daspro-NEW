import java.util.Scanner;
public class latihan08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         // ribu
        int cetak = 200;
        int jilid = 20000;
        int pengiriman = 15000;
        // gram
        int beratkertas = 3;
        int beratcover = 0;
        int berathardcover = 250;
        int beratsoftcover = 100;
        int beratpacking = 300;
        
        System.out.print("Masukan Jumlah Halaman: ");
        int jumlahhalaman = sc.nextInt();
        int jumlahlembar = (int)Math.ceil((double)jumlahhalaman/2);
        System.out.print("Jenis cover yang dipilih (1. Softcover 2. Hard cover): ");
        int jeniscover = sc.nextInt();

        int biayacetak = (jumlahhalaman*cetak)+jilid;

        if (jeniscover == 1) {
            beratcover = beratsoftcover;
        } else if (jeniscover == 2) {
            beratcover = berathardcover;       
        } else { 
            System.out.println("Jenis cover tidak valid");
            return;  
        }
        int totalberat = (beratkertas*jumlahlembar)+beratcover+beratpacking;
        int biayapengiriman = totalberat*15000;
        int totalbiaya = biayacetak+biayapengiriman; 
        System.out.println("Total Biaya Cetak: Rp " + biayacetak);
        System.out.println("Total Biaya Pengiriman: Rp " + biayapengiriman);
        System.out.println("Total Biaya Keseluruhan: Rp " + totalbiaya);
        }
}
