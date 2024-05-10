class PemesananTiket {
    private String namaPemesan;
    private TiketKonser tiket;
    private String kodeBooking;
    private String tanggalPesanan;

    // konstruktor untuk membuat objek pemesanan tiket
    public PemesananTiket(String namaPemesan, TiketKonser tiket) {
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.kodeBooking = Main.generateKodeBooking(); // menggunakan metode generateKodeBooking untuk kode acak
        this.tanggalPesanan = Main.getCurrentDate();
    }


    // metode untuk mencetak nota pesanan
    public void cetakNota() {
        System.out.println("----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket yang dipesan: " + tiket.getNama());
        System.out.println("Total harga: " + tiket.getHarga() + " USD");
    }
}