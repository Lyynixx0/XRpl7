//object class
public class Karyawan {
    private int id;
    private String nama, unit, alamat;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama()
    {
		return this.nama;
	}
    public void setNama(String nama)
    {
		this.nama = nama;
	}
    //Constructor Parameter
    public Karyawan(int id, String nama, String unit, String alamat) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }
    //method print
    public void print() {
        System.out.println("ID : "+ id);
        System.out.println("Nama : "+ nama);
        System.out.println("Unit : "+ unit);
        System.out.println("Alamat : "+ alamat);
    }
}