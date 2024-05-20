public abstract class Dogs {
    private String warna;
    private float tinggi;
    private float berat;
    private String ukuran;
    private char jeniskelamin;
    private int paws;
    private String warnamata;
    private String bentuktelinga;
    private int umur;
    private String jenismakanan;
    private boolean isSudahMakan;
    private String jenisAnjing;
    private int mamamKali;



    public Dogs() {
    }
    
    public Dogs(String warna, float tinggi, float berat, String ukuran, char jeniskelamin, int paws, String warnamata, String bentuktelinga, int umur, String jenismakanan, boolean isSudahMakan, String jenisAnjing) {
            switch(ukuran){
                case "Kecil":
                    mamamKali = 1;
                    break;
                case "Sedang":
                    mamamKali = 2;
                    break;
                case "Besar":
                    mamamKali = 3;
                    break;
                default:
                    mamamKali = 0;
            }
        this.warna = warna;
        this.tinggi = tinggi;
        this.berat = berat;
        this.ukuran = ukuran;
        this.jeniskelamin = jeniskelamin;
        this.paws = paws;
        this.warnamata = warnamata;
        this.bentuktelinga = bentuktelinga;
        this.umur = umur;
        this.jenismakanan = jenismakanan;
        this.isSudahMakan = isSudahMakan;
        this.jenisAnjing = jenisAnjing;
        this.isSudahMakan = isSudahMakan;
        this.jenisAnjing = jenisAnjing;
    }

    public void bark() {
        System.out.println("woof woof");
    }

    public void run(int speed) {
        System.out.println("running in " + speed + " m/s");
    }

    public void walk(int speed) {
        System.out.println("walking in " + speed + " m/s");
    }

    public void jump(float height) {
        System.out.println("jumping for " + height + " m");
    }

    public void sleep(float time) {
        System.out.println("sleep for " + time + " hours");
    }

    public void eat(float weight) {
        System.out.println("eating " + weight + " kg");
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public float getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getBerat() {
        return this.berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public char getJeniskelamin() {
        return this.jeniskelamin;
    }

    public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getPaws() {
        return this.paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getWarnamata() {
        return this.warnamata;
    }

    public void setWarnamata(String warnamata) {
        this.warnamata = warnamata;
    }

    public String getBentuktelinga() {
        return this.bentuktelinga;
    }

    public void setBentuktelinga(String bentuktelinga) {
        this.bentuktelinga = bentuktelinga;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenismakanan() {
        return this.jenismakanan;
    }

    public void setJenismakanan(String jenismakanan) {
        this.jenismakanan = jenismakanan;
    }

    public boolean isSudahMakan() {
        return isSudahMakan;
    }

    public void setSudahMakan(boolean isSudahMakan) {
        this.isSudahMakan = isSudahMakan;
    }

    public String getJenisAnjing() {
        return jenisAnjing;
    }

    public void setJenisAnjing(String jenisAnjing) {
        this.jenisAnjing = jenisAnjing;
    }

    public int getMamamKali() {
        return mamamKali;
    }

    public void setMamamKali(int mamamKali) {
        this.mamamKali = mamamKali;
    }

    

}