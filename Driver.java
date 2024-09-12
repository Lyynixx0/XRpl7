

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        String dwi = null;
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner Matt = new Scanner (System.in);

        System.out.print("Apa ada barang yang anda inginkan? (CD/DVD) ");
        dwi = Matt.next();

        if(dwi.equalsIgnoreCase("CD")) {
            cd.print();
        }else if(dwi.equalsIgnoreCase("DVD")) {
            dvd.print();


        }else{
            System.out.println("Maaf, Kami Hanya Menyediakan CD atau DVD");
        }
    }
}