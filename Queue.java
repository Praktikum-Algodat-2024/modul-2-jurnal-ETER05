public class Queue {//QUEUE AND STACK
    Karakter front, rear;

    void enqueue(String Nama, int JumlahBuku, String Kartu){
        Karakter NewKarakter = new Karakter(Nama, JumlahBuku, Kartu);
        if(rear == null){
            front = NewKarakter;
            rear = NewKarakter;
        }else{
            rear.next = NewKarakter;
            rear = NewKarakter;
            rear.next = null;
        }
    }//------------------------------------------------------

    void dequeue(){
        if(rear == null){
            System.out.println("Tidak ada karakter yang mengantri");
        }else{
            Karakter current = front;
            Buku IterasiBuku = current.top;
            int cursedCount = 0;

            while (IterasiBuku != null) {
                if (IterasiBuku.StatusBuku == "Cursed") {
                    cursedCount++;
                }
                IterasiBuku = IterasiBuku.next;
            }

            if (cursedCount > 0 && front.Kartu == "Tidak ada") {
                arrangecursed(front.Nama);
                printstack(front.Nama);
                for (int i = 0; i < cursedCount; i++){
                    front.pop();
                }
                System.out.println(front.Nama + " memiliki Buku terkutuk dan tidak memiliki kartu spesial");
                return;
            }

            printstack(front.Nama);
            front = front.next;
            if(front == null){
                rear = null;
            }
        }
    }//------------------------------------------------------

    void delete(String nama) {
        if (front == null) {
            System.out.println("Tidak ada yang mengantri");
            return;
        }

        if (front.Nama == nama){
            front = front.next;
            System.out.println(nama + " telah keluar dari antrian");
            return;
        }

        Karakter temp = front;
        Karakter prev = null;

        while (temp != null && temp.Nama != nama){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Nama tidak ditemukan");
            return;
        }
        prev.next = temp.next;
        System.out.println(nama + " Telah pergi");
    }//------------------------------------------------------

    void arrangecursed(String nama) {
        if (front == null) {
            System.out.println("List is empty.");
            return;
        }
        Karakter currentDaftar = front;
        while (currentDaftar != null && currentDaftar.Nama != nama) {
            currentDaftar = currentDaftar.next;
        }

        if (currentDaftar == null) {
            System.out.println(nama + " tidak ditemukan.");
            return;
        }

        Buku current = currentDaftar.top;
        Buku cursedHead = null;
        Buku cursedTail = null;
        Buku nonCursedHead = null;
        Buku nonCursedTail = null;

        while (current != null) {
            Buku nextBook = current.next;

            if (current.StatusBuku == "Cursed") {
                if (cursedHead == null) {
                    cursedHead = current;
                    cursedTail = current;
                } else {
                    cursedTail.next = current;
                    cursedTail = current;
                }
            } else {
                if (nonCursedHead == null) {
                    nonCursedHead = current;
                    nonCursedTail = current;
                } else {
                    nonCursedTail.next = current;
                    nonCursedTail = current;
                }
            }
            current.next = null;
            current = nextBook;
        }
        if (cursedTail != null) {
            cursedTail.next = nonCursedHead;
            currentDaftar.top = cursedHead;
        } else {
            currentDaftar.top = nonCursedHead;
        }
        System.out.println("Buku Cursed Sudah diatur ke atas untuk " + nama);
    }//------------------------------------------------------

    void printqueue(){
        Karakter current = front; int i = 1;
        System.out.println("======================================================");
        System.out.println("=                   DAFTAR ANTRIAN                   =");
        while(current != null){
            System.out.println("======================================================");
            System.out.println("Nama : " + current.Nama
                    + "\nAntrian ke : " + (i++)
                    + "\nJumlah Buku : " + current.JumlahBuku
                    + "\nKartu Spesial : " + current.Kartu
            );
            System.out.println("======================================================");
            current = current.next;
        }
    }//------------------------------------------------------

    void swap(String Nama, String Nama2) {
        if (Nama == Nama2) {
            System.out.println("Tidak bisa menukar nama yang sama");
            return;
        }
        Karakter prevone = null, currone = front;
        Karakter prevtwo = null, currtwo = front;

        while (currone != null && currone.Nama != Nama) {
            prevone = currone;
            currone = currone.next;
        }
        while (currtwo != null && currtwo.Nama != Nama2) {
            prevtwo = currtwo;
            currtwo = currtwo.next;
        }
        if (currone == null || currtwo == null) {
            System.out.println("Nama tidak ada di antrian");
            return;
        }
        if (prevone != null) {
            prevone.next = currtwo;
        } else {
            front = currtwo;
        }
        if (prevtwo != null) {
            prevtwo.next = currone;
        } else {
            front = currone;
        }
        Karakter temp = currone.next;
        currone.next = currtwo.next;
        currtwo.next = temp;

        System.out.println(Nama + " dan " + Nama2 + " telah bertukar tempat ");
        printqueue();
    }//------------------------------------------------------

    void push(String Nama, String judul, String pengarang, String genre, String status){
        Karakter current = front;
        while(current != null){
            if(current.Nama.equals(Nama)){
                current.push(judul, pengarang, genre,status);
                return;
            }
            current = current.next;
        }
        System.out.println("Nama tidak ditemukan");
    }

    void printstack(String Nama) {
        Karakter current = front;
        if (current.Nama == Nama) {
            Buku IterasiBuku = current.top;
            System.out.println("======================================================");
            System.out.println("                     Buku " + Nama);
            while (IterasiBuku != null) {
                System.out.println("======================================================");
                System.out.println("Judul Buku : " + IterasiBuku.JudulBuku
                        + "\nPengarang : " + IterasiBuku.Pengarang
                        + "\nGenre : " + IterasiBuku.Genre
                        + "\nStatus Buku : " + IterasiBuku.StatusBuku
                );
                System.out.println("======================================================");
                IterasiBuku = IterasiBuku.next;
            }
        }
    }//------------------------------------------------------
}
