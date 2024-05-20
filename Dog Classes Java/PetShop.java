import java.util.ArrayList;

public class PetShop{
    public static void main(String[] args) {
        ArrayList<Dogs> listAnjing = new ArrayList<Dogs>();

        Komondor komondor = new Komondor("Putih", 71f, 55.5f,"Besar",'M',4,"Hitam","Letoy turun",7,"Omnivora",true,"Komondor","Gimbal", "Pengembala Domba");
        Poodle poodle = new Poodle("Cokelat", 23.4f, 24.5f,"Kecil",'M',3,"Cokeat","Letoy turun",4,"Omnivora",false,"Poodle","Ikal", true);
        Bulldog bulldog = new Bulldog("Putih", 33.6f, 17.6f, "Besar", 'F', 4, "Hitam", "Kecil melengkung", 5, "Karnivora",false,"Bulldog", "Keriput", "Gagah tegap berisi");
        ShihTzu shihTzu = new ShihTzu("Putih", 25.6f, 5.4f, "Kecil", 'F', 4, "Hitam", "Letoy turun", 3, "Omnivora",true,"Shih Tzu", "Lebat", true);
        Pug pug = new Pug("Cokelat terang", 27.3f, 7.3f, "Kecil", 'F', 4, "Cokelat gelap", "Kecil melengkung", 5, "Omnivora",true,"Pug", "Keriput", true);
        Chihuahua chihuahua = new Chihuahua("Cokelat", 17.3f, 2.1f, "Kecil", 'M', 3, "Cokelat gelap", "Besar dan terangkat", 4, "Karnivora",true,"Chihuahua");
        GermanSheperd germanSheperd = new GermanSheperd("Cokelat hitam", 63.4f, 38.4f, "Besar", 'F', 4, "Cokelat gelap", "Tegak meruncing", 8, "Karnivora",true,"German Sheperd");
        GoldenRetriever goldenRetriever = new GoldenRetriever("Emas keemasan", 57.3f, 30.4f, "Sedang", 'M', 4, "Cokelat gelap", "Letoy turun", 7, "Omnivora",true, "Golden Retriever");
        LabradorRetriever labradorRetriever = new LabradorRetriever("Hitam", 58.3f, 32.4f, "Sedang", 'M', 4, "Hazel", "Tegak dengan ujung bulat", 10, "Karnivora",true,"Labrador Retriever");
        SiberianHusky siberianHusky = new SiberianHusky("Abu-abu", 54.3f, 22.4f, "Sedang", 'F', 4, "Biru", "Tegak", 7, "Karnivora",true,"Siberian Husky");

        listAnjing.add(komondor);
        listAnjing.add(poodle);
        listAnjing.add(bulldog);
        listAnjing.add(shihTzu);
        listAnjing.add(pug);
        listAnjing.add(chihuahua);
        listAnjing.add(germanSheperd);
        listAnjing.add(goldenRetriever);
        listAnjing.add(labradorRetriever);
        listAnjing.add(siberianHusky);
        


        int i = 1;

        System.out.printf("*********************************************************************************************************%n");
        System.out.printf("|                                            ~~ Pet Shop ~~                                             |%n");
        
        System.out.printf("*********************************************************************************************************%n");
        System.out.printf("| %-3s | %-18s | %-10s | %8s | %-12s | %-30s |%n", "No.", "Jenis Anjing", "Ukuran", "Jadwal Makan", "Status Makan", "Status");
        System.out.printf("*********************************************************************************************************%n");
        for(Dogs dog:listAnjing){
            System.out.printf("| %-3s | %-18s | %-10s | %8s | %-12s | %-30s |%n", i, dog.getJenisAnjing(), dog.getUkuran(), dog.getMamamKali() + " Kali Sehari",(dog.isSudahMakan()) ? "Sudah" : "Belum", (dog.isSudahMakan()) ? "I'll go turu in my cage":"Woof woof wooof!");
            i++;
        }
        System.out.printf("*********************************************************************************************************%n");

        // komondor.display();
        // poodle.display();
        // bulldog.display();
        // shihTzu.display();
        // pug.display();
    }

}
