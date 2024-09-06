import java.util.Scanner;

public class tarifparkir {
    public static void main(String[] args) {
        String platNomor;
        int jumlahJam;
        double Harga;

        Scanner s = new Scanner(System.in);
        System.out.println("Masuukan plat Nomor :");
        platNomor = s.nextLine();
        System.out.println("Jumlah jam");
        jumlahJam = s.nextInt();

        if (jumlahJam >0 && jumlahJam<=1) {
            Harga=3000;
        }else if(jumlahJam >1 && jumlahJam <=4){
          Harga=7000;
        }else if(jumlahJam >4){
            Harga = 10000;
        }else{
            Harga =0;
            System.out.println("System eror");
        }
        System.out.println(platNomor);
        System.out.println("tarif parkir" +Harga);

    }
}
