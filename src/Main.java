import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Pemesanan Tiket!");
        // membuat objek scanner untuk menerima input dari user
        java.util.Scanner input = new java.util.Scanner(System.in);

        // meminta user untuk memasukkan nama pemesan
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = input.nextLine();

        // menampilkan opsi jenis tiket kepada user
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");

        // meminta user untuk memilih jenis tiket
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        // menutup objek scanner setelah selesai digunakan
        input.close();

        TiketKonser tiket = null;
        // membuat objek tiket berdasarkan pilihan pengguna menggunakan switch-case
        switch (pilihan) {
            case 1:
                tiket = new CAT8(); // membuat objek tiket cat8
                break;
            case 2:
                tiket = new CAT1(); // membuat objek tiket cat1
                break;
            case 3:
                tiket = new FESTIVAL(); // membuat objek tiket festival
                break;
            case 4:
                tiket = new VIP(); // membuat objek tiket vip
                break;
            case 5:
                tiket = new VVIP(); // membuat objek tiket vvip
                break;
            default:
                System.out.println("Pilihan tidak valid."); // menampilkan pesan kesalahan jika pilihan tidak valid
                return; // keluar dari program jika pilihan tidak valid
        }

        // membuat objek pemesanan tiket dengan data yang diberikan pengguna
        PemesananTiket pesanan = new PemesananTiket(namaPemesan, tiket);
        // mencetak nota pesanan
        pesanan.cetakNota();
    }

    // metode untuk menghasilkan kode booking secara acak
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */

    // metode untuk mendapatkan tanggal saat ini dalam format yang diinginkan
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}