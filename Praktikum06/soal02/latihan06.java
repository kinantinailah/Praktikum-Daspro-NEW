package soal1;

import java.util.Scanner;

public class latihan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int biayapelanggan = 50000;
        int tariflistrik = 0;
        double ppn = 0.1;
        
        System.out.print("Masukan Jumlah daya anda: ");
        int Jumlahlisrik = sc.nextInt();
        
        
        switch (Jumlahlisrik) {
            case 900:
                tariflistrik = 1300;
                break;
            case 1300:
            case 2200:
                tariflistrik = 1500;
                break;
            case 3500:
            case 5500:
                tariflistrik = 1700;
                break;  
        }

        int biayalistrik = biayapelanggan+(tariflistrik*Jumlahlisrik);
        double totalpembayaran = biayalistrik-ppn;

        System.out.println("Total Pembayaran:"+totalpembayaran);
        
    }
}
