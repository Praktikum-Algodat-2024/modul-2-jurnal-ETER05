public class Buku {
    String JudulBuku, Pengarang, Genre, StatusBuku;
    Buku next;

    Buku(String inputJudulBuku, String inputPengarang, String inputGenre, String inputStatusBuku){
        this.JudulBuku = inputJudulBuku;
        this.Pengarang = inputPengarang;
        this.Genre = inputGenre;
        this.StatusBuku = inputStatusBuku;
        this.next = null;
    }
}
