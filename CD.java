package persewaan;
public class CD extends Product{

    private String artist;
    private int totalSong;
    private String label;
    
    public CD(){
        number = 10;
        name = "Selamat pagi";
        quantitiy = 0;
        price = 0.0; 
        artist = "clairine";
        totalSong = 0;
        label = " sony music";
    }
    public void print() {
        System.out.println("number :" + number);
        System.out.println("nama:" + nama);
        System.out.println("quantity:" + quantitiy);
        System.out.println("price:"+ price);

    
    }
}