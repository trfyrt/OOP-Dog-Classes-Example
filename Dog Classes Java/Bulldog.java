public class Bulldog extends Dogs{
    private String bentukmuka;
    private String postur;
    
    public Bulldog (String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan,boolean isSudahMakan, String jenisAnjing, String bentukmuka, String postur){
        super(warna,tinggi,berat,ukuran,jeniskelamin,paws,warnamata,bentuktelinga,umur,jenismakanan,isSudahMakan,jenisAnjing);
        this.bentukmuka = bentukmuka;
        this.postur = postur;
    }
    
    public String getBentukmuka(){
        return this.bentukmuka;
    }
    
    public void setBentukmuka(String bentukmuka){
        this.bentukmuka = bentukmuka;
    }
    
    public String getPostur(){
        return this.postur;
    }
    
    public void setPostur(String postur){
        this.postur = postur;
    }

    public void display(){
        System.out.println("Bulldog");
        System.out.println("Postur         : " + postur+ "\n");
    }
}
