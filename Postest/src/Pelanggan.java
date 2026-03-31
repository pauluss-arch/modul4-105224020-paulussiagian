class DompetDigital {
    private double saldo = 0.0;

    public void tambahDana(double jumlah) {
        if (jumlah < 10000) {
            System.out.println("[PERINGATAN KERAS] Nominal di bawah Rp 10.000! Transaksi diblokir.");
        } else {
            this.saldo += jumlah;
            System.out.println("Setoran Berhasil : Rp " + jumlah);
            System.out.println("Saldo Sekarang   : Rp " + this.saldo);
        }
    }

    public boolean bayar(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            System.out.println("[KONFIRMASI] Sinyal Berhasil: Tagihan Rp " + jumlah + " telah dilunasi.");
            return true;
        } else {
            System.out.println("[KEGAGALAN MUTLAK] Dana tidak cukup! Transaksi dibatalkan.");
            return false;
        }
    }

    public void cetakSaldo() {
        System.out.println("Sisa Saldo     : Rp " + this.saldo);
    }
}

public class Pelanggan {
    private String namaLengkap;
    private String nomorPonsel;
    private DompetDigital dompet;

    public Pelanggan(String nama, String nomor) {
        this.namaLengkap = nama;
        this.nomorPonsel = nomor;
        this.dompet = new DompetDigital();
    }

    public void melakukanSetoran(double nominal) {
        dompet.tambahDana(nominal);
    }

    public void membayarTagihan(double nominal) {
        dompet.bayar(nominal);
    }

    public void tampilkanStatus() {
        System.out.println("Nama Pelanggan : " + namaLengkap);
        System.out.println("Nomor Ponsel   : " + nomorPonsel);
        dompet.cetakSaldo();
    }
}