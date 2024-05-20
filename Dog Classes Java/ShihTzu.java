public class ShihTzu extends Dogs{
    private String panjangbulu;
    private boolean ringkas;
    
    public ShihTzu (String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan,boolean isSudahMakan, String jenisAnjing, String panjangbulu, boolean ringkas){
        super(warna,tinggi,berat,ukuran,jeniskelamin,paws,warnamata,bentuktelinga,umur,jenismakanan,isSudahMakan,jenisAnjing);
        this.panjangbulu = panjangbulu;
        this.ringkas = ringkas;
    }
    
    public String getPanjangbulu (){
        return this.panjangbulu;
    }
    
    public void setPanjangbulu(String panjangbulu){
        this.panjangbulu = panjangbulu;
    }
    
    public boolean getRingkas(){
        return this.ringkas;
    }
    
    public void setRingkas(boolean ringkas){
        this.ringkas = ringkas;
    }

    public void display(){
        System.out.println("Shih Tzu");
        System.out.println("Panjang bulu   : " + panjangbulu+ "\n");
    }
}
