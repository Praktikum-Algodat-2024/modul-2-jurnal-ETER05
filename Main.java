public class Main {
    public static void main(String[] args){
        Queue DaftarKarakter = new Queue();

        // Kazuma
        DaftarKarakter.enqueue("Kazuma", 0, "Tidak Ada");
        DaftarKarakter.push("Kazuma", "Belajar Java", "Raysen", "Edukasi", "Buku Biasa");
        DaftarKarakter.push("Kazuma", "Cara Menjadi Orang Kaya", "Teguh", "Fantasi", "Buku Biasa");
        //Hu Tao
        DaftarKarakter.enqueue("Hu Tao",0, "Ada");
        DaftarKarakter.push("Hu Tao", "Cara Tidur Cepat", "Teguh", "Edukasi Kayaknya", "Cursed");
        DaftarKarakter.push("Hu Tao", "Belajar C++", "Raysen", "Edukasi", "Buku Biasa");
        DaftarKarakter.push("Hu Tao", "Belajar Ilmu Hitam", "Megumin", "Uknown", "Cursed");
        // Kafka
        DaftarKarakter.enqueue("Kafka", 0, "Tidak ada");
        DaftarKarakter.push("Kafka", "Raysen the Forgotten One", "Unknown", "Sejarah", "Cursed");
        DaftarKarakter.push("Kafka", "Misteri Menghilangnya Nasi Puyung", "Optimus", "Misteri", "Buku Biasa");
        DaftarKarakter.push("Kafka", "Cara Menjadi Milioner Dalam 1 Jam", "Master Oogway", "Edukasi", "Buku Biasa");
        // Xiangling
        DaftarKarakter.enqueue("Xiangling", 0, "Tidak ada");
        DaftarKarakter.push("Xiangling", "Crime and Punishment", "Fyodor Dovtoesky", "Psychology", "Buku Biasa");

        DaftarKarakter.printqueue();
        System.out.println("                      DEQUEUE");
        DaftarKarakter.dequeue();
        System.out.println("                      DEQUEUE 2");
        DaftarKarakter.dequeue();
        System.out.println("                   ANTRIAN SEKARANG");
        DaftarKarakter.printqueue();

        //SUCROSE
        DaftarKarakter.enqueue("Sucrose", 0, "Ada");
        DaftarKarakter.push("Sucrose","Durin the Forgotten Dragon", "Gold", "Misteri", "Buku Biasa");
        DaftarKarakter.push("Sucrose","Alhcemy", "Albedo", "Sience", "Cursed");
        DaftarKarakter.push("Sucrose","Resurection", "Unknown", "Unknown", "Cursed");

        DaftarKarakter.printqueue();
        DaftarKarakter.delete("Xiangling");
        DaftarKarakter.printqueue();
        DaftarKarakter.swap("Kafka", "Sucrose");
        System.out.println("                      DEQUEUE 3");
        DaftarKarakter.dequeue();
        DaftarKarakter.printqueue();
        System.out.println("                      DEQUEUE 3");
        DaftarKarakter.dequeue();
        DaftarKarakter.printqueue();
        System.out.println("                      DEQUEUE 4");
        DaftarKarakter.dequeue();
        DaftarKarakter.printqueue();
    }
}
