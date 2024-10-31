public class Karakter {
    String Nama, Kartu;
    int JumlahBuku;
    Karakter next;
    Buku top;

    Karakter(String inputNama, int inputJumlahBuku, String inputKartu){
        this.Nama = inputNama;
        this.JumlahBuku = inputJumlahBuku;
        this.Kartu = inputKartu;
        this.next = null;
    }

    void push(String judul, String Pengarang, String Genre, String StatusBuku){
        Buku NewBuku = new Buku(judul, Pengarang, Genre, StatusBuku);
        NewBuku.next = top;
        top = NewBuku;
        JumlahBuku++;
    }

    void pop(){
        if (top == null){
            System.out.println("Tidak ada buku untuk dihapus");
        } else {
            top = top.next;
            JumlahBuku--;
        }
    }
}
