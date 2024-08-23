// /Driver SiswaTester
import java.util.Scanner;


public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK");
        double ipk = input.nextDouble();
        

        Siswa Charoline = new Siswa(id, nama, ipk);
        Charoline.print();
        input.close();
        //object
        //Class object = new Constructor
        Siswa juna = new Siswa();
        Siswa arya = new Siswa();
        Siswa matt = new Siswa();
        Siswa epan = new Siswa(); 
        Siswa eka = new Siswa();
        Siswa Charol = new Siswa(123, "Charol",80.5);

        juna.id = 1;
        juna.nama = "Arjuna";
        juna.ipk = 90;

        System.out.println("Nama : " + juna.nama);
        System.out.println("id : " + juna.id);
        System.out.println("ipk : " + juna.ipk);

        arya.id = 3;
        arya.nama = "arya";
        arya.ipk = 90;

        System.out.println("Nama : " + arya.nama);
        System.out.println("id : " + arya.id);
        System.out.println("ipk : " + arya.ipk);


        matt.id = 20;
        matt.nama = "matt";
        matt.ipk = 90;

        System.out.println("Nama : " + matt.nama);
        System.out.println("id : " + matt.id);
        System.out.println("ipk : " + matt.ipk);

        epan.id = 10;
        epan.nama = "epan";
        epan.ipk = 90;

        System.out.println("Nama : " + epan.nama);
        System.out.println("id : " + epan.id);
        System.out.println("ipk : " + epan.ipk);

        
        eka.id = 100;
        eka.nama = "eka";
        eka.ipk = 90;

        System.out.println("Nama : " + eka.nama);
        System.out.println("id : " + eka.id);
        System.out.println("ipk : " + eka.ipk);
        
        
    }
}

