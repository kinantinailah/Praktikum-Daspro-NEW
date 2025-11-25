import java.util.Scanner;

public class NilaiKelompok13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,totalNailai, rataRata;
        int j, i = 1;

        while (i<=6) {
            System.out.println("Kelompok ke"+i);
            totalNailai = 0;
            for (j = 0; j <=5; j++) {
                System.out.print("Masukkan Nilai ke-"+j+": ");
                nilai = sc.nextDouble();
                totalNailai =+ nilai;
            } 
            rataRata = totalNailai / 5;
            System.out.println("Rata-rata Nilai Kelompok ke-"+i+" : "+rataRata);
            i++;            
        }
    }
}
