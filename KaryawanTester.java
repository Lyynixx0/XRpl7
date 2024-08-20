//object class
public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Karyawan Queen = new Karyawan(26,"Queen","TU","Surabaya");
        Karyawan Dinszz = new Karyawan(29,"Dinszz","Kesiswaan","Bali");
        Karyawan Evan = new Karyawan(21,"Evan","TU","Malang");
        Karyawan Juna = new Karyawan(19,"Juna","Kesiswaan","Blitar");
        Karyawan Michelle = new Karyawan(15,"Michelle","Kurikulum","Surabaya ");

        Queen.print();
        System.out.println();
        Dinszz.print();
        System.out.println();
        Evan.print();
        System.out.println();
        Juna.print();
        System.out.println();
        Michelle.print();
    }
}
