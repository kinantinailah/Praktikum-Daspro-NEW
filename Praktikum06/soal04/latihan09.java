import java.util.Scanner;
public class latihan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // ribu
        int cetak = 200;
        int jilid = 20000;
        int pengiriman = 0;
        // gram
        int beratkertas = 3;
        int beratcover = 250;
        int beratpacking = 300;
        
        System.out.print("Masukan Jumlah Halaman:");
        int jumlahhalaman = sc.nextInt();
        int jumlahlembar = (int)Math.ceil((double)jumlahhalaman/2);

        int biayacetak = (jumlahhalaman*cetak)+jilid;
        int totalberat = (beratkertas*jumlahlembar)+beratcover+beratpacking;

        System.out.print("masukan kota tujuan pengiriman (1. Malang 2. Batu 3.luar jatim): ");
        int kota = sc.nextInt();
        if (kota == 1 || kota == 2) {
            pengiriman = 20000;   
        } else if (kota == 3) {
            System.out.println("hanya melayani pengiriman dalam jawa timur");
        }
         else {
            pengiriman = 15000;
        }
        int biayapengiriman = totalberat*pengiriman;
        int totalbiaya = biayacetak+biayapengiriman ;
        System.out.println("Total Biaya Cetak: Rp " + biayacetak);
        System.out.println("Total Biaya Pengiriman: Rp " + biayapengiriman);
        System.out.println("Total Biaya Keseluruhan: Rp " + totalbiaya);

            
        }
}
