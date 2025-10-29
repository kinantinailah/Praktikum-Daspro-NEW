import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket = 50000;
        int jumlahTiket, totalHarga;
        int i = 0;
        double diskon4tiket = 0.10;
        double diskon10tiket = 0.15;


        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        jumlahTiket = sc.nextInt();

        while (i < jumlahTiket) {
            if (jumlahTiket >= 10) {
                totalHarga = (int) (jumlahTiket * tiket * (1 - diskon10tiket));
                System.out.println("Selamat anda mendapatkan diskon 15%");
                System.out.println("Total harga: " + totalHarga);
                break;
            } else if (jumlahTiket >= 4) {
                totalHarga = (int) (jumlahTiket * tiket * (1 - diskon4tiket));
                System.out.println("Selamat anda mendapatkan diskon 10%");
                System.out.println("Total harga:" + totalHarga);
                break;
            } else {
                totalHarga = jumlahTiket * tiket;
                System.out.println("Total harga: " + totalHarga);
                break;
                
            }

          
            
        } i++;



    }
}
