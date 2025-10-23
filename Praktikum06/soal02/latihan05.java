package soal1;

import java.util.Scanner;

public class latihan05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int biayapelanggan = 50000;
        int tariflistrik = 0;
        double ppn = 0.1;
        
        System.out.print("Masukan Jumlah daya anda: ");
        int Jumlahlisrik = sc.nextInt();
        
        
        if (Jumlahlisrik == 900){
            tariflistrik = 1300;
        } else if (Jumlahlisrik == 1300 || Jumlahlisrik == 2200){
            tariflistrik = 1500;
        } else if (Jumlahlisrik == 3500 || Jumlahlisrik == 5500){
            tariflistrik = 1700;
        }

        int biayalistrik = biayapelanggan+(tariflistrik*Jumlahlisrik);
        double totalpembayaran = biayalistrik-ppn;

        System.out.println("Total Pembayaran:"+totalpembayaran);
        
    }
}
