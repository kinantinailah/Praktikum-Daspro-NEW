import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukan angka pertama: ");
        a = sc.nextInt();

        System.out.print("Masukan angka kedua: ");
        b = sc.nextInt();

        System.out.print("Masukan angka ketiga: ");
        c = sc.nextInt();

        if (a>=b && a>=c) {
            System.out.println(a+" merupakan bilangan maksimum");
            } else if (b>=c && b>=a) {
            System.out.println(b+" merupakan bilangan maksimum");
            } else if (c>=a && c>=b) {
            System.out.println(c+" merupakan bilangan maksimum");  
        }if (a<=c && a<=b ) {
            System.out.println(a+" merupakan angka minimum");
        }else if (b<=c && b<=a) {
            System.out.println(b+" merupakan angka minimum");
        }else if (c<=a && c<=b) {
            System.out.println(c+" merupakan angka minimum");
        }
        else { 
            System.out.println("nothing");
            
        }

        
    }
    
}
