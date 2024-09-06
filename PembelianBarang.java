import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        double total, diskon, potHar;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Total pembelian");
        total = input.nextDouble();

        if (total > 150000) {
            potHar =0;
            diskon =0.1 * total;
            total -= diskon;
         }else{
            diskon =0;
            potHar = 5000;
            total -= potHar;
         }
         System.out.println("diskon:" + diskon);
         System.out.println("potongan Harga:" +potHar);
         System.out.println("Total yang harus dibayar:" +total);
    }
    
}
