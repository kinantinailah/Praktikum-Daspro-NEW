import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,Total=0;

        System.out.print("Masukan jenis kendaraan (1.Mobil, 2.Motor, 0 keluar): ");
        jenis = sc.nextInt();

        while (jenis !=0) {
            if ((jenis==1)|| (jenis==2)) {
                System.out.print("Masukan durasi parkir: ");
                durasi = sc.nextInt();

                if (durasi>=5) {
                    Total = 12500;
                    System.out.println(" Total parkir anda: " + Total);
                    
                }
                else if (jenis==1) {
                    Total = durasi * 5000;
                    System.out.println("Total parkir mobil: " + Total);
                    break;
                } else if (jenis==2) {
                    Total = durasi * 2000;
                    System.out.println("Total parkir motor: " + Total);
                    break;
                }
                
            }
            System.out.println("-----------------------------");
           
        }
    }
    
}
