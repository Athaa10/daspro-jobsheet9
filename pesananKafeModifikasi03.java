import java.util.Scanner;

public class pesananKafeModifikasi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false; 
       
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {  
                ditemukan = true;
                break; 
            }
        }

        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }
    }
}
