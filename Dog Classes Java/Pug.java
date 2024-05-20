public class Pug extends Dogs{
    private String bentukmuka;
    private boolean ringkas;
    
    public Pug (String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan,boolean isSudahMakan, String jenisAnjing, String bentukmuka, boolean ringkas){
        super(warna,tinggi,berat,ukuran,jeniskelamin,paws,warnamata,bentuktelinga,umur,jenismakanan, isSudahMakan, jenisAnjing);
        this.bentukmuka = bentukmuka;
        this.ringkas = ringkas;
    }
    
    public String getBentukmuka(){
        return this.bentukmuka;
    }
    
    public void setBentukmuka(String bentukmuka){
        this.bentukmuka = bentukmuka;
    }
    
    public boolean getRingkas(){
        return this.ringkas;
    }
    
    public void setRingkas(boolean ringkas){
        this.ringkas = ringkas;
    }
    public void display(){
        System.out.println("Pug");
        System.out.println("Bentuk muka    : " + bentukmuka+ "\n");
    }
}
