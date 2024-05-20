public class Komondor extends Dogs{
private String bentukbulu;
private String pekerjaan;

public Komondor (String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan,boolean isSudahMakan, String jenisAnjing,String bentukbulu, String pekerjaan){
    super(warna,tinggi,berat,ukuran,jeniskelamin,paws,warnamata,bentuktelinga,umur,jenismakanan,isSudahMakan,jenisAnjing);
    this.bentukbulu = bentukbulu;
    this.pekerjaan = pekerjaan;
}

public String getBentukbulu (){
    return this.bentukbulu;
}

public void setBentukbulu(String bentukbulu){
    this.bentukbulu = bentukbulu;
}

public String getPekerjaan (){
    return this.pekerjaan;
}

public void setPekerjaan(String pekerjaan){
    this.pekerjaan = pekerjaan;
}

public void display(){
    System.out.println("Komondor");
    System.out.println("Pekerjaan      : " + pekerjaan + "\n");
}

}
