import java.util.Scanner;

public class PembelianAlat {
    public static void main(String[] args) {

        int pilihan, jumlah=0;
        double harga=0,total,temp=0;
        String tambahBeli;

        do{
        Scanner s = new Scanner(System.in);
        System.out.println("list alat tulis");
        System.out.println("1.buku 4000\n2. penghapus 1000\n3. penggaris 2500\n3. pensil 1500\n4. tipe-x 7500 ");
        System.out.println("Inputkan pembelian: (1/2/3/4/5)");
        pilihan = s.nextInt();
        System.out.println("jumlah beli");


        switch (pilihan) {
            case 1:
                harga=4000;
                break;

                case 2:
                harga=1000;
                break ;
                
                case 3:
                harga=2500;
                break;

                case 4:
                harga=1500;
                break;

                case 5:
                harga=7500;
                break;

        
            default:
                break;
        }
total=jumlah*harga;
temp += total;
System.out.println("Apakah anda ingin membeli lagi (ya/tidak)");
tambahBeli = s.next();
    } while (tambahBeli.equalsIgnoreCase("ya"));
    System.out.println("total yaang dibayarkan"+temp);
       
}
    
}
