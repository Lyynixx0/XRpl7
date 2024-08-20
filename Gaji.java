import java.util.Scanner;

public class Gaji{
    public static void main(String[] args){
    double JumlahGaji, tarifPerjam, potonganPajak, gajiTotal;

     
    Scanner input = new Scanner(System.in);
    System.out.println("Jumlah Gaji : ");
    JumlahGaji= input.nextDouble();
    System.out.println("Tarif Perjam : ");
    tarifPerjam = input.nextDouble();
    potonganPajak= 10;


    gajiTotal= JumlahGaji*tarifPerjam;
    potonganPajak=(potonganPajak/100)*gajiTotal;
    gajiTotal = gajiTotal-potonganPajak;
    System.out.println("Gaji Bersih : "+gajiTotal);


    

    }

}