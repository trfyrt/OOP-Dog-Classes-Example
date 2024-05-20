public class Poodle extends Dogs{
private String bentukbulu;
private boolean ringkas;

public Poodle (String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan,boolean isSudahMakan, String jenisAnjing, String bentukbulu, boolean ringkas){
    super(warna,tinggi,berat,ukuran,jeniskelamin,paws,warnamata,bentuktelinga,umur,jenismakanan,isSudahMakan,jenisAnjing);
    this.bentukbulu = bentukbulu;
    this.ringkas = ringkas;
}

public String getBentukbulu (){
    return this.bentukbulu;
}

public void setBentukbulu(String bentukbulu){
    this.bentukbulu = bentukbulu;
}

public boolean getRingkas(){
    return this.ringkas;
}

public void setRingkas(boolean ringkas){
    this.ringkas = ringkas;
}

public void display(){
    System.out.println("Poodle");
    System.out.println("Bentuk bulu    : " + bentukbulu+ "\n");
}
}

