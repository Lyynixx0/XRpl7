import java.util.Scanner;

public class SeleksiPrakerin{
public static void main(String[] args) {
    String nama,kelas,perilaku;
    int nilai;

    Scanner s = new Scanner(System.in);
    System.out.println("Nama");
    nama = s.nextLine();
    System.out.println("Kelas : X/XI/XII");
    kelas = s.next();

    if(kelas.equalsIgnoreCase("XII"));{
        System.out.println("Perilaku siswa: (Baik/cukup)");
        perilaku = s.next();
        if(perilaku.equalsIgnoreCase("Baik")){
            System.out.println("nama siswa");
            nilai = s.nextInt();
            if(nilai >=85){
                System.out.println(nama+ "Dinyatakan mengikuti prakerin");

            }else{
                System.out.println("Maaf anda gagal karena nilai");
            }
        }else{
            System.out.println("Anda gagal karena perilaku");
        }
    }{ 
        System.out.println("Anda gagal karena bukan kelas XII");
    }
}    
}
