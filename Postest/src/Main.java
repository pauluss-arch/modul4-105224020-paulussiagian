import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" PENDAFTARAN PELANGGAN BARU DUITKU ");
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nomor Ponsel: ");
        String hp = input.nextLine();

        Pelanggan anton = new Pelanggan(nama, hp);
        System.out.println("Pendaftaran Berhasil! Akun telah aktif.");

        System.out.println(" AKTIVITAS 1: SETORAN PERTAMA ");
        System.out.print("Masukkan Nominal Setoran : ");
        anton.melakukanSetoran(input.nextDouble());

        System.out.println(" AKTIVITAS 2: PELUNASAN TAGIHAN ");
        double tagihanListrik = 60000;
        System.out.println("Mencoba membayar tagihan listrik Rp " + tagihanListrik);
        anton.membayarTagihan(tagihanListrik);

        System.out.println(" AKTIVITAS 3: SETORAN TAMBAHAN ");
        System.out.print("Masukkan Nominal Setoran Lagi : ");
        anton.melakukanSetoran(input.nextDouble());

        System.out.println("AKTIVITAS 4: MENCOBA KEMBALI PELUNASAN");
        System.out.println("Mencoba membayar tagihan listrik Rp " + tagihanListrik);
        anton.membayarTagihan(tagihanListrik);

        anton.tampilkanStatus();
        input.close();
    }
}