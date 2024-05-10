// kelas abstrak yang merupakan superclass untuk semua jenis tiket konser
abstract class TiketKonser implements HargaTiket {
    // metode abstrak untuk mendapatkan nama tiket
    public abstract String getNama();
    // metode abstrak untuk mendapatkan harga tiket
    public abstract double getHarga();
}